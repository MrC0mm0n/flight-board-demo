package ca.yyz.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Airport {

	@Id
	private String code;

	@NotNull
	private String name;

}