package com.jap.S6_MC1.service;

import com.jap.S6_MC1.domain.Track;
import java.util.List;

public interface TrackService {
    Track saveTrack(Track track);
    List<Track> getAllTracks();
    boolean deleteTrackById(int trackId);

    List<Track> getTrackName(String trackName);
    Track getTrackId(int trackId);
    Track updateTrack(int trackId, Track updatedTrack);
}
