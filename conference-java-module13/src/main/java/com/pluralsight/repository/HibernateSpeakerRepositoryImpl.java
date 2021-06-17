package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
@Profile("qa")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("Bryan");
        speaker.setLastName("Hansen");

        speakers.add(speaker);

        return speakers;

    }
}
