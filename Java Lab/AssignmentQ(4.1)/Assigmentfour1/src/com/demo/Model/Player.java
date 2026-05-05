package com.demo.Model;

public class Player {
    private int playerId;
    private String name;
    private String speciality;

    public Player(int playerId, String name, String speciality) {
        this.playerId = playerId;
        this.name = name;
        this.speciality = speciality;
    }

    public int getPlayerId() {
        return playerId;
    }

    public String getSpeciality() {
        return speciality;
    }

    @Override
    public String toString() {
        return playerId + " " + name + " (" + speciality + ")";
    }
}
