package io.javabrains.springbootstarter.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService couseService;
	
	@RequestMapping("/topic/{topicId}/courses")
	public List<Courses> getCoursesByTopicId(@PathVariable String topicId) {
		return couseService.getLs(topicId); 
	}
	
	@RequestMapping("/courses")
	public List<Courses> getAllcourses() {
		return couseService.getAll(); 
	}
	
	@RequestMapping("/courses/{id}")
	public Courses getCourseById(@PathVariable String id) {
		return couseService.getCourse(id);
	}
	
	// add new topic service
	@RequestMapping(method=RequestMethod.POST, value="/courses")
	public void addCourses(@RequestBody Courses course) {		
		couseService.addCourse(course);
	}
	
	// update topic service
	@RequestMapping(method=RequestMethod.PUT, value="/courses/{id}")
	public void updateCourses(@RequestBody Courses course,@PathVariable String id) {
		couseService.updCourse(course, id);
	}
	
	// delete topic service
	@RequestMapping(method=RequestMethod.DELETE, value="/courses/{id}")
	public void deleteCourses(@PathVariable String id) {		
		couseService.delCourse(id);
	}
}