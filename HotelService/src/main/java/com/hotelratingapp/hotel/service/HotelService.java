package com.hotelratingapp.hotel.service;

import java.util.List;

import com.hotelratingapp.hotel.entity.Hotel;

public interface HotelService {

	Hotel create (Hotel hotel);
	List<Hotel> getAll();
	Hotel get(String id);
	
}
