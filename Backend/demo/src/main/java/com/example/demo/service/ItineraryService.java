package com.example.demo.service;

import com.example.demo.model.Itinerary;
import com.example.demo.repository.ItineraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItineraryService {

    @Autowired
    private ItineraryRepository repo;

    // Save
    public Itinerary save(Itinerary detail) {
        return repo.save(detail);
    }

    // Get All
    public List<Itinerary> getAll() {
        return repo.findAll();
    }

    // Get by ID
    public Optional<Itinerary> getById(Long id) {
        return repo.findById(id);
    }

    // Update
    public Itinerary update(Long id, Itinerary newData) {
        return repo.findById(id).map(it -> {
            it.setFromDate(newData.getFromDate());
            it.setToDate(newData.getToDate());
            it.setDestination(newData.getDestination());
            it.setBudget(newData.getBudget());
            it.setGuide(newData.getGuide());
            it.setHotel(newData.getHotel());
            it.setNotes(newData.getNotes());
            return repo.save(it);
        }).orElseThrow(() -> new RuntimeException("Itinerary not found with id " + id));
    }

    // Count
    public long count() {
        return repo.count();
    }

    // Delete
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
