package com.springwebflux.bootcamp.service.personal.app.model.dto;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
public class PersonalDto {

	private String id;
	
	private String numDoc;
	
	private String names;
 
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date createAt;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date updateAt;

	private String typeDoc;
 
	
	private String idCountSaving;
	
    private String numCountSaving;
    
    private String nameCountSaving;
    
    private String typeCountSaving;
}
