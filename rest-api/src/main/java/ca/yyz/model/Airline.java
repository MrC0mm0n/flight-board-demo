package ca.yyz.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Airline {

	@Id
	private Integer id;

	@NotNull
	private String name;
	
	private String iata;
	
	private String icao;

}