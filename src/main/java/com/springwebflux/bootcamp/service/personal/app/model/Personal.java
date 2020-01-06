package com.springwebflux.bootcamp.service.personal.app.model;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@Document(collection = "personal")
public class Personal {	

	@Id
	private String id;
	
	@NotEmpty
	private String numDoc;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date createAt;

	@NotEmpty
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date updateAt;

	@NotEmpty
	private String typeDoc;

	@NotEmpty
	private List<CountSaving> countSavingList;
 
	public Personal() {
	}
	
	public Personal( @NotEmpty String numDoc,@NotEmpty String name,@NotEmpty Date createAt,
			@NotEmpty Date updateAt, @NotEmpty String typeDoc, @NotEmpty List<CountSaving> countSavingList) {
		this.numDoc = numDoc;
		this.name = name;
		this.createAt = createAt;
		this.updateAt = updateAt;
		this.typeDoc = typeDoc;
		this.countSavingList = countSavingList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public String getTypeDoc() {
		return typeDoc;
	}

	public void setTypeDoc(String typeDoc) {
		this.typeDoc = typeDoc;
	}

	public List<CountSaving> getCountSavingList() {
		return countSavingList;
	}

	public void setCountSavingList(List<CountSaving> countSavingList) {
		this.countSavingList = countSavingList;
	}
	
 
 

	
}
