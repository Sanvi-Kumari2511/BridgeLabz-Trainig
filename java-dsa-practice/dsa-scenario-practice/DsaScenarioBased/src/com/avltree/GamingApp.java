package com.avltree;

public class GamingApp {
	public static void main(String[] args) {

        LeaderBoard leaderboard = new LeaderBoard();

        //Inserting players
        leaderboard.root = leaderboard.insert(leaderboard.root, 500, "Sanvi");
        leaderboard.insert(leaderboard.root, 600, "Shivani");
        leaderboard.insert(leaderboard.root, 400, "Sandip");
        leaderboard.insert(leaderboard.root, 800, "Sanvi");
        leaderboard.insert(leaderboard.root, 700, "Ashu");

        //Displaying top players
        System.out.println("Top Players:");
        leaderboard.showTopPlayers(leaderboard.root, new int[]{0});
    }
}
