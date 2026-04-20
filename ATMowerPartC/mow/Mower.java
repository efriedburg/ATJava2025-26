package mow;

public class Mower {
    private int row;
    private int col;
    private int direction;

    public Mower(int row, int col, int direction) {
        this.row = row;
        this.col = col;
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void moveForward() {
        if (direction == 0) {
            row--;
        } else if (direction == 1) {
            col++;
        } else if (direction == 2) {
            row++;
        } else if (direction == 3) {
            col--;
        }
    }

    public void turnLeft() {
        direction--;
        if (direction < 0) {
            direction = 3;
        }
    }

    public void turnRight() {
        direction++;
        if (direction > 3) {
            direction = 0;
        }
    }

    public char senseFront(Yard yard) {
        int nextRow = row;
        int nextCol = col;

        if (direction == 0) {
            nextRow--;
        } else if (direction == 1) {
            nextCol++;
        } else if (direction == 2) {
            nextRow++;
        } else {
            nextCol--;
        }

        return yard.getCell(nextRow, nextCol);
    }

    public char senseRight(Yard yard) {
        int newDirection = direction + 1;
        if (newDirection > 3) {
            newDirection = 0;
        }

        int nextRow = row;
        int nextCol = col;

        if (newDirection == 0) {
            nextRow--;
        } else if (newDirection == 1) {
            nextCol++;
        } else if (newDirection == 2) {
            nextRow++;
        } else {
            nextCol--;
        }

        return yard.getCell(nextRow, nextCol);
    }

    public char senseLeft(Yard yard) {
        int newDirection = direction - 1;
        if (newDirection < 0) {
            newDirection = 3;
        }

        int nextRow = row;
        int nextCol = col;

        if (newDirection == 0) {
            nextRow--;
        } else if (newDirection == 1) {
            nextCol++;
        } else if (newDirection == 2) {
            nextRow++;
        } else {
            nextCol--;
        }

        return yard.getCell(nextRow, nextCol);
    }

    public void cutGrass(Yard yard) {
        yard.setCell(row, col, ' ');
    }

    public void randomizeMower(Yard yard) {
        int corner = (int)(Math.random() * 4);
        direction = (int)(Math.random() * 4);

        if (corner == 0) {
            row = 1;
            col = 1;
        } else if (corner == 1) {
            row = 1;
            col = yard.getWidth();
        } else if (corner == 2) {
            row = yard.getHeight();
            col = 1;
        } else {
            row = yard.getHeight();
            col = yard.getWidth();
        }
    }

    public boolean updateMower(Yard yard) {
        cutGrass(yard);

        if (senseFront(yard) == '+') {
            moveForward();
            return true;
        } else if (senseRight(yard) == '+') {
            turnRight();
            moveForward();
            return true;
        } else if (senseLeft(yard) == '+') {
            turnLeft();
            moveForward();
            return true;
        } else {
            return false;
        }
    }
}