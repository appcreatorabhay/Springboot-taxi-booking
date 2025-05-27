package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.BookingForm;
@Repository
public interface BookingFormCrud extends JpaRepository<BookingForm,Integer>{
	
	@Override
	public <S extends BookingForm> S save(S entity);
	

}
