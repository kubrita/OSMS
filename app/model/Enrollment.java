package model;

import java.io.Serializable;
import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.sql.Timestamp;
import java.util.List;

/**
 * The persistent class for the enrollment database table.
 * 
 */
@Entity
public class Enrollment implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;

	private Timestamp deadline;

	private String semester;

	@JsonIgnore
	//bi-directional many-to-one association to Course
	@ManyToOne
	private Course course;

	@JsonIgnore
	//bi-directional many-to-one association to StudentEnrollment
	@OneToMany (mappedBy = "enrollment")
	private List<StudentEnrollment> studentEnrollments;

	public Enrollment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Timestamp deadline) {
		this.deadline = deadline;
	}

	public String getSemester() {
		return this.semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<StudentEnrollment> getStudentEnrollments() {
		return this.studentEnrollments;
	}

	public void setStudentEnrollments(List<StudentEnrollment> studentEnrollments) {
		this.studentEnrollments = studentEnrollments;
	}

}