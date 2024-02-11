package org.example.lesson5.ismayil;

public class Eyup {

    public static int solution(char[][] matrix, String[] words) {
        int count = 0;
        for (String word : words) {
            if (searchWord(matrix, word)) {
                count++;
            }
        }
        return count;
    }

    private static boolean searchWord(char[][] matrix, String word) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Explore all possible starting points in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (searchFromCell(matrix, word, i, j, 0)) {
                    return true; // Word found, no need to continue searching
                }
            }
        }
        return false; // Word not found
    }

    private static boolean searchFromCell(char[][] matrix, String word, int row, int col, int index) {
        if (index == word.length()) {
            return true; // Entire word is found
        }

        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length
                || matrix[row][col] != word.charAt(index)) {
            return false; // Out of bounds or character mismatch
        }

        char temp = matrix[row][col];
        matrix[row][col] = ' '; // Mark the cell as visited

        // Explore in top and bottom directions
        boolean found = searchFromCell(matrix, word, row - 1, col, index + 1)
                || searchFromCell(matrix, word, row + 1, col, index + 1);

        // Explore in left and right directions
        found = found || searchFromCell(matrix, word, row, col - 1, index + 1)
                || searchFromCell(matrix, word, row, col + 1, index + 1);

        matrix[row][col] = temp; // Backtrack: restore the original character
        return found;
    }

    public static void main(String[] args) {
        char[][] matrix = {
                {'c', 'o', 'd', 'g'},
                {'a', 't', 'e', 'r'},
                {'z', 'o', 'p', 's'}
        };

        String[] words = {"code", "signal", "coder", "cat", "dog", "top", "spot"};

        int result = solution(matrix, words);
        System.out.println(result); // Output: 3
    }



    public int multiply(int x, int y) {
        return x * y;
    }
    public double multiply(double x, double y) {
        return x * y;
    }

    public void display(String message) { }
    public void display(String msg, int times) { }

}
