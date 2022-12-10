package ca.yyz.model.projection;

import java.util.Date;

import org.springframework.data.rest.core.config.Projection;

import com.fasterxml.jackson.annotation.JsonFormat;

import ca.yyz.model.Airline;
import ca.yyz.model.Airport;
import ca.yyz.model.Arrival;
import ca.yyz.model.Status;

@Projection(name = "pArrival", types = { Arrival.class })
public interface PArrival {

	String getId();

	Airport getOrigin();

	Airline getAirline();

	String getRoute();

	@JsonFormat(timezone = "America/Toronto")
	Date getScheduled();

	@JsonFormat(timezone = "America/Toronto")
	Date getRevised();

	Status getStatus();

}