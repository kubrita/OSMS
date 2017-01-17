package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;

/**
 * The persistent class for the student_course database table.
 * 
 */
@Entity
@Table (name = "student_course")
public class StudentCourse implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;

	//bi-directional many-to-one association to Student
	@JsonBackReference
	@ManyToOne
	private Student student;

	//bi-directional many-to-one association to Course
	@ManyToOne
	@JsonBackReference
	private Course course;

	public StudentCourse() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}