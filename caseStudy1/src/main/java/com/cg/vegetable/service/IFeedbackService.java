package com.cg.vegetable.service;

import java.util.List;

import com.cg.vegetable.module.Feedback;

public interface IFeedbackService {
		public Feedback addFeedback(Feedback fdk);
		public List<Feedback> viewAllFeedbacks(int vegetableId);
		public List<Feedback> viewFeedback(int custId);
	}

