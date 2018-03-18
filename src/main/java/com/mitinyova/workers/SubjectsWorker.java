package com.mitinyova.workers;

import org.springframework.beans.factory.annotation.Autowired;

import com.mitinyova.entities.Subject;
import com.mitinyova.interfaces.SubjectsDao;

public class SubjectsWorker {
	@Autowired
	SubjectsDao subjectsDao;

	public Subject addSubject(Subject subject) {
		subject = subjectsDao.addSubject(subject);
		System.out.println(subject);
		return subject;
	}
}
