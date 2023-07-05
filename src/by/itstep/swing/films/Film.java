package by.itstep.swing.films;

import java.util.Date;

public class Film  {
    private long uid;
    private double imdbRate;
    private String name;
    private String type;
    private Date releaseDate;
    private Actors[] actors;

    public Film(long uid, double imdbRate, String name, String type, Date releaseDate, Actors[] actors) {
        this.uid = uid;
        this.imdbRate = imdbRate;
        this.name = name;
        this.type = type;
        this.releaseDate = releaseDate;
        this.actors = actors;
    }




}
