package com.shpp.p2p.cs.vyevtushenko.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part3 extends KarelTheRobot{
    public void run() throws Exception {
        startPosition();
        startMove();
    }

    private void startMove() throws Exception{
        while(true) {
            for(int i = 0; i < 8; i++) {
                for(int j = 0; j < 7; j++) {
                    if(i == 7 && j == 6) {
                        putBeeper();
                        return;
                    }
                    if(j % 2 != 0 && i % 2 == 0) {
                        putBeeper();
                    }
                    if(j % 2 == 0 && i % 2 != 0) {
                        putBeeper();
                    }
                    if(frontIsBlocked()) {
                        if(i % 2 == 0) {
                            turnLeft();
                            move();
                            turnLeft();
                        }
                        else {
                            turnRight();
                            move();
                            turnRight();
                        }
                    }
                    else {
                        move();
                    }

                }

            }

        }
    }

    private void startPosition() throws Exception{
        if(facingWest()) {
            turnAround();
        }
        else if(facingNorth()){
            turnRight();
        } else if (facingSouth()) {
            turnLeft();
        }

        say("GO KAREL");
    }

    private void turnAround() throws Exception{
        turnLeft();
        turnLeft();
    }

    private void turnRight() throws Exception{
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
