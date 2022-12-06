package ca.yyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.yyz.model.Airport;

public interface AirportRepository extends JpaRepository<Airport, String> {

}