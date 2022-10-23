package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data //this is simplest implementation of Project Lombok 
public class StoredEmployee {

	public  String key;
	public Employee emp;

}
