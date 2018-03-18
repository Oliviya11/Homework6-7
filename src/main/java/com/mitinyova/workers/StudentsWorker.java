package com.mitinyova.workers;

import org.springframework.beans.factory.annotation.Autowired;

import com.mitinyova.entities.Student;
import com.mitinyova.interfaces.StudentsDao;

public class StudentsWorker {
	@Autowired
	private StudentsDao studentsDao;

	public void saveStudentToDb(Student student) {
		if ((student != null) && (student.getCourse() > 0 && 
			(student.getPib() != null) && (!"".equals(student.getPib())))) {
			studentsDao.addStudent(student);
			System.out.println("====SAVED====:" + student);
		}
	}

	public Student getStudentFromDbById(int id) {
		Student student = studentsDao.getStudentById(id);
		System.out.println("=====STUDENT====: " + student);
		return student;
	}
}
