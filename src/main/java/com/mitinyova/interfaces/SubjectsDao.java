package com.mitinyova.interfaces;

import com.mitinyova.entities.Subject;

public interface SubjectsDao {
   Subject addSubject(Subject subject);
   
   Subject getSubject(int id);
   
   void saveSubject(Subject subject);
   
}
