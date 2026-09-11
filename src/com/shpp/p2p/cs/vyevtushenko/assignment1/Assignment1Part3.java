package com.shpp.p2p.cs.vyevtushenko.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part3 extends KarelTheRobot{
    public void run() throws Exception {
        startPosition();
        startMove();
    }

    private void startMove() throws Exception{
        while(true) {
                while(frontIsClear()) {
                    move();
                    putBeeper();
                    move();
                }
                turnLeft();
                move();
                turnLeft();

                while(frontIsClear()) {
                    putBeeper();
                    move();
                    move();
                }
                putBeeper();
                if(frontIsBlocked() && rightIsBlocked()) {
                    return;
                }
                turnRight();
                move();
                turnRight();



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
