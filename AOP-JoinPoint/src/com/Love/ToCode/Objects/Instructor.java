package com.Love.ToCode.Objects;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "instructor")
public class Instructor {

    //anotatate the class as an entity and map to db table

    //define the fields

    // annotate the fields with db column names

    //set up mapping to instructorDetail entity

    // create constuctors

    // generate getter and setters

    // generate toString() method

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instructor_detail_id")
    private InstructorDetails instructorDetails;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "instructor", cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
    private List<Course> courses;
    public Instructor() {
    }

    public Instructor(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public InstructorDetails getInstructorDetails() {
        return instructorDetails;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setInstructorDetails(InstructorDetails instructorDetails) {
        this.instructorDetails = instructorDetails;
    }


    @Override
    public String toString() {
        return String.format("%-8d %-8s %-8s %s",
                getId(),getFirstName(), getLastName(), getEmail());
    }


    //add convenience methods for bi-directional relationship

    public void addCourse(Course temCourse){
        if (courses == null){
            courses = new ArrayList<>();
        }

        courses.add(temCourse);
        temCourse.setInstructor(this);
    }
}


