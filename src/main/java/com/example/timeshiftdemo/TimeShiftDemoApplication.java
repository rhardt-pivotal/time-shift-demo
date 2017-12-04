package com.example.timeshiftdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@SpringBootApplication
public class TimeShiftDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeShiftDemoApplication.class, args);
	}

	@Controller
	class TimeController {

		@RequestMapping("/")
		public ResponseEntity<String> getTime() {
			return ResponseEntity.ok(DateFormat.getDateTimeInstance().format(new Date()));
		}
	}


}
