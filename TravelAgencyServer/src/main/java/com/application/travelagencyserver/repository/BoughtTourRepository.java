package com.application.travelagencyserver.repository;

import com.application.travelagencyserver.model.BoughtTour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoughtTourRepository extends JpaRepository<BoughtTour, Integer> {
}
