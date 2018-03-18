package com.mitinyova.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "lecturers")
public class Lecturer {
	@Id
	@GeneratedValue
	@Column(name = "lecturer_id")
	private int id;
	private String name;
	@OneToMany(mappedBy = "lecturer")
	private List<Subject> subjects;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
}
