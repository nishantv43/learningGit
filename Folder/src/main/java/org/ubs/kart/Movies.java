package org.ubs.kart;

import java.util.Date;

public class Movies {
    private int id;
    private String title;

    private Date yearReleased;

    private String director;
    private String genre;

    public Movies(int id, String title, Date yearReleased, String director, String genre) {
        this.id = id;
        this.title = title;
        this.yearReleased = yearReleased;
        this.director = director;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(Date yearReleased) {
        this.yearReleased = yearReleased;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
