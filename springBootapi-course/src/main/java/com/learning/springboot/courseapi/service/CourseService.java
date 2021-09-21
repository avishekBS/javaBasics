package com.learning.springboot.courseapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.springboot.courseapi.model.Course;
import com.learning.springboot.courseapi.model.Topic;
import com.learning.springboot.courseapi.repo.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private TopicService topicService;
	
	public List<Course> getAllCourses(String topicId) {
		int parsedTopicId = Integer.parseInt(topicId);
		return courseRepository.findByTopicTopicId(parsedTopicId);
	}
	
	public Optional<Course> getCourseByName(String courseName) {
		return courseRepository.findBycourseName(courseName); 
	} 
	
	public Course addCourse(Course course, String topicId) {
		Topic topic = topicService.getTopic(topicId);
		course.setTopic(topic);
		return courseRepository.save(course);
	}
		
	public Course updateCourse(Course course, String topicId) {
		Topic topic = topicService.getTopic(topicId);
		course.setTopic(topic);
		return courseRepository.save(course); 
		}
	public List<Course> deleteCourse(String topicId, String courseId) {
		int id =Integer.parseInt(courseId); 
		courseRepository.deleteById(id); 
		return getAllCourses(topicId);
		}
		 
	 
	 
}
