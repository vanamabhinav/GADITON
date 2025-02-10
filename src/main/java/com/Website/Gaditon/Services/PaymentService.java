package com.Website.Gaditon.Services;

import com.Website.Gaditon.Models.Payment;
import com.Website.Gaditon.Repositories.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}
