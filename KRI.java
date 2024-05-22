import greenfoot.*;

/**
 * Write a description of class KRI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KRI extends SmoothMover
{
    /**
     * Act - do whatever the KRI wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("up"))
            move(3);
        else if(Greenfoot.isKeyDown("down"))
            move(-1);
        
        if(Greenfoot.isKeyDown("right"))
            turn(1);
        else if(Greenfoot.isKeyDown("left"))
            turn(-1);
        if(("space").equals(Greenfoot.getKey()))
        {
            Ammo ammo = new Ammo();
            getWorld().addObject(ammo, getX(), getY());
            ammo.turn(getRotation());
            //ada pluru keluar dari KRI
            Greenfoot.playSound("kri-fire.wav");
        }
        if(isTouching(Enemy.class)){
            ((Arena)getWorld()).gameOver();
            Blast blast = new Blast();
            getWorld().addObject(blast, getX(), getY());
            
            Greenfoot.playSound("blast.wav");
            getWorld().removeObject(this);
        }
    }    
}
 