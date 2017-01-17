package controllers;

import java.util.List;

import javax.persistence.EntityManager;

import model.Student;
import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class StudentCtrl extends Controller {

	private static EntityManager em = JPA.em();

	@Transactional
	public static Result getStudentList() {

		@SuppressWarnings ("unchecked") List<Student> studentList = (List<Student>) em.createQuery("from Student").getResultList();

		return ok(Json.toJson(studentList));

	}

	@Transactional
	public static Result getStudentById(int id) {

		Student student = JPA.em().find(Student.class, id);

		if(student != null){
			return ok(Json.toJson(student));
		}
		else{
			return internalServerError(Json.toJson("Student does not exist"));
		}

	}

}
