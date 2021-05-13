package com.cg.vegetable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.vegetable.module.Feedback;

@Repository
public interface IFeedbackRepository extends JpaRepository<Feedback, Integer > {

}
