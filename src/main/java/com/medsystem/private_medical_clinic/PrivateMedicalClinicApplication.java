package com.medsystem.private_medical_clinic;



import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class PrivateMedicalClinicApplication {
	public static void main(String[] args) {
		SpringApplication.run(PrivateMedicalClinicApplication.class, args);
	}
}
