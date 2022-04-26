package com.example.Songs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.net.URL;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String song;
    private String genre;
    private String artist;
    private String album;
    private String fullName;
    private URL ytURL;
    private URL imageURL;
    private Timestamp addDate;


    public Song(){
        this.addDate = new Timestamp(new Date().getTime());
    }

    public Song(int id, String song, String genre, String artist, String album, String name, URL ytURL, URL imageURL, Timestamp addDate) {
        this.id = id;
        this.song = song;
        this.song = song;
        this.genre = genre;
        this.artist = artist;
        this.album = album;
        this.fullName = name;
        this.ytURL = ytURL;
        this.imageURL = imageURL;
        this.addDate = addDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public URL getYtURL() {
        return ytURL;
    }

    public void setYtURL(URL ytURL) {
        this.ytURL = ytURL;
    }

    public URL getImageURL() {
        return imageURL;
    }

    public void setImageURL(URL imageURL) {
        this.imageURL = imageURL;
    }

    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", song='" + song + '\'' +
                ", genre='" + genre + '\'' +
                ", artist='" + artist + '\'' +
                ", album='" + album + '\'' +
                ", name='" + fullName + '\'' +
                ", ytURL=" + ytURL +
                ", imageURL=" + imageURL +
                ", addDate=" + addDate +
                '}';
    }
}
