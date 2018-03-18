package com.mitinyova.entities;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {
	@Id
	@GeneratedValue
	@Column(name = "subject_id")
	private int id;
	private String name;
	private String type;
	private int hours;
	//private int lecturer_id;
	private String control;
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="lecturer_id", nullable=false)
	private Lecturer lecturer;
    public Lecturer getLecturer() { return lecturer; }
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public String getControl() {
		return control;
	}
	public void setControl(String control) {
		this.control = control;
	}

	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
	
}
