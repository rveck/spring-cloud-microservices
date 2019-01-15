package br.com.veck.reservationservice;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.veck.reservationservice.model.Reservation;
import br.com.veck.reservationservice.repository.ReservationRepository;

@Component
public class DummyCLR implements CommandLineRunner{
	
	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Josh", "Peter", "Suse", "Natasha", "Bob" )
		.forEach(name -> this.reservationRepository.save(new Reservation(name)));		
	}

}
