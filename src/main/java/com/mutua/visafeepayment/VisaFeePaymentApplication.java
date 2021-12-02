package com.mutua.visafeepayment;

import com.stripe.Stripe;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class VisaFeePaymentApplication {

	@Value("${stripe.api.key}")
	private String stripeApiKey;

	@PostConstruct
	public void setup() {
		Stripe.apiKey = stripeApiKey ;

	}


	public static void main(String[] args) {
		SpringApplication.run(VisaFeePaymentApplication.class, args);
	}

}
