package com.roger;

import javax.lang.model.SourceVersion;
import javax.lang.model.element.NestingKind;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in); // instatiates opening scanner field
    private static Library library;

    public static void main(String[] args) {
        // Create a program that implements a playlist for songs
        // XX Create a Song class having Title and Duration for a song.
        // XX The program will have an Album class containing a list of songs.
        // XX The albums will be stored in an ArrayList
        // XX build GUI for adding songs to albums and albums to Library

        boolean quit = false;
        boolean buildLibrary = true;
        boolean viewLibrary = true;
        boolean buildPlaylist = true;
        boolean listen = true;

        startMusicApp();
        printMenuOptions();

        while (!quit) {
            System.out.println("Enter your option from above:");
            int selection = scanner.nextInt();
            scanner.nextLine();

            switch (selection) {
                case 0:
                    System.out.println("Quitting the music app now...");
                    quit = true;
                    break;
                case 1:
                    // Build Library
                    printBuildLibraryOptions();
                    while (buildLibrary) {
                        System.out.println("Enter your option from above:");
                        int buildChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (buildChoice) {
                            case 0:
                                System.out.println("Quitting the build library now...");
                                buildLibrary = false;
                                break;
                            case 1:
                                initiateLibrary();
                                break;
                            case 2:
                                createAlbum();
                                break;
                            case 3:
                                createSong();
                                break;
                        }
                    }
                    break;
                case 2:
                    // Build Playlist
                    printBuildPlaylistOptions();
                    while (buildPlaylist) {
                        System.out.println("Enter your option from above:");
                        int buildChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (buildChoice) {
                            case 0:
                                System.out.println("Quitting the Build Playlist now...");
                                buildPlaylist = false;
                                break;
                            case 1:
                                createPlaylist();
                                break;
                            case 2:
                                addSongToPlaylist();
                                break;
                            case 3:
                                removeSongFromPlaylist();
                                break;
                        }
                    }
                    break;
                case 3:
                    // view songs
                    printViewSongsOptions();
                    while (viewLibrary) {
                        System.out.println("Enter your option from above:");
                        int viewChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (viewChoice) {
                            case 0:
                                System.out.println("Quitting the Display mode now...");
                                viewLibrary = false;
                                break;
                            case 1:
                                viewAlbum();
                                break;
                            case 2:
                                viewSongs();
                                break;
                            case 3:
                                viewPlaylist();
                                break;
                        }
                    }
                    break;
                case 4:
                    // listen to songs
                    printListenToSong();
                    while (listen) {
                        System.out.println("Enter your option from above:");
                        int listenChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (listenChoice) {
                            case 0:
                                System.out.println("Quitting the Listen mode now...");
                                listen = false;
                                break;
                        }

                    }
            }
        }
        // Songs from different albums can be added to the playlist and will appear in the list in the order
        // they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()
    }

    // Dashboard Methods
    public static void startMusicApp() {
        System.out.println("Welcome to your music app!\n");
    }

    public static void printMenuOptions() {
        System.out.println("Your options are below:");
        System.out.println("0. Quit App\n" + "1. Build your Library:\n" + "2. Create your Playlist:\n" + "3. Veiw your Songs:\n" + "4. Listen:\n");
    }


    // Library
    public static void printBuildLibraryOptions() {
        System.out.println("Your options are below:");
        System.out.println("0. Quit App\n" + "1. Create your Library:\n" + "2. Create an Album:\n" + "3. Create a Song:\n");
    }

    public static void initiateLibrary() {
        System.out.println("What would you like to call your Music Library:");
        String name = scanner.nextLine();
        library = new Library(name);
        System.out.println("The libaray " + library.getName() + " has been created");
    }

    public static void createAlbum() {
        System.out.println("What would you like to name the Album:");
        String name = scanner.nextLine();
        library.addAlbum(name);
    }

    public static void createSong() {
        System.out.println("What album would you like to add to?");
        String albumName = scanner.nextLine();
        System.out.println("What is the name of the Song?");
        String name = scanner.nextLine();
        System.out.println("What is its duration?");
        double duration = scanner.nextDouble();
        library.addSong(albumName, name, duration);
    }

    // Playlist
    public static void printBuildPlaylistOptions() {
        System.out.println("Your options are below:");
        System.out.println("0. Quit App\n" + "1. Create your playlist:\n" + "2. Add song to playlist:\n" + "3. Remove song from playlist:\n");
    }

    public static void createPlaylist() {
        System.out.println("What would you like to name the Playlist:");
        String name = scanner.nextLine();
        library.addPlaylist(name);
    }

    public static void addSongToPlaylist() {
        System.out.println("What playlist would you like to use?");
        String playlistName = scanner.nextLine();
        System.out.println("What album is the song in?");
        String albumName = scanner.nextLine();
        System.out.println("What is the name of the Song?");
        String name = scanner.nextLine();
        library.addSongToPlaylist(playlistName, albumName, name);
    }

    public static void removeSongFromPlaylist() {
        System.out.println("What playlist would you like to remove from?");
        String playlistName = scanner.nextLine();
        System.out.println("What song would you like to remove?");
        String songName = scanner.nextLine();

        library.removeSongFromPlayist(playlistName, songName);
    }



    // View Songs
    public static void printViewSongsOptions() {
        System.out.println("Your options are below:");
        System.out.println("0. Quit App\n" + "1. View Albums:\n" + "2. View Songs:\n" + "3. View songs in Playlist:\n");
        // List the songs in the playlist
    }

    public static void viewSongs() {
        System.out.println("What album would you like to view songs from?");
        String albumName = scanner.nextLine();
        library.viewSongs(albumName);
    }

    public static void viewAlbum() {
        library.viewAlbums();
    }



    public static void viewPlaylist() {
        System.out.println("What playlist would you like to view songs from?");
        String playlistName = scanner.nextLine();
        library.viewSongsInPlaylist(playlistName);
    }


    // Listen to songs
    public static void printListenToSong() {
        System.out.println("Your options are below:");
        System.out.println("0. Quit App\n" + "1. Play song:\n" + "2. Next song:\n" + "3. Previous song:\n" + "4. Replay song");
    }
}
