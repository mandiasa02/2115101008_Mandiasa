import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Car extends Actor
{
    int score = 0;
    
    public void act() 
    {   
        //getWorld().showText("Score : " + score/10, 58, 562);
        MyWorld.score.add(100);
        checkKey();
        checkCollision();
        detectnyawaCollision();
        score++;
    }
    
    public void checkKey(){
        if(Greenfoot.isKeyDown("a")){
            if(getX()>= 135){
                setLocation(getX() -3, getY());
            }
        }
        if(Greenfoot.isKeyDown("d")){
            if(getX()<= 365){
                setLocation(getX() +3, getY());
            }
        }
        if(Greenfoot.isKeyDown("w")){            
                setLocation(getX(), getY() -3);            
        }
        if(Greenfoot.isKeyDown("s")){            
                setLocation(getX(), getY() +3);            
        }
    }
    
    public void checkCollision() // increases damage of car when it hits a Vehicle.
    {
        Actor actor = getOneIntersectingObject(Enemy.class);
        if (isTouching(Enemy.class))
        {
            getWorld().addObject(new Boom(), getX(), getY());
            removeTouching(Enemy.class);
            MyWorld.health.add(-1);
            setLocation(250,530);
            Greenfoot.playSound("crash.wav");
        }
    }
    
    public void detectnyawaCollision()
    {
        if (isTouching(Nyawa.class))
        {
            removeTouching(Nyawa.class);
            MyWorld.health.add(+1);
       }
    }
}
