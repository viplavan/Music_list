package com.MusicAPI.music_API.service;




import com.MusicAPI.music_API.modelEntity.Music;
import com.MusicAPI.music_API.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public Music saveMusic(Music music) {
        return musicRepository.save(music);
    }

    public List<Music> saveAllMusic(List<Music> allMusic) {
        return musicRepository.saveAll(allMusic);
    }

    public List<Music> getMusic(){
        return musicRepository.findAll();
    }

    public Music getMusicById(int id){
        return  musicRepository.findById(id).orElse(null);
    }

//    //public Music getMusicByName(String songname){
//        return  restRepository.findByName(songname);
//    }

    public String deleteMusic(int id){
        musicRepository.deleteById(id);
        return "Music Id Deleted || "+id;
    }

    public Music updateMusic(Music music){
        Music existingMusic = musicRepository.findById(music.getId()).orElse(null);
        existingMusic.setSongName(music.getSongName());
        existingMusic.setSingerName(music.getSingerName());
        existingMusic.setMoviename(music.getMoviename());
        existingMusic.setYear(music.getYear());
        return musicRepository.save(existingMusic);
    }
}


