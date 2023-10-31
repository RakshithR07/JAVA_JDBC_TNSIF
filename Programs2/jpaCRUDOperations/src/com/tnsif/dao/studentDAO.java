package com.tnsif.dao;

public interface studentDAO {
	
	public abstract void addStudent(Student student);
	public abstract Student getStudentById(int id);
	public abstract void updateStudent(Student student);
	public abstract void removeStudent(Student student);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	
	
}
