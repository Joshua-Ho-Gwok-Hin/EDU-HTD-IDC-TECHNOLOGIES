package com.idc.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idc.entity.Payment;
import com.idc.repository.PaymentRepository;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;

//	@Autowired
//	private RestTemplate restTemplate;
	
	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());
		
		payment.setTransactionId(UUID.randomUUID().toString());
		return  paymentRepository.save(payment);
	}

	private String paymentProcessing() {
		
		return new Random().nextBoolean()?"success":"fail";
	}

}
