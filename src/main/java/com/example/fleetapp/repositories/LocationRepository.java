package com.example.fleetapp.repositories;

import com.example.fleetapp.models.Contact;
import com.example.fleetapp.models.Location;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
}
