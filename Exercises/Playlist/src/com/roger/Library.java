package com.roger;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.time.temporal.JulianFields;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Library {
    private String name;
    ArrayList<Album> albums;
    ArrayList<Playlist> playlists;

    public Library(String name) {
        this.name = name;
        this.albums = new ArrayList<Album>();
        this.playlists = new ArrayList<Playlist>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    // add album
    public void addAlbum(String name) {
        albums.add(Album.createAlbum(name)); // this is supposed to seardch the album and add it by nae not create a new one
    }

    // add song
    public void addSong(String albumName, String songName, Double duration) {
        int albumSelcted = findAlbum(albumName);
        albums.get(albumSelcted).addAlbumSong(songName, duration);
    }

    // add playlist
    public void addPlaylist(String name) {
        playlists.add(Playlist.createPlaylist(name));
    }

    // add song to playlist
    public void addSongToPlaylist(String playlistName, String albumName, String songName) {
        int playlistIndex = findPlaylist(playlistName);
        int albumIndex = findAlbum(albumName);
        Song selectSong = albums.get(albumIndex).findSong(songName);
        playlists.get(playlistIndex).addSong(selectSong);
    }

    // remove song from playlist
    public void removeSongFromPlayist(String playlistName, String name) {
        playlists.get(findPlaylist(playlistName)).removeSong(name);
    }

    public Library createLibrary(String name) {
        System.out.println(name + " music Library has been created.");
        return new Library(name);
    }

    // view album
    public void viewAlbums() {
        ListIterator<Album> listIterator = albums.listIterator();

        while (listIterator.hasNext()) {
            System.out.println("-" + listIterator.next().getName());
        }
    }

    //view songs in album
    public void viewSongs(String albumName) {
        ListIterator<Song> listIterator = albums.get(findAlbum(albumName)).songs.listIterator();

        while (listIterator.hasNext()) {
            System.out.println("-" + listIterator.next().getTitle());
        }
    }

    // view songs in playlist
    public void viewSongsInPlaylist(String playlist) {
        ListIterator<Song> listIterator = playlists.get(findPlaylist(playlist)).playlistOfSongs.listIterator();

        while (listIterator.hasNext()) {
            System.out.println("-" + listIterator.next().getTitle());
        }
    }

    // Find Album
    public int findAlbum(String name) {
        for(int i = 0; i < albums.size(); i++) {
            if (albums.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Find Playlist
    public int findPlaylist(String name) {
        for (int i = 0; i < playlists.size(); i++) {
            if (playlists.get(i).getName().equals(name)) {
                return i;
            } else {
                System.out.println("Playlist not found");
            }
        }
        return -1;
    }
}
