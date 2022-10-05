package com.lvo23.enums;

/**
 * @author Vlad Litvinov
 */
public enum Team {

    RED_BULL ("Red Bull Racing"),
    MERCEDES ("Mercedes-AMG Petronas Formula One Team"),
    FERRARI ("Scuderia Ferrari");

    private final String name;

    Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                '}';
    }
}
