package com.pauselabs.pause.services;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.IBinder;
import android.util.Log;

import com.pauselabs.pause.core.Constants;
import com.pauselabs.pause.listeners.LinearAccelerometerListener;
import com.pauselabs.pause.listeners.MagneticFieldListener;
import com.pauselabs.pause.listeners.PLocationListener;
import com.pauselabs.pause.listeners.PhoneChargingListener;
import com.pauselabs.pause.listeners.SilenceListener;

/**
 * Created by Passa on 11/20/14.
 */
public class PauseApplicationService extends Service {

    private final String TAG = PauseApplicationService.class.getSimpleName();

    private PLocationListener pLocationListener;
    private LocationManager locationManager;

    private LinearAccelerometerListener accelerometerListener;
    private MagneticFieldListener magnetronListener;
    private SensorManager sensorManager;
    private Sensor accelerometer;
    private Sensor magnetron;

    private PhoneChargingListener chargingListener;

    private SilenceListener silenceListener;

    @Override
    public void onCreate() {
        super.onCreate();

//        Injector.inject(this);
    }

    @Override
    public void onDestroy() {
        locationManager.removeUpdates(pLocationListener);
        sensorManager.unregisterListener(accelerometerListener);
        sensorManager.unregisterListener(magnetronListener);
        unregisterReceiver(chargingListener);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "Pause Application Service Start Command");

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        accelerometerListener = new LinearAccelerometerListener();
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION);
        sensorManager.registerListener(accelerometerListener,accelerometer,SensorManager.SENSOR_DELAY_NORMAL);

//        magnetronListener = new MagneticFieldListener();
//        magnetron = sensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD);
//        sensorManager.registerListener(magnetronListener,magnetron,SensorManager.SENSOR_DELAY_NORMAL);

        pLocationListener = new PLocationListener();
        locationManager = (LocationManager)getSystemService(LOCATION_SERVICE);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,2000,0,pLocationListener);

        chargingListener = new PhoneChargingListener();
        IntentFilter chargingIntentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(chargingListener,chargingIntentFilter);

        silenceListener = new SilenceListener();
        IntentFilter silenceIntentFilter = new IntentFilter(Constants.Message.PHONE_SILENCE_INTENT);
        registerReceiver(silenceListener,silenceIntentFilter);

        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) { return null; }
}
