package ca.yyz.arrival;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ca.yyz.repository.ArrivalRepository;

@SpringBootTest
public class ArrivalTest {

	private static final Logger logger = LoggerFactory.getLogger(ArrivalTest.class);

	@Autowired
	ArrivalRepository arrivalRepo;

	@Test
	void getByOrderByScheduledDesc() {
		arrivalRepo.getByOrderByScheduledDesc().stream().forEach(a -> logger.info("" + a.getId()));
	}

}
