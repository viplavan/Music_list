package com.musiclist.music_list.model;

import lombok.Getter;

@Getter
public class musicList {

    private int id;
    private String songname;
    private String singername;
    private String moviename;
    private String year;

    public musicList(int id, String songname, String singername, String moviename, String year) {
        this.id = id;
        this.songname = songname;
        this.singername = singername;
        this.moviename = moviename;
        this.year = year;
    }

    public musicList() {
    }
}
