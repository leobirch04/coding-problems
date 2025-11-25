package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class sudoku {



    public static boolean isValidSudoku(char[][] board) {
        int len = board[0].length;
        for (int x = 0; x < len; x++){
            

            Map<Character, Integer> freqHorMap = new HashMap<>();
            Map<Character, Integer> freqVerMap = new HashMap<>();

            for(int i = 0; i < len; i++){
                freqHorMap.put( board[x][i],freqHorMap.getOrDefault( board[x][i] , 0) + 1);
                freqVerMap.put( board[i][x],freqVerMap.getOrDefault( board[i][x] , 0) + 1);
            }

            Iterator<Map.Entry<Character, Integer>> it1 = freqHorMap.entrySet().iterator();
            Iterator<Map.Entry<Character, Integer>> it2 = freqVerMap.entrySet().iterator();

            while (it1.hasNext() && it2.hasNext()) {
                Map.Entry<Character, Integer> e1 = it1.next();
                Map.Entry<Character, Integer> e2 = it2.next();

                if (e1.getValue() > 1 && e1.getKey() != '.') {
                    return false;
                    
                }
                if (e2.getValue() > 1 && e2.getKey() != '.') {
                    return false;
                    
                }
            }

            


        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){

            }
        }


        return true;
    }



    public boolean isValidSudoku1(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int boxIndex = (i / 3) * 3 + (j / 3);

                    if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                        return false;
                    }

                    rows[i][num] = cols[j][num] = boxes[boxIndex][num] = true;
                }
            }
        }
        return true;
    }
    

    public static void main(String[] args) {
        
    }
    
}
