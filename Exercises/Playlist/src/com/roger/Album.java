package com.roger;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.ListIterator;

public class Album {
    ArrayList<Song> songs;
    private String name;

    public Album(String name) {
        this.songs = new ArrayList<Song>();
        this.name = name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

    // creates album
    public static Album createAlbum(String name) {
        System.out.println("The album " + name + " has been created");
        return new Album(name);
    }

    // adds songs to album
    public void addAlbumSong(String title, Double duration) {
        songs.add(Song.createSong(title, duration));
    }

    // finds index of a song in album
    public Song findSong(String name) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle().equals(name)) {
                return songs.get(i);
            }
        }
        return null;
    }
}
