package com.Flight_Reservation_Application.Entities;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

}
