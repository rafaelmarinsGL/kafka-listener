package com.kafkalistener.service;

import com.kafkalistener.model.FormSubmission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface FormSubmissionService extends CrudRepository<FormSubmission, Integer> {
}
