package org.example.task.model2.task1.store.student;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

    public static void main(String[] args) {
      //  ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("StudentApp.xml");
        Student student = context1.getBean(Student.class);
        System.out.println("Subjects: " + student.getSubjects());
        System.out.println("Grades: " + student.getSubjectGrades());
    }
}
