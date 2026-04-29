package com.hotelreservation.tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class UpdateBookingTests  extends BaseTest{
    @Test
    public void updateBookingTest(){


     int reservationId= createBookingId();

     Response response=given(spec)
             .contentType(ContentType.JSON)
             .header("Cookie","token="+createToken())
             .body(bookingObject("Happy","Dilmec",400,true))
             .when()
             .put("/booking/" + reservationId);

     String firstname=response.jsonPath().getJsonObject("firstname");
     String lastname=response.jsonPath().getJsonObject("lastname");
     int totalprice = response.jsonPath().getJsonObject("totalprice");
     boolean depositpaid =response.jsonPath().getJsonObject("depositpaid");

     Assertions.assertEquals("Happy",firstname);
     Assertions.assertEquals("Dilmec",lastname);
     Assertions.assertEquals(400,totalprice);
     Assertions.assertEquals(true,depositpaid);


    }

}
