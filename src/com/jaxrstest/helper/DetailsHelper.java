/**
 * 
 */
package com.jaxrstest.helper;

import java.io.StringWriter;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.jaxrstest.pojo.Student;
import com.jaxrstest.pojo.Students;

/**
 * @author niranjan
 *
 */
public class DetailsHelper {

	public static String getServiceDetails(){
		DataLoader dataLoader = DataLoader.getInstance();
		List<Student> studentList = dataLoader.getStudents();
		
		if((studentList != null) && !studentList.isEmpty())
		{
			Students students = new Students();
			students.setStudents(studentList);
			
			return jaxbObjectToXml(students);	
		} else {
			return null;
		}
	}
	
	private static String jaxbObjectToXml(Students students){
		
		StringWriter sw = new StringWriter();
		
		try{
			JAXBContext context = JAXBContext.newInstance(Students.class);
			Marshaller mar = context.createMarshaller();
			
			mar.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			mar.marshal(students,sw);
		}
		catch (JAXBException jaxException){
			System.out.println(jaxException);
		}
		return sw.toString();
	}
}
