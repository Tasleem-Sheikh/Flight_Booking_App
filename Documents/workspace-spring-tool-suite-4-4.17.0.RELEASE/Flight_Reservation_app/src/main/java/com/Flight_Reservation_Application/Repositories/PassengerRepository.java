package com.Flight_Reservation_Application.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_Reservation_Application.Entities.Passengers;

public interface PassengerRepository extends JpaRepository<Passengers, Long> {

}
