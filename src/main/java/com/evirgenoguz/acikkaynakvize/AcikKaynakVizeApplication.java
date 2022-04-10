package com.evirgenoguz.acikkaynakvize;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AcikKaynakVizeApplication {

	@GetMapping("welcome")
	public String welcome(){
		return "Welcome to Acik Kaynak kodlu Yazılımlar Exam";
	}

	public static void main(String[] args) {
		SpringApplication.run(AcikKaynakVizeApplication.class, args);
	}

}
