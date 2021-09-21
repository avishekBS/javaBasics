package com.learning.springboot.courseapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.courseapi.model.Course;
import com.learning.springboot.courseapi.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable String topicId) {
		return courseService.getAllCourses(topicId);
	}
	
	
	@RequestMapping("/topics/{topicId}/courses/{courseName}")
	public Optional<Course> getCourseByName(@PathVariable("courseName") String courseName) {
		return courseService.getCourseByName(courseName); 
		}

		
	@PostMapping("/topics/{topicId}/courses/{courseId}") 
	public Course addTopics(@RequestBody Course course, @PathVariable String topicId) {
		return courseService.addCourse(course, topicId); 
		}
		  
		
	@PutMapping("/topics/{topicId}/courses/{courseId}") 
	public Course updateCourse(@RequestBody Course course, @PathVariable String topicId) {
		return courseService.updateCourse(course, topicId); 
		 }
		  
	@DeleteMapping("/topics/{topicId}/courses/{courseId}") 
	public List<Course> deleteTopics(@PathVariable String topicId, @PathVariable String courseId) { 
		return courseService.deleteCourse(topicId, courseId); }
		 
		 
	 
}
