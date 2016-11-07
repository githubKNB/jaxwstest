/**
 * 
 */
package com.jaxrstest.pojo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author niranjan
 *
 */
@XmlRootElement(name="students")
@XmlAccessorType(XmlAccessType.FIELD)
public class Students {

	@XmlElement(name="student")
	private List<Student> students = null;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
