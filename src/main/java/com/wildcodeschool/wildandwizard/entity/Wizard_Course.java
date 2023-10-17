package com.wildcodeschool.wildandwizard.entity;

import javax.persistence.*;

@Entity
public class Wizard_Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "wizard_id")
    private Wizard wizards;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course courses;

    public Wizard_Course () {}

    public Wizard getWizard() {
        return wizards;
    }

    public void setWizard(Wizard wizard) {
        this.wizards = wizard;
    }

    public Course getCourse() {
        return courses;
    }

    public void setCourse(Course course) {
        this.courses = course;
    }
}
