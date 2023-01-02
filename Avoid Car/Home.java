import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{
    public GreenfootSound music = new GreenfootSound("spyhunter.wav");
    public void started(){
        music.setVolume(100);
        music.playLoop();
    }
    
    public void stopped(){
        music.stop();
        music.pause();
    }

    /**
     * Constructor for objects of class Home.
     * 
     */
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,196,406);
        start.setLocation(123,536);
    }
}
