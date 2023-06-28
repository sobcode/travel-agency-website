package com.application.travelagencyserver.controller;

import com.application.travelagencyserver.model.Tour;
import com.application.travelagencyserver.service.interfaces.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tours")
public class TourController {

    private final TourService tourService;

    @Autowired
    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Tour>> getAllTours() {
        return ResponseEntity.ok(tourService.findAllTours());
    }

    @GetMapping("/{tourId}")
    public ResponseEntity<Tour> getTour(@PathVariable int tourId) {
        return ResponseEntity.ok(tourService.findTourById(tourId));
    }

    @PostMapping("/")
    public ResponseEntity<Tour> addTour(@RequestBody Tour tour){
        tour = tourService.saveTour(tour);

        return ResponseEntity.ok(tour);
    }

}
