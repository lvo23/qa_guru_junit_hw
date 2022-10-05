package com.lvo23.enums;

/**
 * @author Vlad Litvinov
 */
public enum Team {

    RED_BULL(
            "Red Bull Racing",
            "Red Bull"),
    MERCEDES(
            "Mercedes-AMG Petronas Formula One Team",
            "Mercedes AMG F1"),
    FERRARI(
            "Scuderia Ferrari",
            "Scuderia Ferrari");

    private final String name;

    private final String cutName;

    Team(String name, String cutName) {

        this.name = name;
        this.cutName = cutName;
    }

    public String getName() {

        return name;
    }

    public String getCutName() {

        return cutName;
    }

    @Override
    public String toString() {

        return "Team{" + "name='" + name + '\'' + ", cutName='" + cutName + '\'' + '}';
    }
}
