package ca.yyz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import ca.yyz.model.Status;

@CrossOrigin(origins = "http://localhost:4200")
public interface StatusRepository extends JpaRepository<Status, String> {

	List<Status> getByArrivalTrue();

}