package com.MusicAPI.music_API.repository;

import com.MusicAPI.music_API.modelEntity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Integer> {
    //Music findByName(String songname);

}
