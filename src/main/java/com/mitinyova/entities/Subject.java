package com.mitinyova.entities;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((control == null) ? 0 : control.hashCode());
		result = prime * result + hours;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		if (control == null) {
			if (other.control != null)
				return false;
		} else if (!control.equals(other.control))
			return false;
		if (hours != other.hours)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

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

	public void setId(int id) {
		this.id = id;
	}
	
}
