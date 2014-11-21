package com.pauselabs.pause.listeners;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.util.Log;

import com.pauselabs.pause.PauseApplication;
import com.pauselabs.pause.core.Constants;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Passa on 11/20/14.
 */
public class LinearAccelerometerListener implements SensorEventListener {

    private final String TAG = LinearAccelerometerListener.class.getSimpleName();

    private Timer timer;

    @Override
    public void onSensorChanged(SensorEvent event) {
        boolean terminateSession = true;

        if (PauseApplication.isSleepTime()) {
            float x = Math.abs(event.values[0]), y = Math.abs(event.values[1]), z = Math.abs(event.values[2]);
            float stillConstant = Constants.Settings.STILL_CONSTANT;

            if (x <= stillConstant && y <= stillConstant && z <= stillConstant) {
                terminateSession = false;

                PauseApplication.setPhoneStill(true);

                if (timer == null) {
                    timer = new Timer("SpeedTestTimer");
                    timer.schedule(new TimerTask() {

                        @Override
                        public void run() {
                            // Phone is still not moving
                            // Activate Paüse via Sleep Mode
                            PauseApplication.checkForSleepMode();

                            timer = null;
                        }

                    }, (long) (Constants.Settings.STILL_ACCELEROMETER_TIME_OUT * 60 * 1000));
                }
            } else {
                PauseApplication.setPhoneStill(false);

                if (timer != null) {
                    timer.cancel();
                    timer = null;
                }
            }
        }

        if (terminateSession)
            PauseApplication.stopPauseService(Constants.Session.Destroyer.SLEEP);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
