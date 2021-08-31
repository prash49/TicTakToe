package com.bridgelabz.tictaktoe;

import java.util.Random;
import java.util.Scanner;

public class TicTakToeGame {
    static char[] board = new char[10];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static char playerChoice;

    private static void ticTakToeInitialization() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    private static void tossToPlay() {
        System.out.println("Tossing To Check who Plays First");
        int toss = random.nextInt(2);
        if (toss == 0) {
            System.out.println("Its Heads Player Plays first");
        } else {
            System.out.println("Its Tails Computer Plays first");
        }
    }

    private static void playerChose() {
        System.out.println("Player choose X or O");
        playerChoice = scanner.next().charAt(0);
        if (playerChoice == 'X' || playerChoice == 'x') {
            System.out.println("Player Chosen :" + playerChoice);
            System.out.println("Computer Choice O");
        } else if (playerChoice == 'O' || playerChoice == 'o') {
            System.out.println("Player Chosen O");
            System.out.println("computer Choice X ");
        } else
            System.out.println("Invalid Selection");
    }

    private static void showBoard() {
        System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(board[7] + " | " + board[8] + " | " + board[9]);
    }

    private static void playerMove() {
        System.out.println("Select Position in Index to Move in Board (1 to 9) : ");
        int indexNumber = scanner.nextInt();
        if (indexNumber < 1 || indexNumber > 9) {
            System.out.println("You Entered Invalid Position ");
            playerMove();
        } else if (board[indexNumber] != ' ') {
            System.out.println("The Index already occupied kindly Chose other index " +
                    "by observing Game Board ");
            playerMove();
        } else {
            board[indexNumber] = playerChoice;
            showBoard();
        }
    }

    public static void main(String[] args) {
        System.out.println("_______XOX______________Welcome to Tic Tak Toe Game_________OXO________________");
        ticTakToeInitialization();
        tossToPlay();
        playerChose();
        showBoard();
        playerMove();
    }
}
