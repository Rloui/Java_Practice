package com.roger;

import java.util.ArrayList;

public class Album {
    ArrayList<Song> album;
    private String name;

    public Album(String name) {
        this.album = new ArrayList<Song>();
        this.name = name;
    }

//    public Album(String name, ArrayList<Song> song) {
//        this.song = song;
//        this.name = name;
//    }

    public ArrayList<Song> getAlbum() {
        return album;
    }

    public String getName() {
        return name;
    }

    // creates album
    public static Album createAlbum(String name) {
        return new Album(name);
    }

    // adds songs to album
    public void addAlbumSong(Song song) {
        album.add(song);
    }

    // method removes song from album
    public void removeAlbumSong(Song song) {
        album.remove(findSong(song));
    }

    // finds index of a song in album
    public int findSong(Song song) {
        return album.indexOf(song);
    }
}
