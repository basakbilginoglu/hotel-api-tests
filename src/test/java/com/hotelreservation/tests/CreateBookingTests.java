package com.otelrezervasyonu.tests;


import com.otelrezervasyonu.models.Booking;
import com.otelrezervasyonu.models.BookingDates;
import com.otelrezervasyonu.models.BookingResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CreateBookingTests extends BaseTest{

    @Test
    public void createBookingTest(){

        Response response=createBooking();
        Assertions.assertEquals("Happy",response.jsonPath().getJsonObject("booking.firstname"));
        Assertions.assertEquals("Brown",response.jsonPath().getJsonObject("booking.lastname"));
    }

    @Test
    public void createBookingWithPojo(){
        BookingDates bookingDates=new BookingDates("2026.06,12","2026.06.14");
        Booking booking=new Booking("Efe","Fork",111,false,bookingDates,"Smoke");
        Response response =given(spec)
                .contentType(ContentType.JSON)
                .body(booking)
                .when()
                .post("/booking");
        response
                .then()
                .statusCode(200);

        BookingResponse bookingResponse= response.as(BookingResponse.class);
        Assertions.assertEquals("Efe",bookingResponse.getBooking().getFirstname());
        Assertions.assertEquals("Fork",bookingResponse.getBooking().getLastname());
        Assertions.assertEquals("Smoke",bookingResponse.getBooking().getAdditionalneeds());



    }


}
