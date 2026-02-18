import java.util.Scanner;
import java.util.Random;

public class Minesweeper {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        char[][] map = new char[9][9];
        char[][] board = new char[9][9];

        int r = 0;
        int c = 0;

        for (r = 0; r < 9; r++) {
            for (c = 0; c < 9; c++) {
                map[r][c] = ' ';
                board[r][c] = '#';
            }
        }

        int mines = 0;
        while (mines < 10) {
            r = rand.nextInt(9);
            c = rand.nextInt(9);

            if (map[r][c] != 'm') {
                map[r][c] = 'm';
                mines++;
            }
        }

        for (r = 0; r < 9; r++) {
            for (c = 0; c < 9; c++) {
                if (map[r][c] != 'm') {
                    int count = 0;
                    int rr = 0;
                    int cc = 0;
                    
                    for (rr = r - 1; rr <= r + 1; rr++) {
                        for (cc = c - 1; cc <= c + 1; cc++) {
                            if (rr >= 0 && rr < 9 && cc >= 0 && cc < 9) {
                                if (!( rr == r && cc == c )) {
                                    if (map[rr][cc] == 'm') {
                                        count++;
                                }
                            }
                        }
                    }
                }

                if (count == 0) {
                    map[r][c] = ' ';
                } else {
                    map[r][c] = (char)('0' + count);
                }

            }
        }
    }

    boolean over = false;

    while (!over) {

        System.out.println();
        for (r = 0; r < 9; r++) {
            for (c = 0; c < 9; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Type 'r' to reveal, 'f' to flag, or 'q' to quit: ");
        String action = sc.next();

        if (action.equals("q")) {
            over = true;
        } else {
            System.out.println("Row (0-8):");
            int row = sc.nextInt();
            System.out.println("Column (0-8):");
            int col = sc.nextInt();

            if (row < 0 || row > 8 || col < 0 || col > 8) {
                System.out.println("This selection is invalid.");
            } else {
                if (action.equals("f")) {
                    if (board[row][col] == '#') {
                        board[row][col] = 'f';
                    } else if (board[row][col] == 'f') {
                        board[row][col] = '#';
                    } else {
                        System.out.println("This selection is already revealed.");
                    }
                } else if (action.equals("r")) {
                    if (board[row][col] == 'f') {
                        System.out.println("This selection is flagged.");
                    } else {
                        if (map[row][col] == 'm') {
                            board[row][col] = 'm';

                            for (r = 0; r < 9; r++) {
                                for (c = 0; c < 9; c++) {
                                    if (map[r][c] == 'm') {
                                        board[r][c] = 'm';
                                    }
                                }
                            }

                            System.out.println();
                            for (r = 0; r < 9; r++) {
                                for (c = 0; c < 9; c++) {
                                    System.out.print(board[r][c] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println("Game Over! You hit a mine.");
                            over = true;

                        } else {
                            board[row][col] = map[row][col];

                            int safe = 0;
                            int revealed = 0;

                            for (r = 0; r < 9; r++) {
                                for (c = 0; c < 9; c++) {
                                    if (map[r][c] != 'm') {
                                        safe++;
                                    }
                                    if (board[r][c] != '#' && board[r][c] != 'f' && map[r][c] != 'm') {
                                        revealed++;
                                    }
                            }
                            if (revealed == safe) {
                                System.out.println("Congratulations! You've won!");
                                over = true;
                            }
                    }
                }
            }
            }
        }
        }

}
    }
}