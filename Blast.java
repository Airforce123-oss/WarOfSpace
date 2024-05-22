import greenfoot.*;

/**
 * Write a description of class Blast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blast extends SmoothMover
{
    /**
     * Act - do whatever the Blast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timer=0;
    public void act() 
    {
        // Add your action code here.
        //timer=timer + 1;
        timer++;
        if(timer>200)
            getWorld().removeObject(this);
    }    
}
