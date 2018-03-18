package com.mitinyova.implementation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mitinyova.entities.Lecturer;
import com.mitinyova.interfaces.LecturersDao;

@Repository
@Transactional
public class LecturerDaoJPAImpl implements LecturersDao {
	@PersistenceContext
	private EntityManager em;

	public Lecturer addLecturer(Lecturer lecturer) {
		em.persist(lecturer);
		return lecturer;
	}

	public Lecturer getLecturer(int id) {
		return em.find(Lecturer.class, id);
	}

	public void saveLecturer(Lecturer lecturer) {
		em.merge(lecturer);
		
	}

}
