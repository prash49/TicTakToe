package com.bridgelabz.tictaktoe;

public class TicTakToeGame {
     static char[] board=new char[10];
    public static void ticTakToeInitialization(){
        for( int i=1;i<board.length;i++){
            board[i]=' ';
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tak Toe Game");
        ticTakToeInitialization();
    }
}
