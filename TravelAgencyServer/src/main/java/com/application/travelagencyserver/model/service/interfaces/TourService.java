package com.application.travelagencyserver.model.service.interfaces;

import com.application.travelagencyserver.model.entity.Tour;

import java.util.List;

public interface TourService {
    Tour saveTour(Tour tour);

    void deleteTourById(int id);

    List<Tour> findAllTours();

    Tour findTourById(int id);
}
