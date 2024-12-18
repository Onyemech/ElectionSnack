package codingChallenges;


import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {
        char [] [] board = {{' ',' ',' '},
                {' ',' ',' '},{' ',' ',' '}};
        print(board);

        Scanner sc = new Scanner(System.in);
        System.out.print("Where would you like to play? ");
        String userInput = sc.nextLine();

        switch (userInput) {
            case "1":
                board[0][0] = 'X';
                break;
            case "2":
                board[0][1] = 'X';
                break;
             case "3":
                 board[0][2] = 'X';
                 break;
             case "4":
                 board[0][3] = 'X';
                 break;
             case "5":
                 board[0][4] = 'X';
                 break;
             case "6":
                 board[0][5] = 'X';
                 break;
             case "7":
                 board[0][6] = 'X';
                 break;
             case "8":
                 board[0][7] = 'X';
                 break;
             case "9":
                 board[0][8] = 'X';
                 break;
             default:
                 System.out.println(":(");

        }
        print(board);
    }

    private static void print(char[][] board) {

        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}
