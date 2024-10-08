package com.example.smartcitymanagement.controllers;

import com.example.smartcitymanagement.models.City;
import com.example.smartcitymanagement.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getAllCities() {
        return cityService.getAllCities();
    }

    @GetMapping("/{id}")
    public City getCityById(@PathVariable Long id) {
        return cityService.getCityById(id);
    }

    @PostMapping
    public City addCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @PutMapping("/{id}")
    public City updateCity(@PathVariable Long id, @RequestBody City updatedCity) {
        City city = cityService.getCityById(id);
        city.setName(updatedCity.getName());
        city.setRegion(updatedCity.getRegion());
        city.setPopulation(updatedCity.getPopulation());
        return cityService.saveCity(city);
    }

    @DeleteMapping("/{id}")
    public void deleteCity(@PathVariable Long id) {
        cityService.deleteCity(id);
    }
}
