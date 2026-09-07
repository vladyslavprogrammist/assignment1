package com.shpp.p2p.cs.vyevtushenko.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part1  extends KarelTheRobot{

    public void run() throws Exception {
        startPosition();
        startMove();
        nextMove();
    }

    private void nextMove() throws Exception{
        while(true) {
            while (frontIsBlocked()) {
                    if(frontIsBlocked() && leftIsBlocked() && rightIsBlocked()) {
                        turnAround();
                        move();
                    }
                    else {
                        if(frontIsBlocked() && rightIsBlocked()) {
                            turnAround();
                        }
                        else {
                            turnRight();
                            move();
                            if (leftIsClear()) {
                                turnLeft();
                                move();
                                if (noBeepersPresent()) {
                                    putBeeper();
                                }
                                while (frontIsClear()) {
                                    move();
                                    if (noBeepersPresent()) {
                                        putBeeper();
                                    }
                                }
                                turnAround();
                            } else {
                                turnRight();
                                if (noBeepersPresent()) {
                                    putBeeper();
                                }
                            }
                        }
                    }
            }
            while (frontIsClear()) {
                move();
                if (noBeepersPresent()) {
                    putBeeper();
                }
            }
            while (frontIsBlocked()) {
                turnLeft();

                if (frontIsClear()) {
                    move();
                    if (noBeepersPresent()) {
                        putBeeper();
                    }
                    turnLeft();
                } else {
                    return;
                }
            }

            while (frontIsClear()) {
                move();
                if (noBeepersPresent()) {
                    putBeeper();
                }
            }

        }
    }

    private void startMove() throws Exception{
        while(frontIsClear()) {
            move();
            if(noBeepersPresent()) {
                putBeeper();
            }
        }
    }

    private void startPosition() throws Exception{
         if(facingWest()) {
            turnRight();
        }
        else {
            turnLeft();
        }
        if(noBeepersPresent())
            putBeeper();
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
