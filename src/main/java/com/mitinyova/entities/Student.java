package com.mitinyova.entities;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Cacheable
public class Student {
	private String pib;
	private int course;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int studentId;

	public Student() {
	}

	public Student(String pib, int course) {
		this.pib = pib;
		this.course = course;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (this == o)
			return true;
		else if (o.getClass() == this.getClass()) {
			if (this.studentId == ((Student) o).studentId)
				return true;
		}
		return false;
	}

	public int hashCode() {
		final int PRIME = 31;
		int result = 1;
		result = PRIME * result + this.getStudentId();
		return result;
	}

	public String toString() {
		return ("" + studentId + " " + pib + " " + course);
	}
}