package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.BookingFormCrud;
import com.example.model.BookingForm;
@Service
public class BookingFormServiceimpl implements BookingFormService {
	private BookingFormCrud  bookingFormCrud;
	
    @Autowired
	public void setBookingFormCrud(BookingFormCrud bookingFormCrud) {
		this.bookingFormCrud = bookingFormCrud;
	}


	@Override
	public BookingForm saveBookingFormService(BookingForm bookingForm) {
		
		return bookingFormCrud.save(bookingForm);
		
		
		
	}

}
