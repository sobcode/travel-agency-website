package com.application.travelagencyserver.service.interfaces;

import com.application.travelagencyserver.model.Tour;

import java.util.List;

public interface TourService {
    Tour saveTour(Tour tour);

    void deleteTourById(int id);

    List<Tour> findAllTours();

    Tour findTourById(int id);
}
