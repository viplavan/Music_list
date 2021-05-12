package com.MusicAPI.music_API.modelEntity;

import javax.persistence.*;

@Entity
@Table(name = "music")
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String songname;
    private String singername;
    private String moviename;
    private String songyear;

    public Music(int id, String songname, String singername, String moviename,String songyear) {
        this.id = id;
        this.songname = songname;
        this.singername = singername;
        this.moviename = moviename;
        this.songyear = songyear;
    }

    public Music (){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongName(){return songname;}

    public void setSongName(String songname) {
        this.songname = songname;
    }

    public String getSingerName() {
        return singername;
    }

    public void setSingerName(String singername) {
        this.singername = singername;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public String getYear() {
        return songyear;
    }

    public void setYear(String songyear) {
        this.songyear = songyear;
    }

    @Override
    public String toString(){
        String output = "";
        output = String.format("\nid: %d\n" +
                "songName: %s\n" +
                "singerName: %s\n" +
                "songYear: %s\n" , id, songname, singername, songyear);
        return output;
    }
}