package com.pauselabs.pause.core;

/**
 * Pause constants
 */
public class Constants {

    private Constants() {}

    public static final class Message {

        private Message() {}

        /**
         * SMS Intent
         */
        public static final String SMS_RECEIVED_INTENT = "android.provider.Telephony.SMS_RECEIVED";

        /**
         * SMS PDU (Protocol Data Unit) intent extra
         */
        public static final String PDUS_EXTRA = "pdus";

        /**
         * Message Bundle Identifier String
         */
        public static final String MESSAGE_BUNDLE = "MESSAGE_BUNDLE";

        /**
         * Message Parcel Identifier String
         */
        public static final String MESSAGE_PARCEL = "MESSAGE_PARCEL";

        /**
         * Missed call preference
         */
        public static final String MISSED_CALL_PREFERENCE = "MISSED_CALL_PREFERENCE";

        /**
         * Missed phone call older state
         */
        public static final String PREFERENCE_OLDER_PHONE_STATE = "olderPhoneState";

        /**
         * Last missed call time
         */
        public static final String PREFERENCE_LAST_MISSED_CALL_TIME = "lastMissedCallTime";

        /**
         * Phone State Change Filter
         */
        public static final String PHONE_STATE_CHANGE_INTENT = "android.intent.action.PHONE_STATE";

        /**
         * Phone Silence Filer
         */
        public static final String PHONE_SILENCE_INTENT = "android.media.RINGER_MODE_CHANGED";

        /**
         * Phone Number incoming call
         */
        public static final String PREFERENCE_LAST_CALL_NUMBER = "PREFERENCE_LAST_CALL_NUMBER";

        /**
         * Pause Message SMS type
         */
        public static final String SMS_TYPE = "SMS";

        /**
         * Pause Message MMS type
         */
        public static final String MMS_TYPE = "MMS";

        /**
         * Pause Message Phone type
         */
        public static final String PHONE_TYPE = "CALL";

        /**
         * Message recipient
         */
        public static final String PAUSE_MESSAGE_RECIPIENT_EXTRA = "PAUSE_MESSAGE_RECIPIENT_EXTRA";

        /**
         * Message Subject
         */
        public static final String SUBJECT = "Pause Message";

        /**
         * Message sent upon slienced
         */
        public static final String SLIENCE = "I'm currently away from my phone at the moment. I'll get back to you ASAP.";

        /**
         * Message sent upon driving
         */
        public static final String DRIVE = "I'm currently behind the wheel of a moving vehicle. I'll get back to you once I reach my destination.";

        /**
         * Message sent upon sleeping
         */
        public static final String SLEEP = "I'm catching a few Z's at the moment because I'm a normal human being. I'll get back to you when I am cognizant.";
    }

    public static final class Session {

        private Session() {}

        public static final class Destroyer extends Creator { private Destroyer() {} }

        public static class Creator {

            private Creator() {}

            /**
             * Pause session created from custom message
             */
            public static final int CUSTOM = 0;

            /**
             * Pause session created from silence mode
             */
            public static final int SILENCE = 1;

            /**
             * Pause session created from driving mode
             */
            public static final int DRIVE = 2;

            /**
             * Pause session created from sleep mode
             */
            public static final int SLEEP = 3;

        }

    }

    public static final class Pause {

        private Pause() {}

        /**
         * Pause Bundle Identifier String
         */
        public static final String PAUSE_BUNDLE = "PAUSE_BUNDLE";

        /**
         * Pause Parcel Identifier String
         */
        public static final String PAUSE_PARCEL = "PAUSE_PARCEL";

        /**
         * Number of messages received that will trigger the sending of second bounce back
         */
        public static final int SECOND_BOUNCE_BACK_TRIGGER = 2;

        /**
         * Pause secondary Bounce Back message text
         */
        public static final String SECONDARY_BOUNCE_BACK_MESSAGE_TEXT = "You are receiving this auto response courtesy of Pause Away Messenger";

        /**
         * Pause Session Active
         */
        public static final int PAUSE_SESSION_STATE_ACTIVE = 0;

        /**
         * Pause Session Stopped
         */
        public static final int PAUSE_SESSION_STATE_STOPPED = 1;

        /**
         * Current Pause Message Parcel
         */
        public static final String PAUSE_MESSAGE_PARCEL = "PAUSE_MESSAGE_PARCEL";

        /**
         * Active Pause Message id saved in database
         */
        public static final String ACTIVE_PAUSE_DATABASE_ID_PREFS = "ACTIVE_PAUSE_DATABASE_ID_PREFS";

        /**
         * Edit Pause message extra
         */
        public static final String EDIT_PAUSE_MESSAGE_ID_EXTRA = "EDIT_PAUSE_MESSAGE_ID_EXTRA";
    }

    public static final class Mms {
        private Mms() {}

        /**
         * MMS byte array stored in intent extra
         */
        public static final String MMS_BYTE_ARRAY_EXTRA = "MMS_BYTE_ARRAY_EXTRA";

        /**
         * Intent Action MMS Received
         */
        public static final String ACTION_MMS_RECEIVED = "android.provider.Telephony.WAP_PUSH_RECEIVED";

        /**
         * MMS message data type
         */
        public static final String MMS_DATA_TYPE = "application/vnd.wap.mms-message";
    }

    public static class Notification {
        private Notification() {
        }


        public static final int SESSION_NOTIFICATION_ID = 1000; // Why 1000? Why not? :)
        public static final int LOW_BATTERY_NOTIFICATION_ID = 1001;

        public static final int STOP_PAUSE_SESSION = 1002;
        public static final int EDIT_PAUSE_SESSION = 1003;
        public static final int NOT_SLEEPING = 1004;
        public static final int NOT_DRIVER = 1005;

        public static final String PAUSE_NOTIFICATION_INTENT = "PAUSE_NOTIFICATION_INTENT";
        public static final String PAUSE_NOTIFICATION_STOP_SESSION  = "PAUSE_NOTIFICATION_STOP_SESSION";

        public static final String LOW_BATTERY_MESSAGE = "Low battery, start a Pause?";
    }

    public static class Settings {
        private Settings() {
        }

        public static final String NAME = "NAME_KEY";
        public static final String REPLY_MISSED_CALL = "REPLY_MISSED_CALL_KEY";
        public static final String REPLY_SMS = "REPLY_SMS_KEY";
        public static final String USING_BLACKLIST = "USING_BLACKLIST";
        public static final String BLACKLIST = "BLACKLIST";

        /**
         * M/S^2 acceleration in either x, y, or z axis
         */
        public static final float STILL_CONSTANT = 2.5f;

        /**
         * Time (in minutes) until the still accelerometer TimerTask times out
         */
        public static final float STILL_ACCELEROMETER_TIME_OUT = 10;

        /**
         * Time to activate Sleep Mode.
         */
        public static final int SLEEP_TIME_START = 23;

        /**
         * Time to deactivate Sleep Mode.
         */
        public static final int SLEEP_TIME_STOP = 7;
    }

    public static class Privacy {
        private Privacy() {}

        public static final String CONTACTS_ONLY = "Contacts Only";
        public static final String EVERYBODY = "Everybody";
        public static final String NOBODY = "Nobody";
    }
}
