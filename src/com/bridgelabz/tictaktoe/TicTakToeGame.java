package com.bridgelabz.tictaktoe;

import java.util.Scanner;

public class TicTakToeGame {
    static char[] board = new char[10];

    private static void ticTakToeInitialization() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    private static void playerChose() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player choose X or O");
        char playerChose = scanner.next().charAt(0);
        if (playerChose == 'X' || playerChose == 'x') {
            System.out.println("Player Chosen :" + playerChose);
            System.out.println("Computer Choice O");
        } else if(playerChose == 'O' || playerChose == 'o'){
            System.out.println("Player Chosen O");
            System.out.println("computer Choice X ");
        }else
            System.out.println("Invalid Selection");
    }

    private static void showBoard() {
            System.out.println( board[1] + " | " + board[2] + " | " + board[3] );
            System.out.println("-----------");
            System.out.println( board[4] + " | " + board[5] + " | " + board[6]);
            System.out.println("-----------");
            System.out.println( board[7] + " | " + board[8] + " | " + board[9] );
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tak Toe Game");
        ticTakToeInitialization();
        playerChose();
        showBoard();
    }
}
