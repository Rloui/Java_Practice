package com.roger;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public static Song createSong(String title, Double duration) {
        System.out.println("This song has been Created: " + title + " duration of: " + duration);
        return new Song(title, duration);
    }
}
