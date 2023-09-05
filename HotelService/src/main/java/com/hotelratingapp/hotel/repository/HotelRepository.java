package com.hotelratingapp.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotelratingapp.hotel.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

	
}
