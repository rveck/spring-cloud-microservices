package br.com.veck.reservationclient.gateway.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resources;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.veck.reservationclient.model.Reservation;

@RestController
@RequestMapping("reservations")
public class ReservationApiGatewayRestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${reservation.service.reservations.uri}")
	private String reservationServiceUri;
	
	@GetMapping(path = "names")
	public Collection<String> names(){
		
		ParameterizedTypeReference<Resources<Reservation>> ptr = 
				new ParameterizedTypeReference<Resources<Reservation>>(){};
					
		ResponseEntity<Resources<Reservation>> response = 
				restTemplate.exchange(reservationServiceUri, HttpMethod.GET, null, ptr);
				
		return response
				.getBody()
				.getContent()
				.stream()
				.map(Reservation::getReservationName)
				.collect(Collectors.toList());
	}

}
