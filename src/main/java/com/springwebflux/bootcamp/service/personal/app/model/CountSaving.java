package com.springwebflux.bootcamp.service.personal.app.model;
import javax.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import lombok.Data;
@Data
public class CountSaving {
	@Id
    private String idCountSaving;
	
	@NotEmpty
    private String numCountSaving;
	
	@NotEmpty
    private String nameCountSaving;
	
	@NotEmpty
    private String typeCountSaving;

	public CountSaving() {
	}

	public CountSaving(String idCountSaving, @NotEmpty String numCountSaving, @NotEmpty String nameCountSaving,
			@NotEmpty String typeCountSaving) {
		this.idCountSaving = idCountSaving;
		this.numCountSaving = numCountSaving;
		this.nameCountSaving = nameCountSaving;
		this.typeCountSaving = typeCountSaving;
	}

	public String getIdCountSaving() {
		return idCountSaving;
	}

	public void setIdCountSaving(String idCountSaving) {
		this.idCountSaving = idCountSaving;
	}

	public String getNumCountSaving() {
		return numCountSaving;
	}

	public void setNumCountSaving(String numCountSaving) {
		this.numCountSaving = numCountSaving;
	}

	public String getNameCountSaving() {
		return nameCountSaving;
	}

	public void setNameCountSaving(String nameCountSaving) {
		this.nameCountSaving = nameCountSaving;
	}

	public String getTypeCountSaving() {
		return typeCountSaving;
	}

	public void setTypeCountSaving(String typeCountSaving) {
		this.typeCountSaving = typeCountSaving;
	}
	
	
	
}
