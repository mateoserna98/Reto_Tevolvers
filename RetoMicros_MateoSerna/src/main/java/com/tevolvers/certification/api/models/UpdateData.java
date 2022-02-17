package com.tevolvers.certification.api.models;

public class UpdateData {

    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private String checkin;
    private String checkout;
    private String additionalneeds;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public String getCheckin() {
        return checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}