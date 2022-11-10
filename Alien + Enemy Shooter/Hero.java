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
        
        /*if (isAtEdge()){
            setLocation(1, getY());
        }*/
        
        Navigasi();
        shootLaser();
        nabrakMusuh();
    }
    public void Navigasi(){
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-3);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+3);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-3, getY());
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+3, getY());
        }
    }
    
    private int laserTimer = 0;
    public void shootLaser(){
        if(laserTimer == 10){
            getWorld().addObject(new Laser(), getX() +60, getY());
            laserTimer = 0;
        } else{
            laserTimer++;
        }
    }
    
    public void nabrakMusuh(){
        if(isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            setLocation(100,200);
        }
    }
}
