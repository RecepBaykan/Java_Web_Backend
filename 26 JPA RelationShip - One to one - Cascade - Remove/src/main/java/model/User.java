package model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseModel{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String surname;
	
	private Date birthOfDay;
	

	@OneToOne(cascade = {
			CascadeType.PERSIST,
			CascadeType.REMOVE,
	})
	@JoinColumn(name = "petId")
	private Pet pet;
	

	
}
