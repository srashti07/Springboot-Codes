package com.jap.S6_MC1.controller;

import com.jap.S6_MC1.service.TrackService;
import com.jap.S6_MC1.domain.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TrackController {

    private TrackService trackService;
    @Autowired
    public TrackController(TrackService trackService){
        this.trackService = trackService;
    }
    @PostMapping("/add")
    public ResponseEntity<?> saveTrack(@RequestBody Track track){
        return new ResponseEntity<>(trackService.saveTrack(track), HttpStatus.CREATED);
    }
    @GetMapping("/tracks")
    public ResponseEntity<?>getAllTracks(){
        return new ResponseEntity<>(trackService.getAllTracks(),HttpStatus.FOUND);
    }
    @GetMapping("/tracks/name/{trackName}")
    public ResponseEntity<?>getTrackArtist(@PathVariable String trackName){
        return new ResponseEntity<>(trackService.getTrackName(trackName),HttpStatus.FOUND);
    }
    @GetMapping("/tracks/id/{id}")
    public ResponseEntity<?>getTrackId(@PathVariable int id){
        return new ResponseEntity<>(trackService.getTrackId(id),HttpStatus.FOUND);
    }
    @DeleteMapping("/tracks/{trackId}")
    public ResponseEntity<?> deleteTrackById(@PathVariable int trackId){
        return new ResponseEntity<>(trackService.deleteTrackById(trackId),HttpStatus.OK);
    }
    @PutMapping("/tracks/{trackId}")
    public ResponseEntity<?> updateTrack(@RequestBody Track updatedTrack, @PathVariable int trackId) {
        return new ResponseEntity<>(trackService.updateTrack(trackId, updatedTrack), HttpStatus.OK);
    }

}
