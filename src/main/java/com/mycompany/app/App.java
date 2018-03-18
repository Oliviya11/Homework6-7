package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitinyova.entities.Lecturer;
import com.mitinyova.entities.Subject;
import com.mitinyova.workers.LecturersWorker;
import com.mitinyova.workers.SubjectsWorker;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    			new ClassPathXmlApplicationContext("SpringBeans.xml");
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
    }
}
