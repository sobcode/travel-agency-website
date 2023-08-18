package com.application.travelagencyserver.repository;

import com.application.travelagencyserver.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour, Integer> {
}
