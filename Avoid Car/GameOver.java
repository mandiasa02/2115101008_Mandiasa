import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        prepare();
    }
    //int score = 0;
    public void act() 
    {   
        //getWorld().showText("Game Over\nScore :  ");
        //Greenfoot.stop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ;
        TryAgain tryAgain = new TryAgain();
        addObject(tryAgain,195,465);
        Come come = new Come();
        addObject(come,309,465);
        come.setLocation(302,459);
        tryAgain.setLocation(202,460);
    }
}
