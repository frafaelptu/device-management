package com.frafael.sensors.device.management.api.client;

import io.hypersistence.tsid.TSID;

public interface SensorMonitoringClient {

    void enaleMonitoring(TSID sensorId);
    void disableMonitoring(TSID sensorId);
}
