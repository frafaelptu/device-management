package com.frafael.sensors.device.management.domain.repository;

import com.frafael.sensors.device.management.domain.model.Sensor;
import com.frafael.sensors.device.management.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, SensorId> {
}
