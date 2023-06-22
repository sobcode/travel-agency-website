package com.application.travelagencyserver.model.dao;

import com.application.travelagencyserver.model.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Integer> {
}
