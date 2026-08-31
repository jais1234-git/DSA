class Solution {
    public boolean isValidSudoku(char[][] board) {

        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] boxes = new int[9][9];

        for (int r = 0; r < 9; r++) {

            for (int c = 0; c < 9; c++) {

                if (board[r][c] == '.') {
                    continue;
                }

                int val = board[r][c] - '1';

                // Check row
                if (rows[r][val] == 1) {
                    return false;
                }
                rows[r][val] = 1;

                // Check column
                if (cols[c][val] == 1) {
                    return false;
                }
                cols[c][val] = 1;

                // Find 3x3 box
                int box = (r / 3) * 3 + (c / 3);

                // Check box
                if (boxes[box][val] == 1) {
                    return false;
                }
                boxes[box][val] = 1;
            }
        }

        return true;
    }
}