package com.hotelreservation.tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetBookingByIdTests extends BaseTest{

    @Test
    public void getBookingByIdTests(){


        int reservationId=createBookingId();
        Response response =given(spec)
                .when()
                .get("/booking/"+reservationId);

        response
                .then()
                .statusCode(200);

        String firstname=response.jsonPath().getJsonObject("firstname");
        String lastname=response.jsonPath().getJsonObject("lastname");
        int totalPrice=response.jsonPath().getJsonObject("totalprice");

        Assertions.assertEquals("Happy",firstname);
        Assertions.assertEquals("Brown",lastname);
        Assertions.assertEquals(111,totalPrice);

    }
}
