import greenfoot.*;

/**
 * Write a description of class Ammo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ammo extends SmoothMover
{
    /**
     * Act - do whatever the Ammo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        if(isAtEdge()) //tanya apakah mojok
            getWorld().removeObject(this);
            else if(isTouching(Enemy.class))
            {
                removeTouching(Enemy.class);//enemy hilang
                 Blast blast = new Blast();//ledakan
                 getWorld().addObject(blast, getX(), getY());
                                  
                 ((Arena)getWorld()).tambahSkor();
                 Greenfoot.playSound("enemy-fire.wav");
                getWorld().removeObject(this); //pluru hilang
               
            }
        }    
    }

