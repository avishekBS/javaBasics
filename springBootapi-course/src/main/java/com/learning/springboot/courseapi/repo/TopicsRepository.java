package com.learning.springboot.courseapi.repo;

import org.springframework.data.repository.CrudRepository;
import com.learning.springboot.courseapi.model.Topic;

public interface TopicsRepository extends CrudRepository<Topic, Integer>{


}
