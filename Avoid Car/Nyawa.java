import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Randomly has trucks spawn that drive down the road, will not let two trucks spawn on top of eachother
 * also truck will explode if it hits a laser.
 * @author Hubert Jackson Black III
 * @version v0.10
 */
public class Nyawa  extends Actor
{
    /**
     * Act - do whatever the Vehicle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() // main act checks for collisions, makes trucks drive down scree, and removes them at end of world.
    {
        checkCollision();
        runDown();
        nyawaGone();
    }
    
    private void runDown() // moves trucks down the screen at 3 units.
    {
        setLocation(getX(), getY() + 6);
    }
    
    private void checkCollision() // checks if the trucks spawn on top of eachother. will remove one.
    {
        Actor nyawa = getOneIntersectingObject(Nyawa.class);
        if(nyawa != null)
        {
            getWorld().removeObject(nyawa);
            MyWorld.health.add(+1);
        }
     }
     
    private void nyawaGone() // removes trees when they reach the bottom of the world.
     {
         if(getY() >= getWorld().getHeight() -1)
         {
             getWorld().removeObject(this);
         }
     }
}
