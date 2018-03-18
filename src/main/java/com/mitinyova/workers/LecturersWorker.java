package com.mitinyova.workers;

import org.springframework.beans.factory.annotation.Autowired;

import com.mitinyova.entities.Lecturer;
import com.mitinyova.interfaces.LecturersDao;

public class LecturersWorker {
	@Autowired
	LecturersDao lecturersDao;

	public Lecturer addLecturer(Lecturer lecturer) {
		lecturer = lecturersDao.addLecturer(lecturer);
		System.out.println(lecturer);
		return lecturer;
	}
}
