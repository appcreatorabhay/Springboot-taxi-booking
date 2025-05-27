package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ContactFormCrud;
import com.example.model.ContactForm;

@Service
public class ContactFormServiceImpl implements ContactFormService {
	private ContactFormCrud contactFormCrud;
	
	@Autowired
	public void setContactFormCrud(ContactFormCrud contactFormCrud) {
		this.contactFormCrud = contactFormCrud;
	}

	@Override
	public ContactForm saveContactFormService(ContactForm contactForm) {
	    return contactFormCrud.save(contactForm); // ✅ correct method
	}
}
