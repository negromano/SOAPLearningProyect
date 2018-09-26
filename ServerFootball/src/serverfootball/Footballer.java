package serverfootball;

import java.io.Serializable;

public class Footballer implements Serializable{
    
    private String id, forename, surname, position, club;
    private int number;
    private double height;
    
    public Footballer() {
    }

    public Footballer(String id, String forename, String surname, String position,
                     String club, int number, double height) {
        this.id = id;
        this.forename = forename;
        this.surname = surname;
        this.position = position;
        this.club = club;
        this.number = number;
        this.height = height;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getForename() {
        return forename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getClub() {
        return club;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
