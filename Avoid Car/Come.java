import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Come here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Come extends Button
{
    /**
     * Act - do whatever the Come wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.press();
        if (Greenfoot.mousePressed(this)){
            Greenfoot.delay(6);
            Greenfoot.setWorld(new Home());
        }
    }
}
