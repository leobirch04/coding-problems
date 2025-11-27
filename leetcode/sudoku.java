package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class sudoku {



    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character> row = new HashSet<>();
        HashSet<Character> column = new HashSet<>();
        ArrayList<HashSet<Character>> squares = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            squares.add(new HashSet<Character>());
        }

        for (int i = 0; i < board.length; i++) {
            row.clear();
            column.clear();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.' ) {
                    boolean check = row.add(board[i][j]);
                    if (!check) {
                        return false;
                    }
                    int square_row = i / 3;     
                    int square_col = j / 3;       
                    int box = square_row + 3 * square_col;
                    HashSet<Character> set = squares.get(box);
                    check = set.add(board[i][j]);
                    if (!check) {
                        return false;
                    }
                }
                if (board[j][i] != '.' ) {
                    boolean check = column.add(board[j][i]);
                    if (!check) {
                        return false;
                    }
                }
                
                
            }
        }


        return true;
    }


    
}
