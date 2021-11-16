package com.fahrul.springtwilio;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fahrul.springtwilio.config.TwilioConfig;
import com.twilio.Twilio;

@SpringBootApplication
public class SpringTwilioApplication {

	@Autowired
	private TwilioConfig twilioConfig;

	@PostConstruct
	public void initTwilio() {
		Twilio.init(twilioConfig.getAccountSid(), twilioConfig.getAuthToken());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringTwilioApplication.class, args);
	}

}
