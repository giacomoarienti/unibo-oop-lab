package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    private final int id;
    private final int maxStudents;
    private int registeredStudents;
    private final String courseName;
    private final Professor professor;
    private final ExamRoom room;
    private final Student[] students;

    public Exam(final int id, final int maxStudents, final String courseName, final Professor professor, final ExamRoom room) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.registeredStudents = 0;
        this.students = new Student[maxStudents];
    }

    public String getCourseName() {
        return this.courseName;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public ExamRoom getExamRoom() {
        return this.room;
    }

    public void registerStudent(Student student) {
        if(this.registeredStudents < this.maxStudents) {
            this.students[this.registeredStudents] = student;
            this.registeredStudents++;
        }
    }

    public String toString() {
        return "Exam[" 
        + "id=" + this.id
        + ", Course=" + this.courseName
        + ", Professor=" + this.professor
        + ", Room=" + this.room
        + ", Students=" + Arrays.toString(this.students)
        + "]";
    }
}
