package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet extends BaseModel{

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private String type;
	
	
}
