package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /** football players */
//        FootballPlayer footballPlayer = new FootballPlayer("Tom Brady");


        /** soccer players */
        SoccerPlayer soccerPlayer = new SoccerPlayer("Ronaldo");
        SoccerPlayer soccerPlayer2 = new SoccerPlayer("Salah");
        SoccerPlayer soccerPlayer3 = new SoccerPlayer("Kane");
        SoccerPlayer soccerPlayer4 = new SoccerPlayer("Jota");

        /** basketball players */
//        BasketballPlayer basketballPlayer = new BasketballPlayer("Curry");

//        Team<FootballPlayer> footballTeam1 = new Team<>("New England Patriots");
//        Team<FootballPlayer> footballTeam2 = new Team<>("LA Rams") ;
//        footballTeam1.addPlayer(footballPlayer);

        /** results */
//        footballTeam1.matchResult(footballTeam2,24,34);
//        footballTeam2.matchResult(footballTeam1,34,24);

//        System.out.println("Number of players on the team: " + footballTeam1.numOfPlayers());

        System.out.println();
        Team<SoccerPlayer> liverpool = new Team<>("Liverpool");
        Team<SoccerPlayer> arsenal = new Team<>("Arsenal");
        Team<SoccerPlayer> spurs = new Team<>("Tottenham");
        liverpool.addPlayer(soccerPlayer);
        liverpool.addPlayer(soccerPlayer2);
        spurs.addPlayer(soccerPlayer3);
        arsenal.addPlayer(soccerPlayer4);

        liverpool.matchResult(arsenal, 1,0);
        arsenal.matchResult(liverpool,0,0);
        spurs.matchResult(arsenal,3,0);

        System.out.println("Number of players on the team Liverpool: " + liverpool.numOfPlayers());
        System.out.println("Number of players on the team Arsenal: " + arsenal.numOfPlayers());
        System.out.println("Rankings for soccer clubs: ");
        System.out.println(liverpool.getName() + ": " + liverpool.ranking() + " points.");
        System.out.println(arsenal.getName() + ": " + arsenal.ranking() + " points.");
        System.out.println(spurs.getName() + ": " + spurs.ranking() + " points.");
        System.out.println(liverpool.compareTo(spurs));
        System.out.println(spurs.compareTo(liverpool));

//        System.out.println();
//        Team<BasketballPlayer> basketTeam = new Team<>("Brooklyn Nets");
//        basketTeam.addPlayer(basketballPlayer);
//        System.out.println("Number of players on the team: " + basketTeam.numOfPlayers());


    }
}