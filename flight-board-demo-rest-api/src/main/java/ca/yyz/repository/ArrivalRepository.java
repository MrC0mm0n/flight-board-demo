package ca.yyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.yyz.model.Arrival;

public interface ArrivalRepository extends JpaRepository<Arrival, String> {

}