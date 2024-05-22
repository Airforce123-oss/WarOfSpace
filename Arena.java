import greenfoot.*;

/**
 * Write a description of class Arena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arena extends World
{

    /**
     * Constructor for objects of class Arena.
     * 
     */
    int timeSpawn=0;
    Counter Skor = new Counter("Skor:");
    GreenfootSound bg = new GreenfootSound("bg.wav");
    public void started(){
        bg.playLoop();
    }

    public void gameOver(){
        bg.stop();
        bg = new GreenfootSound("gameover.wav");
        bg.playLoop();
        //addObject(new GameOver(), 300, 200);
        addObject(new Label("Game Over\nSkor Anda:"+Skor.getValue(),60), 300, 200);
        Greenfoot.stop();
    }

    public void act(){
        timeSpawn++;
        if(timeSpawn>200){
            timeSpawn=0;
            createEnemy();
        }
    }

    public void createEnemy(){
        Enemy musuh = new Enemy();
        addObject(musuh, 
            Greenfoot.getRandomNumber(600),
            Greenfoot.getRandomNumber(300));
        musuh.turn(Greenfoot.getRandomNumber(360));
    }

    public Arena()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Enemy enemy3 = new Enemy();
        addObject(enemy3, 98, 76);
        Enemy enemy4 = new Enemy();
        addObject(enemy4, 376, 162);
        for(int i=0;i<5;i++)
            createEnemy();

        KRI kri = new KRI();
        addObject(kri, 269, 324);

        addObject(Skor, 533, 35);
    }

    public void tambahSkor(){
        Skor.add(50);
    }
}
