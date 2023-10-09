package it.unibo.composition;

public class Professor implements User {
    private final int id;
    private final String name;
    private final String surname;
    private final String password;
    private String[] courses;

    public Professor(final int id, final String name, final String surname, final String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

    public String getUsername() {
        return "prof " + this.id;
    }

    public String getPassword() {
       return this.password;
    }

    public String getDescription() {
        return "Professor " + this.name + " " + this.surname;
    }

    public String toString() {
        return "Professor [" 
        + "id=" + this.id
        + ", name=" + this.name
        + ", surname=" + this.surname 
        +"]";
    }
    
    public void replaceCourse(String course, int index) {
        this.courses[index] = course;
    }

    public void replaceAllCourses(String[] courses) {
        this.courses = courses;
    }
}
