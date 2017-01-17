package model;

import java.io.Serializable;
import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;

/**
 * The persistent class for the grade database table.
 * 
 */
@Entity
public class Grade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;

	@Column (name = "course_grade")
	private String courseGrade;

	@Column (name = "course_result")
	private String courseResult;

	@JsonIgnore
	//bi-directional many-to-one association to Course
	@ManyToOne
	private Course course;

	@JsonIgnore
	//bi-directional many-to-one association to Student
	@ManyToOne
	private Student student;

	public Grade() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseGrade() {
		return this.courseGrade;
	}

	public void setCourseGrade(String courseGrade) {
		this.courseGrade = courseGrade;
	}

	public String getCourseResult() {
		return this.courseResult;
	}

	public void setCourseResult(String courseResult) {
		this.courseResult = courseResult;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}