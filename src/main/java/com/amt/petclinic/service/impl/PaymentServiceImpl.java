package com.amt.petclinic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.amt.petclinic.domain.Payment;
import com.amt.petclinic.repository.PaymentRepository;
import com.amt.petclinic.service.PaymentService;

@Component
@Transactional
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public void create(Payment payment) {
		paymentRepository.save(payment);
	}

	@Override
	public List<Payment> findAll() {
		return paymentRepository.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Payment payment) {
		// TODO Auto-generated method stub

	}

	@Override
	public Payment findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
