package com.Flight_Reservation_Application.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_Reservation_Application.Entities.Flights;

public interface FlightRepository extends JpaRepository<Flights, Long> {

}
