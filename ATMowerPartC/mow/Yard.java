package mow;

public class Yard {
    private char[][] yard;

    public Yard(int height, int width) {
        yard = new char[height + 2][width + 2];

        for (int r = 0; r < yard.length; r++) {
            for (int c = 0; c < yard[r].length; c++) {
                if (r == 0 || r == yard.length - 1 || c == 0 || c == yard[r].length - 1) {
                    yard[r][c] = 'R';
                } else {
                    yard[r][c] = '+';
                }
            }
        }
    }

    public char getCell(int row, int col) {
        return yard[row][col];
    }

    public void setCell(int row, int col, char value) {
        yard[row][col] = value;
    }

    public int getHeight() {
        return yard.length - 2;
    }

    public int getWidth() {
        return yard[0].length - 2;
    }

    public void printYard() {
        for (int r = 0; r < yard.length; r++) {
            for (int c = 0; c < yard[r].length; c++) {
                System.out.print(yard[r][c]);
            }
            System.out.println();
        }
    }

    public void printYard(Mower mower) {
        for (int r = 0; r < yard.length; r++) {
            for (int c = 0; c < yard[r].length; c++) {
                if (r == mower.getRow() && c == mower.getCol()) {
                    if (mower.getDirection() == 0) {
                        System.out.print("^");
                    } else if (mower.getDirection() == 1) {
                        System.out.print(">");
                    } else if (mower.getDirection() == 2) {
                        System.out.print("v");
                    } else {
                        System.out.print("<");
                    }
                } else {
                    System.out.print(yard[r][c]);
                }
            }
            System.out.println();
        }
    }
}