package com.example.fleetapp.repositories;

import com.example.fleetapp.models.Contact;
import com.example.fleetapp.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
