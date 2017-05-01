package com.coolweather.android.gson;

/**
 * Created by zjt on 17-4-29.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
