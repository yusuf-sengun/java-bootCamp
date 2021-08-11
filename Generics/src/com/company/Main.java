package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team("Adeliade Crows");
        adelaideCrows.addPlayer(joe);
        System.out.println(adelaideCrows.numPlayers());


        Team<BaseballPlayer> baseballTeam = new Team("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        System.out.println(baseballTeam.numPlayers());


        Team<SoccerPlayer> soccerPlayerTeam = new Team("Manchester United");
        soccerPlayerTeam.addPlayer(beckham);
        System.out.println(adelaideCrows.numPlayers());
    }
}
