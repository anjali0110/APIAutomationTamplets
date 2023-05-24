package com.thetestingacademy.module;

import com.thetestingacademy.payload.pojos.Booking;
import com.thetestingacademy.payload.pojos.Bookingdates;
import io.qameta.allure.internal.shadowed.jackson.core.JsonProcessingException;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;

public class PayloadModule {

// set the values on the payload
    ObjectMapper objectMapper;


    public String createPayload() throws JsonProcessingException {
        objectMapper = new ObjectMapper();
         Booking booking= new Booking();
         booking.setFirstname("Anjali");
        booking.setLastname("Pahariya");
        booking.setTotalprice(200.00);
        booking.setDepositPaid(true);
        booking.setAdditionalneeds("Lunch");
        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2022-10-01");
        bookingdates.setCheckout("2022-10-01");
        booking.setBookingdates(bookingdates);
        // java object -> Json String ->
        String payload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
        return payload;


    }



}
