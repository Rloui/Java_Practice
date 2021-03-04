package com.roger;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Album albumRNS = new Album("RNS");
        albumRNS.addAlbumSong(Song.createSong("Realest Ever", 6.22));
        albumRNS.addAlbumSong(Song.createSong("Best Me", 3.54));

        System.out.println(albumRNS);


    }
}
