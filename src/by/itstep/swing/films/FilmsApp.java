package by.itstep.swing.films;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class FilmsApp extends JFrame {

    private static Film[] db = new Film[128];

    static {
        Actors actor1 = new Actors(123, "Will Smith");
        Actors actor2 = new Actors(324, "Martin Lawrence");
        Actors actor3 = new Actors(451, "Lisa Boyle");
        Actors[] actors = {actor1, actor2, actor3};
        Film film1 = new Film(321,7.6, "Bad Boys", "Action", new Date(), actors);

        Actors[] actors2 = {actor1, actor2};
        Film film2= new Film(431,7.1, "Bad Boys 2", "Action", new Date(), actors2);

        Actors[] actors3 = {new Actors(4312, "Leonardo DiCaprio"), new Actors(534, "Kate Winslet"), new Actors(5464, "Billy Zane")};
        Film film3= new Film(789,7.9, "Titanic", "Action", new Date(), actors3);

        db[0] = film1;
        db[1] = film2;
        db[2] = film3;

    }

    public FilmsApp(){
        setTitle("Crazy Films Application");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);

        JLabel uidLbl = new JLabel("Unique ID:");
        JLabel imdbRateLbl = new JLabel("IMDB Rate:");
        JLabel nameLbl = new JLabel("Name:");
        JLabel typeLbl = new JLabel("Type:");
        JLabel dateLbl = new JLabel("Release:");
        JLabel actorsLbl = new JLabel("Stars:");

        JTextField uidText = new JTextField();
        JTextField imdbRateText = new JTextField();
        JTextField nameText = new JTextField();
        JTextField typeText = new JTextField();
        JTextField dateText = new JTextField();
        JTextField actorsText = new JTextField();

        uidLbl.setBounds(20,40,120,20);
        imdbRateLbl.setBounds(20,65,120,20);
        nameLbl.setBounds(20,85,120,20);
        typeLbl.setBounds(20,105,120,20);
        dateLbl.setBounds(20,125,120,20);
        actorsLbl.setBounds(20,145,120,20);

        uidText.setBounds(100,40,120,20);
        imdbRateText.setBounds(100,65,120,20);
        nameText.setBounds(100,85,120,20);
        typeText.setBounds(100,105,120,20);
        dateText.setBounds(100,125,120,20);
        actorsText.setBounds(100,145,120,20);

        boarding(uidLbl, imdbRateLbl, nameLbl, typeLbl, dateLbl, actorsLbl);
        boarding(uidText, imdbRateText, nameText, typeText, dateText, actorsText);

        setVisible(true);

    }


    private void boarding(Component... components){
        for (Component c: components) {
            add(c);
        }
    }

    public static void main(String[] args) {
        new FilmsApp();
    }

}

