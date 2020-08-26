package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private final SpeakerRepository repository;

//    public SpeakerServiceImpl() {
//        System.out.println("SpeakServiceImpl No args constructor");
//    }

    @PostConstruct
    private void initialize() {
        System.out.println("We're called after the constructors");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakServiceImpl repository constructor");
        this.repository = repository;
    }

//    public void setRepository(SpeakerRepository repository) {
//        System.out.println("SpeakServiceImpl setter");
//        this.repository = repository;
//    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
