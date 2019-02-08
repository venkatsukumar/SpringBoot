package io.javabrains.springbootstarter.courses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Courses> getLs(String topicId) {
		List<Courses> lst = new ArrayList<Courses>();
		courseRepository.findAll().forEach(lst::add);
		List<Courses> mst = new ArrayList<Courses>();
		lst.stream().filter(t->t.getTopicId().equalsIgnoreCase(topicId)).forEach(mst::add);;
		return mst;
	}

	public Courses getCourse(String id) {
		return courseRepository.findById(id).get();
		
	}

	public void addCourse(Courses topic) {
		courseRepository.save(topic);
	}

	public void delCourse(String id) {
		courseRepository.deleteById(id);

	}

	public void updCourse(Courses topic, String id) {
		courseRepository.save(topic);
	}

	public List<Courses> getAll() {
		List<Courses> lst = new ArrayList<Courses>();
		courseRepository.findAll().forEach(lst::add);
		return lst;
	}
}
