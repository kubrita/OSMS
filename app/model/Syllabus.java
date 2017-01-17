package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the syllabus database table.
 * 
 */
@Entity
public class Syllabus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Lob
	@Column(name="course_syllabus")
	private String courseSyllabus;

	//bi-directional many-to-one association to Course
	@ManyToOne
	private Course course;

	public Syllabus() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseSyllabus() {
		return this.courseSyllabus;
	}

	public void setCourseSyllabus(String courseSyllabus) {
		this.courseSyllabus = courseSyllabus;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}