package io.explore.spring.boot.starterapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import io.explore.spring.boot.starterapi.model.Topic;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(101, "JAVA", "JAVA Description"),
			new Topic(102, "SERVLET", "SERVLET Description"),
			new Topic(103, "WSDL", "WSDL Description"),
			new Topic(104, "RESTFUL", "RESTFUL Description"),
			new Topic(105, "SPRING FRAMEWORK", "SPRING FRAMEWORK Description")
			));
	public List<Topic> getTopics() {
		return topics;
	}
	public Topic getTopic(String topicId) {
		int id = Integer.parseInt(topicId);
		return topics.stream().filter(t ->t.getTopicId() == id).findFirst().get();
	}
	public Topic addTopic(Topic topic) {
		topics.add(topic);
		return topics.stream().filter(t ->t.getTopicId() == topic.getTopicId()).findFirst().get();
	}
	public List<Topic> updateTopic(Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getTopicId() == topic.getTopicId())
				topics.set(i, topic);
		}
		return topics;
	}
	public List<Topic> deleteTopic(String topicId) {
		int id = Integer.parseInt(topicId);
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getTopicId() == id)
				topics.remove(i);
		}
		return topics;
	}
}
