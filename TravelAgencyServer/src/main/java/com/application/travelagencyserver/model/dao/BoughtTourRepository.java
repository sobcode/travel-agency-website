package com.application.travelagencyserver.model.dao;

import com.application.travelagencyserver.model.entity.BoughtTour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoughtTourRepository extends JpaRepository<BoughtTour, Integer> {
}
