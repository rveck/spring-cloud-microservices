package br.com.veck.reservationservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.veck.reservationservice.model.Reservation;
import br.com.veck.reservationservice.util.Constants.URI;

@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation,Long>{
	
	@RestResource(path = URI.BY_NAME)
	public List<Reservation>findByReservationName(@Param("reservation-name") String reservationName);

}
