package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitinyova.entities.Lecturer;
import com.mitinyova.entities.Student;
import com.mitinyova.entities.Subject;
import com.mitinyova.workers.LecturersWorker;
import com.mitinyova.workers.StudentsWorker;
import com.mitinyova.workers.SubjectsWorker;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext("SpringBeans.xml");
    	/*
    	StudentsWorker worker = (StudentsWorker)context.getBean("students-worker");
    	Student studentSave = new Student("Vasya", 4);
    	worker.saveStudentToDb(studentSave);
    	CacheManager cm = new CacheManager();
        Cache cache = cm.getCache("studentsCache");
        System.out.println(cache.getName());
        System.out.println(cache.getDiskStoreSize());
        Student student = worker.getStudentFromDbById(1);
        System.out.println(student);
        student = worker.getStudentFromDbById(1);
        System.out.println(student);
        */
    	
    	Lecturer lecturer = new Lecturer();
    	lecturer.setName("Vasiliy Ivanenko");
    	LecturersWorker workerLecturer = (LecturersWorker)context.getBean("lecturer-worker");
    	workerLecturer.addLecturer(lecturer);
    	
        Subject subject = new Subject();
        subject.setName("Math");
        subject.setControl("exam");
        subject.setHours(120);
        subject.setType("lectures");
        subject.setLecturer(lecturer);
        SubjectsWorker workerSubject = (SubjectsWorker)context.getBean("subject-worker");
        workerSubject.addSubject(subject);
        workerSubject.saveSubject(subject);
    }
}
