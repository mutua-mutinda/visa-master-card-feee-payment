package com.mutua.visafeepayment.dto;

import com.google.gson.annotations.SerializedName;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class CreatePayment {

    @NotNull
    @Min(1000)
    private Integer amount;

    @Email
    private String Email;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
