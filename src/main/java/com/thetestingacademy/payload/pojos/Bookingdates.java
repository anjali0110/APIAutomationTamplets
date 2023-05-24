package com.thetestingacademy.payload.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Bookingdates {
  // @JsonProperty("checkin")
    private String checkin;
    private String checkout;

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }
}
