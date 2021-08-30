package com.bridgelabz.tictaktoe;

import java.util.Scanner;

public class TicTakToeGame {
     static char[] board=new char[10];
    public static void ticTakToeInitialization(){
        for( int i=1;i<board.length;i++){
            board[i]=' ';
        }
    }
     static void playerChose(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Player choose X or O");
        char playerChoose=scanner.next().charAt(0);
        if(playerChoose== 'X' || playerChoose == 'x'){
            System.out.println("Player Chosen X");
            System.out.println("Computer Choice O");
        }else {
            System.out.println("Player Chosen O");
            System.out.println("computer Choice X ");
        }


    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tak Toe Game");
        ticTakToeInitialization();
        playerChose();
    }
}
