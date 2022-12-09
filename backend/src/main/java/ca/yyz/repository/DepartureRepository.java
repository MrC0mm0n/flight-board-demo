package ca.yyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.yyz.model.Departure;

public interface DepartureRepository extends JpaRepository<Departure, String> {

}