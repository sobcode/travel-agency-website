package com.application.travelagencyserver.service.interfaces;

import com.application.travelagencyserver.exception.WrongIdWhileCreateOrUpdateException;
import com.application.travelagencyserver.model.Tour;

import java.util.List;

public interface TourService {
    Tour addTour(Tour tour) throws WrongIdWhileCreateOrUpdateException;

    Tour updateTour(Tour tour) throws WrongIdWhileCreateOrUpdateException;

    void deleteTourById(int id);

    List<Tour> findAllTours();

    Tour findTourById(int id);
}
