package ca.yyz.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
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