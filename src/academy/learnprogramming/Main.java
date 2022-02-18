package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        League<Team<SoccerPlayer>> premierLeague = new League<>("Premier League");

        /** soccer players */
        SoccerPlayer soccerPlayer1 = new SoccerPlayer("Ronaldo");
        SoccerPlayer soccerPlayer2 = new SoccerPlayer("Salah");
        SoccerPlayer soccerPlayer3 = new SoccerPlayer("Kane");
        SoccerPlayer soccerPlayer4 = new SoccerPlayer("Lacazete");

        /** teams */
        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        Team<SoccerPlayer> arsenal = new Team<>("Arsenal");
        Team<SoccerPlayer> spurs = new Team<>("Tottenham");
        Team<SoccerPlayer> mun_utd = new Team<>("Mun Utd");

        mun_utd.addPlayer(soccerPlayer1);
        liverpool.addPlayer(soccerPlayer2);
        spurs.addPlayer(soccerPlayer3);
        arsenal.addPlayer(soccerPlayer4);
        System.out.println();
        System.out.println("Table:");
        premierLeague.addTeam(liverpool);
        premierLeague.addTeam(arsenal);
        premierLeague.addTeam(spurs);
        premierLeague.addTeam(mun_utd);
        premierLeague.showLeagueTable();
        System.out.println();
        liverpool.matchResult(arsenal, 1,0);
        arsenal.matchResult(liverpool,0,0);
        spurs.matchResult(arsenal,3,0);
        mun_utd.matchResult(spurs,2,0);
        System.out.println();
        System.out.println("Table after 2nd round: ");
        premierLeague.showLeagueTable();
        System.out.println();
        System.out.println("Number of players on " + liverpool.getName() + ": " + liverpool.numOfPlayers());
        System.out.println("Number of players on " + arsenal.getName() + ": " + arsenal.numOfPlayers());
        System.out.println("Number of players on " + spurs.getName() + ": " + spurs.numOfPlayers());
        System.out.println("Number of players on " + mun_utd.getName() + ": " + mun_utd.numOfPlayers());

    }
}