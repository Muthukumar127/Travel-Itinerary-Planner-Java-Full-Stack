package com.example.demo.controller;

import com.example.demo.model.Itinerary;
import com.example.demo.service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/itineraries")
@CrossOrigin(origins = "http://localhost:3000") // Allow React
public class ItineraryController {

    @Autowired
    private ItineraryService service;

    // Create
    @PostMapping("/add")
    public Itinerary add(@RequestBody Itinerary detail) {
        return service.save(detail);
    }

    // Read all
    @GetMapping("/getAll")
    public List<Itinerary> getAll() {
        return service.getAll();
    }

    // Read by ID
    @GetMapping("/get/{id}")
    public Optional<Itinerary> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    // Update
    @PutMapping("/update/{id}")
    public Itinerary update(@PathVariable Long id, @RequestBody Itinerary newData) {
        return service.update(id, newData);
    }

    // Count
    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "Deleted itinerary with id " + id;
    }
}
