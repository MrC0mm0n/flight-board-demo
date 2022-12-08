package ca.yyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.yyz.model.Airline;

public interface AirlineRepository extends JpaRepository<Airline, Integer> {

}