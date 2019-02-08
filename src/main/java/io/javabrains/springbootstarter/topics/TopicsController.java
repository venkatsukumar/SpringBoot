package io.javabrains.springbootstarter.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topics> topcics() {
		return topicService.getLs(); 
	}
	
	
	@RequestMapping("/topics/{id}")
	public Topics getTopicById(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	// add new topic service
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopics(@RequestBody Topics topic) {		
		topicService.addTopic(topic);
	}
	
	// update topic service
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopics(@RequestBody Topics topic,@PathVariable String id) {
		topicService.updTopic(topic, id);
	}
	
	// delete topic service
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopics(@PathVariable String id) {		
		topicService.delTopic(id);
	}
}