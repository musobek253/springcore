package org.example.student;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Student {
    private List<String> subjects;
    private Map<String, Integer> subjectGrades;

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Map<String, Integer> getSubjectGrades() {
        return subjectGrades;
    }

    public void setSubjectGrades(Map<String, Integer> subjectGrades) {
        this.subjectGrades = subjectGrades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(subjects, student.subjects) && Objects.equals(subjectGrades, student.subjectGrades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjects, subjectGrades);
    }

    @Override
    public String toString() {
        return "Student{" +
                "subjects=" + subjects +
                ", subjectGrades=" + subjectGrades +
                '}';
    }
}
