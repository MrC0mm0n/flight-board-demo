package ca.yyz.model;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Status {

	@Id
	private String id;

	@NotNull
	private String label;

	@NotNull
	private Boolean arrival;

	@NotNull
	private Boolean departure;

}