package com.roger;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    ArrayList<Song> song;
    private String name;

    public Album(String name) {
        this.song = new ArrayList<Song>();
        this.name = name;
    }

    public ArrayList<Song> getSong() {
        return song;
    }

    public String getName() {
        return name;
    }
}
