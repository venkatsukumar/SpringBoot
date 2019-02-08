package io.javabrains.springbootstarter.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topics> getLs() {
		List<Topics> lst = new ArrayList<Topics>();
		topicRepository.findAll().forEach(lst::add);
		return lst;
	}

	public Topics getTopic(String id) {
		return topicRepository.findById(id).get();
		
	}

	public void addTopic(Topics topic) {
		topicRepository.save(topic);
	}

	public void delTopic(String id) {
		topicRepository.deleteById(id);

	}

	public void updTopic(Topics topic, String id) {
		topicRepository.save(topic);
	}
}
