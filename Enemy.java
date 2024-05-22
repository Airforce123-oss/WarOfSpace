import greenfoot.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author (anggota kelompok) 
 * @version (new era)
 */
public class Enemy extends SmoothMover {
    private static final int MOVE_SPEED = 1;
    private static final int RANDOM_TURN_DEGREES = 10;
    private static final int EDGE_TURN_DEGREES = 100;

    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        moveRandomly();
        checkEdgeAndTurn();
    }

    /**
     * Moves the enemy randomly.
     */
    private void moveRandomly() {
        move(MOVE_SPEED);
        turn(Greenfoot.getRandomNumber(RANDOM_TURN_DEGREES) - RANDOM_TURN_DEGREES / 2);
    }

    /**
     * Checks if the enemy is at the edge and makes it turn if it is.
     */
    private void checkEdgeAndTurn() {
        if (isAtEdge()) {
            turn(EDGE_TURN_DEGREES);
            move(MOVE_SPEED);
        }
    }
}
