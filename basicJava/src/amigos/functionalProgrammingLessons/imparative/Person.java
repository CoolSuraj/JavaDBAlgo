/**
 * 
 */
package amigos.functionalProgrammingLessons.imparative;

import lombok.AllArgsConstructor;

/**
 * Lombok is used so that getter setters will be automatically created
 *
 */

import lombok.Data;
import lombok.NoArgsConstructor;
//import javax.persistence.Entity;


@AllArgsConstructor
@NoArgsConstructor
@Data //this is simplest implementation of Project Lombok 
//@Getter @Setter @NoArgsConstructor // <--- THIS is also we can do in Lombok
public class Person {
	String name;
	Gender gender;
	
	
}
