package com.avltree;

public class PlayerNode {
	int score;
    String name;
    int height;
    PlayerNode left, right;

    //Constructor to initialize player's details
    PlayerNode(int score, String name) {
        this.score = score;
        this.name = name;
        height = 1;
    }
}
