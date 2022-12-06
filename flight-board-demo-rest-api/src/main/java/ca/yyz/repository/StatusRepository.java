package ca.yyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ca.yyz.model.Status;

public interface StatusRepository extends JpaRepository<Status, String> {

}