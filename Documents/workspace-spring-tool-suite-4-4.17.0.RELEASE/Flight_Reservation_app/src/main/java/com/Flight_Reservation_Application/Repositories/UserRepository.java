package com.Flight_Reservation_Application.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_Reservation_Application.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
