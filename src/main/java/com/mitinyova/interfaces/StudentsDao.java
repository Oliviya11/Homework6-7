package com.mitinyova.interfaces;

import com.mitinyova.entities.Student;

public interface StudentsDao {
    void addStudent(Student student);
    
    Student getStudentById(int id);
}
