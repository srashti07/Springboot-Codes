package com.jap.S6_MC1.repository;

import com.jap.S6_MC1.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {
    List<Track> findByTrackName(String trackName);
    Track findByTrackId (int trackId);
}
