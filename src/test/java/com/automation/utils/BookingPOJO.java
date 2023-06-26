package com.automation.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingPOJO {
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private String additionalneeds;

    private BookingDatePOJO bookingdates;


}
