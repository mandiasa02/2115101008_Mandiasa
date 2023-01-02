import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemy extends Actor
{
    
    public void act() 
    {
        spawn();
    }
    int speed = 5;
    protected void spawn(){
        Enemy a = new Enemy();
        Actor i = getOneIntersectingObject(Enemy.class);
        move(speed);
        checkdouble(i);
        end();
    }
    
    
    protected void end(){
        if(getY() >= 599||getY() <=0){
            getWorld().removeObject(this);
        }
    }
    
    protected void checkdouble(Actor i){
      if(  i != null){
          getWorld().removeObject(i);
        }
    }
    
    public void move(int speed){
        setLocation(getX(),getY() + speed);
    }
    
}
