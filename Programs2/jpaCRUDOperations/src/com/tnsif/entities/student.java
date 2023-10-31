package com.tnsif.entities;

@Table(name="student")
@Entity
public class student implements Serializable {
	
	
	private static final long serialVersionUID=1L;// Mentioning the ID
	@Id
	private int studentid;
	private String name;
	
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
/*
 * com.tnsif.dao
 * 3 files----> 2 class file 1 interface file
 * JPAUtil = 
 * StudentDaoImplem
 * Interface:
 * StudentDao
 *
 */
//dao= data access object

/*Step 1: Create new JAVA Project 
Step2 : Create META-INF folder and add persistence.xml file
Step 3: Create packages like client, dao(Data Access Object), entities, service.
Step 4: Add JAR dependency files
Step 5:  Create a table in mySQL
*/