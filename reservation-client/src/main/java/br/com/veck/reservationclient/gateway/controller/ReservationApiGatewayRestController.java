package br.com.veck.reservationclient.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("reservations")
public class ReservationApiGatewayRestController {
	
	@GetMapping
	public String test(){
		return "test";
	}

}
