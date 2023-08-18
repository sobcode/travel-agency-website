package com.application.travelagencyserver.controller;

import com.application.travelagencyserver.exception.WrongIdWhileCreateOrUpdateException;
import com.application.travelagencyserver.model.Tour;
import com.application.travelagencyserver.service.interfaces.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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
        return ResponseEntity.ok(
                tourService.findTourById(tourId));
    }

    @PostMapping("/")
    public ResponseEntity<Tour> addTour(@RequestBody Tour tour) throws WrongIdWhileCreateOrUpdateException {
        return ResponseEntity.ok(
                tourService.addTour(tour));
    }

    @PutMapping("/")
    public ResponseEntity<Tour> updateTour(@RequestBody Tour tour) throws WrongIdWhileCreateOrUpdateException {
        return ResponseEntity.ok(
                tourService.updateTour(tour));
    }

    @DeleteMapping("/{tourId}")
    public ResponseEntity<Tour> deleteTour(@PathVariable int tourId) {
        tourService.deleteTourById(tourId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
