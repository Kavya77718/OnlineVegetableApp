package com.cg.vegetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.vegetable.module.Feedback;
import com.cg.vegetable.service.IFeedbackService;

@RestController
public class FeedbackController {
	@Autowired
	IFeedbackService feedServ;
	
	// add
	@PostMapping("/feedback")
	public Feedback addFeedback(@RequestBody Feedback fdk) {
		return feedServ.addFeedback(fdk);
	}

}
