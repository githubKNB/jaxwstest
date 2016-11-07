/**
 * 
 */
package com.jaxrstest.helper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.jaxrstest.pojo.Student;

/**
 * @author niranjan
 *
 */
public class DataLoader {
	
	private static DataLoader dataLoader;
	
	private DataLoader(){
		//Initialize loader connections
	}
	
	public static DataLoader getInstance(){
		if(dataLoader == null)
		{
			synchronized (DataLoader.class) {
				if(dataLoader == null)
				{				
					dataLoader = new DataLoader();
				}
			}
		}
		
		return dataLoader;
	}
	
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<Student>();
		
		// Load student data
		{
			// Connect to data source
		}
		
		//ForTesting
		{
			for(int i = 1 ; i < 11 ; i++){
				Student student = new Student();
				student.setFirstName("First Name" + i);
				student.setLastName("Last Name" + i);
				student.setDateOfBirth(LocalDate.of((1990 + i), i, (i+5)));		
				
				students.add(student);
			}
		}
		
		return students;
	}
}
