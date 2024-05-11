package com.example.fleetapp.services;

import com.example.fleetapp.models.Country;
import com.example.fleetapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries(){
        return countryRepository.findAll();
    }
    public void save(Country country){
        countryRepository.save(country);
    }
}
