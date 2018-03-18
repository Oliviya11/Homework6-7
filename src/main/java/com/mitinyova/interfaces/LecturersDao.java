package com.mitinyova.interfaces;

import com.mitinyova.entities.Lecturer;

public interface LecturersDao {
   Lecturer addLecturer(Lecturer lecturer);
   
   Lecturer getLecturer(int id);
   
   void saveLecturer(Lecturer lecturer);
   
}
