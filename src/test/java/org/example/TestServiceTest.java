package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestServiceTest {
    @InjectMocks
    TestService testService;
Order order1=new Order(2,"Blue Lays",50.00);
    Order order2=new Order(4,"Red Lays",60.00);
    OrderService orderService=new OrderService();
    @Test
    public void test_Place_Order_OrderService() {
//        assertEquals(1, testService.test());
        assertEquals(true,orderService.placeOrder(order1,"SuperMarket@Hotmail.com"));

    }
    @Test
    public void test_getQuantity()
    {
        assertEquals(4,order2.getQuantity());
    }
    @Test
    public void test_getItemName()
    {
        assertEquals("Blue Lays",order1.getItemName());
    }
    @Test
    public void test_isCustomerNotified()
    {
        assertEquals(false,order1.isCustomerNotified());
    }
}