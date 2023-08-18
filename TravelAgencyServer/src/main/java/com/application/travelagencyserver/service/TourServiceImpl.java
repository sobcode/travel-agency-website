package com.application.travelagencyserver.service;

import com.application.travelagencyserver.exception.WrongIdWhileCreateOrUpdateException;
import com.application.travelagencyserver.repository.TourRepository;
import com.application.travelagencyserver.model.Tour;
import com.application.travelagencyserver.service.interfaces.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TourServiceImpl implements TourService {

    private TourRepository tourRepository;

    @Autowired
    public TourServiceImpl(TourRepository tourRepository){
        this.tourRepository = tourRepository;
    }

    @Override
    public Tour addTour(Tour tour) throws WrongIdWhileCreateOrUpdateException{
        if(tour.getId() != 0) {
            throw new WrongIdWhileCreateOrUpdateException("Tour id must be 0 while creating!");
        }

        return tourRepository.save(tour);
    }

    @Override
    public Tour updateTour(Tour tour) throws WrongIdWhileCreateOrUpdateException {
        if(tour.getId() == 0) {
            throw new WrongIdWhileCreateOrUpdateException("Tour id must be specified while updating!");
        }

        return tourRepository.save(tour);
    }

    @Override
    public void deleteTourById(int id) {
        if(findTourById(id) == null) {
            throw new NoSuchElementException("There is no tour with id " + id + " in the database!");
        }

        tourRepository.deleteById(id);
    }

    @Override
    public List<Tour> findAllTours() {
        return tourRepository.findAll();
    }

    @Override
    public Tour findTourById(int id) {
        Optional<Tour> optional = tourRepository.findById(id);
        Tour tour = null;

        if(optional.isPresent()){
            tour = optional.get();
        }
        return tour;
    }
}
