package com.learning.springboot.courseapi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springboot.courseapi.model.*;
import com.learning.springboot.courseapi.service.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getTopics();
	}
	
	@RequestMapping("/topics/{topicId}")
	public Topic getTopics(@PathVariable("topicId") String id) {
		return topicService.getTopic(id);
	}
	
	@PostMapping("/topics")
	public Topic addTopics(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}
	@PutMapping("/topics/{topicId}")
	public List<Topic> updateTopics(@RequestBody Topic topic, @PathVariable String topicId) {
		return topicService.updateTopic(topic);
	}
	@DeleteMapping("/topics/{topicId}")
	public List<Topic> deleteTopics(@PathVariable String topicId) {
		return topicService.deleteTopic(topicId);
	}
}
