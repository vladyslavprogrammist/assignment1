package com.shpp.p2p.cs.vyevtushenko.assignment1;

import com.shpp.karel.KarelTheRobot;

public class Assignment1Part2 extends KarelTheRobot{
    public void run() throws Exception {
        startPosition();
        startMove();
    }

    private void startMove() throws Exception{

           move();
           while(frontIsClear()) {
               putBeeper();
               move();
           }
           if(frontIsBlocked())
           {
               turnAround();
               move();
           }


               while (frontIsClear() && beepersPresent()) {
                   if(beepersPresent())
                   {
                       pickBeeper();
                       move();
                   }
                   while(beepersPresent()) {
                       move();
                   }
                   if(noBeepersPresent()) {
                       turnAround();
                       move();
                   }

               }
               turnLeft();
               putBeeper();
               while(frontIsClear()) {
                   move();
                   putBeeper();
               }
           /* if(frontIsBlocked() && rightIsBlocked()) {
                putBeeper();
                return;
            }*/


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
