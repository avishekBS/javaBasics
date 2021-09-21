package com.learning.springboot.courseapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.springboot.courseapi.model.Topic;
import com.learning.springboot.courseapi.repo.TopicsRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicsRepository topicRepository;
	
	public List<Topic> getTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}
	public Topic getTopic(String topicId) {
		int id = Integer.parseInt(topicId);
		return topicRepository.findById(id).get();
	}
	public Topic addTopic(Topic topic) {
		return topicRepository.save(topic);
	}
	public Topic updateTopic(Topic topic) {
		return topicRepository.save(topic);
	}
	public List<Topic> deleteTopic(String topicId) {
		int id = Integer.parseInt(topicId);
		topicRepository.deleteById(id);
		return getTopics();
	}
}
