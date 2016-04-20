package com.amt.petclinic.service;

import java.util.List;

import com.amt.petclinic.domain.Payment;

public interface PaymentService {

	public void create(Payment payment);

	public void delete(int id);

	public List<Payment> findAll();

	public void update(Payment payment);

	public Payment findById(int id);

}
