package com.roger;

import java.util.LinkedList;

public class Playlist {
    private String name;
    LinkedList<Song> song;

    public Playlist(String name) {
        this.name = name;
        this.song = new LinkedList<Song>();
    }


}
