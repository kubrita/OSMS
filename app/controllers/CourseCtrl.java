package controllers;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;

import model.Course;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import play.db.jpa.JPA;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

@Transactional
public class CourseCtrl extends Controller {

	private static EntityManager em = JPA.em();

	public static ObjectMapper objectMapper = new ObjectMapper();

	@SuppressWarnings ("unchecked")
	public static Result getCourseList() {

		List<Course> courseList = em.createQuery("from Course").getResultList();

		return ok(Json.toJson(courseList));

	}

	public static Result getCourseById(int id) {

		Course course = JPA.em().find(Course.class, id);

		if(course != null){
			return ok(Json.toJson(course));
		}
		else{
			return notFound("Course does not exist.");
		}

	}

	public static Result updateCourse() {

		JsonNode jsonNode = request().body().asJson();

		Course course = null;

		try{
			if(jsonNode != null){
				if(jsonNode.isObject()){
					course = objectMapper.treeToValue(jsonNode, Course.class);
				}

			}
		}
		catch (JsonParseException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (JsonMappingException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		course = JPA.em().merge(course);

		if(course != null){
			return ok();
		}
		else{
			return internalServerError();
		}

	}

	public static Result addCourse() {

		JsonNode jsonNode = request().body().asJson();

		Course course = null;

		try{
			if(jsonNode.isObject()){
				course = objectMapper.treeToValue(jsonNode, Course.class);
			}
		}
		catch (JsonParseException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (JsonMappingException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JPA.em().persist(course);

		return ok();
	}

	public static Result addCourses() {

		JsonNode jsonNode = request().body().asJson();

		List<Course> courseList = null;

		if(jsonNode != null){

			try{
				courseList = objectMapper.readValue(jsonNode, new TypeReference<List<Course>>() {});
			}
			catch (JsonParseException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (JsonMappingException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e){
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		for(Course course : courseList){
			JPA.em().persist(course);
		}

		return ok();
	}
}
