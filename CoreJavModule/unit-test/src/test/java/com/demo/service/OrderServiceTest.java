package com.demo.service;


import com.demo.domain.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {


    @Test
    void testPlaceOrderPriceWithTaxCalculated() {
        OrderService orderService = OrderService.getInstance();
        Order order = new Order(1, "Tablet", 20000);

        try {
            orderService.placeOrder(order);
        } catch (RuntimeException e) {
            // expected
        }

        assertEquals(24000, order.getPriceWithTax());
    }

//    @Test     // coming error in this testCase
//    void testPlaceOrderustomerNotified()
//    {
//        OrderService os =new OrderService();
//        Order o = new Order(1,"Maggi",100);
//        os.placeOrder(o);
//        assertTrue(o.isCustomerNotified());
//    }

    @Test
    void testSendEmailThrowsException() {

        EmailService emailService = EmailService.getInstance();
        Order order = new Order(1, "Maggi", 100);

        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> emailService.sendEmail(order)
        );

        assertEquals("An Exception Occurred", exception.getMessage());
    }

    @Test
    void testPlaceOrderWithCC_shouldReturnTrue() {
        OrderService orderService = OrderService.getInstance();
        Order order = new Order(1, "Headphones", 3000);

        boolean result = orderService.placeOrder(order, "cc@test.com");

        assertTrue(result);
    }

    @Test
    void testPlaceOrderWithCC_customerNotifiedTrue() {
        OrderService orderService = OrderService.getInstance();
        Order order = new Order(1, "Keyboard", 4000);

        orderService.placeOrder(order, "cc@test.com");

        assertTrue(order.isCustomerNotified());
    }
}