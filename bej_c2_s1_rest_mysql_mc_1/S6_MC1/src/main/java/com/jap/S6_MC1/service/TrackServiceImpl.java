package com.jap.S6_MC1.service;

import com.jap.S6_MC1.repository.TrackRepository;
import com.jap.S6_MC1.domain.Track;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TrackServiceImpl implements TrackService{

    private final TrackRepository trackRepository;

    @Autowired
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }
    @Override

    public Track saveTrack(Track track){
        return trackRepository.save(track);
    }

    @Override
    public List<Track> getAllTracks() {
        return (List<Track>) trackRepository.findAll();
    }

    @Override
    public boolean deleteTrackById(int trackId) {
        trackRepository.deleteById(trackId);
        return true;
    }


    @Override
    public List<Track> getTrackName(String trackName) {
        return trackRepository.findByTrackName(trackName);
    }

    @Override
    public Track getTrackId(int trackId) {
        return trackRepository.findByTrackId(trackId);
    }

    @Override
    public Track updateTrack(int trackId, Track updatedTrack) {
        Optional<Track> optTrack = trackRepository.findById(trackId);
        if (optTrack.isEmpty()) {
            return null;
        }
        Track existingTrack = optTrack.get();

        if (updatedTrack.getTrackName() != null) {
            existingTrack.setTrackName(updatedTrack.getTrackName());
        }
        if (updatedTrack.getTrackComments() != null) {
            existingTrack.setTrackComments(updatedTrack.getTrackComments());
        }
        if (updatedTrack.getTrackRating() != 0) {
            existingTrack.setTrackRating(updatedTrack.getTrackRating());
        }
        if (updatedTrack.getTrackArtist() != null) {
            existingTrack.setTrackArtist(updatedTrack.getTrackArtist());
        }

        return trackRepository.save(existingTrack);
    }

}