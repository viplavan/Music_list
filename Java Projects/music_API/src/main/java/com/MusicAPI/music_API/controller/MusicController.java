package com.MusicAPI.music_API.controller;


import com.MusicAPI.music_API.modelEntity.Music;
import com.MusicAPI.music_API.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MusicController {

    @Autowired
    private MusicService musicService;

    @GetMapping("/allMusic")
    public List<Music> findAllMusic(){
        return (List<Music>) musicService.getMusic();
    }

    @GetMapping("/{id}")
    public Music findMusicById(@PathVariable(value = "id") int id){
        return musicService.getMusicById(id);
    }

//    @GetMapping("/{name}")
//    public Music findMusicByName(@PathVariable(value = "songname") String songname){
//        return musicService.getMusicByName(songname);
//    }

    @PostMapping("/addMusic")
    public Music addMusic(@Validated @RequestBody Music music){
        return musicService.saveMusic(music);
    }

    @PostMapping("/addAllMusic")
    public List<Music> addAllMusic(@Validated @RequestBody List<Music> allMusic){
        return musicService.saveAllMusic(allMusic);
    }

    @PutMapping("/updateMusic")
    public Music updateMusic(@Validated @RequestBody Music music){
        return musicService.updateMusic(music);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMusic(int id){
        return musicService.deleteMusic(id);
    }
}