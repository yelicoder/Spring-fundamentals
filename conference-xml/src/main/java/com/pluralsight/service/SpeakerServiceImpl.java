package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("in constructor with no arg");
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("in constructor with arg");
        this.repository = repository;
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("in setter");
        this.repository = repository;
    }



    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
