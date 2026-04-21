package com.otelrezervasyonu.tests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class PartialUpdateBookingTests  extends BaseTest{
    @Test
    public void partialUpdateBookingTest(){


        int bookingId=createBookingId();

        JSONObject body=new JSONObject();
        body.put("firstname","Maya");

        Response response= given(spec)
                .contentType(ContentType.JSON)
                .header("Cookie","token=" + createToken())
                .body(body.toString())
                .when()
                .patch("booking/"+bookingId);



    }
}
