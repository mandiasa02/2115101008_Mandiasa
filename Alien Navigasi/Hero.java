import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //move(4);
        
        //if (isAtEdge())
            //setLocation(1, getY());
        
        Navigasi();
    }
    public void Navigasi(){
        if(Greenfoot.isKeyDown("w")){
            setRotation(270);
            move(3);
        } else if(Greenfoot.isKeyDown("s")){
            setRotation(90);
            move(3);
        } else if(Greenfoot.isKeyDown("a")){
            setRotation(180);
            move(3);
        } else if(Greenfoot.isKeyDown("d")){
            setRotation(360);
            move(3);
        }
    }
}
