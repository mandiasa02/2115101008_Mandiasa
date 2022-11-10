import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy(){
        setRotation(180);
    }
    public Enemy(int kecepatan){
        setRotation(180);
        this.kecepatan = kecepatan;
    }
    private int kecepatan = 2;
    
    public void act()
    {
        // Add your action code here.
        enemyMove();
    }
    
    protected void enemyMove(){
        move(kecepatan);
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    
}
