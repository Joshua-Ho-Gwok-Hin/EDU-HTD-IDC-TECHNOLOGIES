package com.bezkoder.spring.hibernate.manytomany.service;

import com.bezkoder.spring.hibernate.manytomany.exception.ResourceNotFoundException;
import com.bezkoder.spring.hibernate.manytomany.model.Tutorial;
import com.bezkoder.spring.hibernate.manytomany.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TutorialService {

    @Autowired
    private TutorialRepository tutorialRepository;

    public ResponseEntity<List<Tutorial>> getAllTutorials(String title) {
        List<Tutorial> tutorials = new ArrayList<Tutorial>();

        if (title == null)
            tutorialRepository.findAll().forEach(tutorials::add);
        else
            tutorialRepository.findByTitleContaining(title).forEach(tutorials::add);

        if (tutorials.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }

    public ResponseEntity<Tutorial> getTutorialById(long id) {
        Tutorial tutorial = tutorialRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));

        return new ResponseEntity<>(tutorial, HttpStatus.OK);
    }

    public ResponseEntity<Tutorial> createTutorial(Tutorial tutorial) {
        Tutorial _tutorial = tutorialRepository.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), true));
        return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
    }

    public ResponseEntity<Tutorial> updateTutorial(long id, Tutorial tutorial) {
        Tutorial _tutorial = tutorialRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));

        _tutorial.setTitle(tutorial.getTitle());
        _tutorial.setDescription(tutorial.getDescription());
        _tutorial.setPublished(tutorial.isPublished());

        return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
    }

    public ResponseEntity<HttpStatus> deleteTutorial(long id) {
        tutorialRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<HttpStatus> deleteAllTutorials() {
        tutorialRepository.deleteAll();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<List<Tutorial>> findByPublished() {
        List<Tutorial> tutorials = tutorialRepository.findByPublished(true);

        if (tutorials.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }
}
