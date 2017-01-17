package model;

import java.io.Serializable;
import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.List;

/**
 * The persistent class for the course database table.
 * 
 */
@Entity
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;

	private String code;

	private String name;

	private String semester;

	@JsonIgnore
	//bi-directional many-to-one association to CourseFaculty
	@OneToMany (mappedBy = "course")
	private List<CourseFaculty> courseFaculties;

	//bi-directional many-to-one association to Enrollment
	@OneToMany (mappedBy = "course")
	private List<Enrollment> enrollments;

	//bi-directional many-to-one association to Grade
	@OneToMany (mappedBy = "course")
	private List<Grade> grades;

	//bi-directional many-to-one association to StudentCourse
	@OneToMany (mappedBy = "course")
	private List<StudentCourse> studentCourses;

	//bi-directional many-to-one association to Syllabus
	@OneToMany (mappedBy = "course")
	private List<Syllabus> syllabuses;

	public Course() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSemester() {
		return this.semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public List<CourseFaculty> getCourseFaculties() {
		return this.courseFaculties;
	}

	public void setCourseFaculties(List<CourseFaculty> courseFaculties) {
		this.courseFaculties = courseFaculties;
	}

	public List<Enrollment> getEnrollments() {
		return this.enrollments;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}

	public List<Grade> getGrades() {
		return this.grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public List<StudentCourse> getStudentCourses() {
		return this.studentCourses;
	}

	public void setStudentCourses(List<StudentCourse> studentCourses) {
		this.studentCourses = studentCourses;
	}

	public List<Syllabus> getSyllabuses() {
		return this.syllabuses;
	}

	public void setSyllabuses(List<Syllabus> syllabuses) {
		this.syllabuses = syllabuses;
	}

}