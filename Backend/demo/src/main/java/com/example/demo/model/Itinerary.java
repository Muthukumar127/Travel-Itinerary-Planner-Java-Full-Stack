package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "travel_db")
public class Itinerary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 👤 User Info
    private String name;
    private int numberOfTravellers;
    private String phoneNo;

    // 📅 Travel details
    private String fromDate;
    private String toDate;
    private String destination;
    private String budget;

    // ✅ Stored as Yes/No (from frontend checkboxes)
    private String guide;  
    private String hotel;

    // 📝 Notes
    private String notes;
    private String other;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getNumberOfTravellers() { return numberOfTravellers; }
    public void setNumberOfTravellers(int numberOfTravellers) { this.numberOfTravellers = numberOfTravellers; }

    public String getPhoneNo() { return phoneNo; }
    public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }

    public String getFromDate() { return fromDate; }
    public void setFromDate(String fromDate) { this.fromDate = fromDate; }

    public String getToDate() { return toDate; }
    public void setToDate(String toDate) { this.toDate = toDate; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getBudget() { return budget; }
    public void setBudget(String budget) { this.budget = budget; }

    public String getGuide() { return guide; }
    public void setGuide(String guide) { this.guide = guide; }

    public String getHotel() { return hotel; }
    public void setHotel(String hotel) { this.hotel = hotel; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    public String getOther() { return other; }
    public void setOther(String other) { this.other = other; }
}
