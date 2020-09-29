package com.company;

public class Robot {
    int x;
    int y;
    Direction direct;

    public Robot(int x, int y, Direction dir) {
        this.x = x;
        this.y = y;
        this.direct = dir;
    }

    public Direction getDirection() {
        return this.direct;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void turnLeft() {
        if (this.direct == Direction.UP) {
            this.direct = Direction.LEFT;
        } else if (this.direct == Direction.DOWN) {
            this.direct = Direction.RIGHT;
        } else if (this.direct == Direction.LEFT) {
            this.direct = Direction.DOWN;
        } else if (this.direct == Direction.RIGHT) {
            this.direct = Direction.UP;
        }

    }

    public void turnRight() {
        if (this.direct == Direction.UP) {
            this.direct = Direction.RIGHT;
        } else if (this.direct == Direction.DOWN) {
            this.direct = Direction.LEFT;
        } else if (this.direct == Direction.LEFT) {
            this.direct = Direction.UP;
        } else if (this.direct == Direction.RIGHT) {
            this.direct = Direction.DOWN;
        }

    }

    public void stepForward() {
        if (this.direct == Direction.UP) {
            ++this.y;
        }

        if (this.direct == Direction.DOWN) {
            --this.y;
        }

        if (this.direct == Direction.LEFT) {
            --this.x;
        }

        if (this.direct == Direction.RIGHT) {
            ++this.x;
        }

    }
}
