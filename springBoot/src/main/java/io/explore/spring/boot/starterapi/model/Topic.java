package io.explore.spring.boot.starterapi.model;

public class Topic {

	private int topicId;
	private String topicName;
	private String topicDescription;
	public Topic() {
		// TODO Auto-generated constructor stub
	}
	public Topic(int topicId, String topicName, String topicDescription) {
		this.topicId = topicId;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getTopicDescription() {
		return topicDescription;
	}
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
}
