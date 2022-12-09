package ca.yyz.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
public class Arrival {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private String id;

	@NotNull
	@ManyToOne
	private Airport origin;

	@NotNull
	@ManyToOne
	private Airline airline;

	private String route;

	@NotNull
	@JsonFormat(timezone = "America/Toronto")
	private Date scheduled;

	@JsonFormat(timezone = "America/Toronto")
	private Date revised;

	@NotNull
	@ManyToOne
	private Status status;

}