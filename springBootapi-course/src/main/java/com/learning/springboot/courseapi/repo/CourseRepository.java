package com.learning.springboot.courseapi.repo;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.learning.springboot.courseapi.model.Course;

public interface CourseRepository extends CrudRepository<Course, Integer>{
	
	public List<Course> findByTopicTopicId(int topicId);
	public Optional<Course> findBycourseName(String courseName);

}
