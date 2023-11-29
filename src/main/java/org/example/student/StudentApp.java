package org.example.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
       // ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("StudentApp.xml");
        Student student = context.getBean(Student.class);
        System.out.println("Subjects: " + student.getSubjects());
        System.out.println("Grades: " + student.getSubjectGrades());
    }
}
