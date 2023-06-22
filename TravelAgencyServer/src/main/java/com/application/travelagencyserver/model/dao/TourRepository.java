package com.application.travelagencyserver.model.dao;

import com.application.travelagencyserver.model.entity.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour, Integer> {
}
