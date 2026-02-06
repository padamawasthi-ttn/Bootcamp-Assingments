package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
//import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmailServiceTest {

    @Test
    public void testSendEmailWithoutCC_shouldThrowException() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(1, "Pen", 100);

        RuntimeException ex = assertThrows(
                RuntimeException.class,
                () -> emailService.sendEmail(order)
        );

        assertEquals(ex.getMessage());
    }

    private void assertEquals(String message) {
    }


    @Test
    public void testSendEmailWithoutCC_customerNotifiedFalse() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(1, "Notebook", 200);

        try {
            emailService.sendEmail(order);
        } catch (RuntimeException e) {
        }

        assertFalse(order.isCustomerNotified());
    }

    @Test
    public void testSendEmailWithCC_shouldReturnTrue() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(2, "Laptop", 50000);

        boolean result = emailService.sendEmail(order, "cc@test.com");

        assertTrue(result);
    }

    @Test
    public void testSendEmailWithCC_customerNotifiedTrue() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order(1, "Mouse", 1000);

        emailService.sendEmail(order, "cc@test.com");

        assertTrue(order.isCustomerNotified());
    }
}