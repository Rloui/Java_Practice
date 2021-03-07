package com.roger;

import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private String name;
    LinkedList<Song> playlistOfSongs;

    public Playlist(String name) {
        this.name = name;
        this.playlistOfSongs = new LinkedList<Song>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getPlaylistOfSongs() {
        return playlistOfSongs;
    }

    // create playlist
    public static Playlist createPlaylist(String name) {
        return new Playlist(name);
    }

    // add song
    public void addSong(Song song) {
        playlistOfSongs.add(song);
    }

    // remove song
    public void removeSong(String title) {
        ListIterator<Song> listIterator = playlistOfSongs.listIterator();

        while (listIterator.hasNext()) {
            int comparison = listIterator.next().getTitle().compareTo(title);

            if (comparison == 0) {
                listIterator.previous();
//                System.out.println(listIterator.next().getTitle() + "has been removed from your playlist");
                listIterator.remove();
                break;
            }
        }
    }
}
