package org.example;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.runners.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
    Order order3=new Order(10,"Chees",100.00);

EmailService emailService=new EmailService();

@Test
public void test_sendEmail()
{
    assertEquals(true,emailService.sendEmail(order3,"PanekaMart@gmail.com"));
}
//    @Test
//    public void test_VoidSendEmail() {
//    EmailService emailService1=mock(EmailService.class);
//    Order order=new Order(3,"Bell",30.00);
//        doNothing().when(emailService1).sendEmail(order);
//        emailService1.sendEmail(order);
//
//        verify(emailService1, times(1)).sendEmail(order);
//
//    }

}