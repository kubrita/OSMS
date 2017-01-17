package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the faculty database table.
 * 
 */
@Entity
public class Faculty implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;

	@Column (name = "faculty_code")
	private String facultyCode;

	@Column (name = "faculty_name")
	private String facultyName;

	//bi-directional many-to-one association to CourseFaculty
	@OneToMany (mappedBy = "faculty")
	private List<CourseFaculty> courseFaculties;

	public Faculty() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFacultyCode() {
		return this.facultyCode;
	}

	public void setFacultyCode(String facultyCode) {
		this.facultyCode = facultyCode;
	}

	public String getFacultyName() {
		return this.facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public List<CourseFaculty> getCourseFaculties() {
		return this.courseFaculties;
	}

	public void setCourseFaculties(List<CourseFaculty> courseFaculties) {
		this.courseFaculties = courseFaculties;
	}

}