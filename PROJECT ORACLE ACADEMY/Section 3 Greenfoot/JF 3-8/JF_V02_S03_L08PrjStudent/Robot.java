import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int lives = 3;
    int pizzaEaten = 0;
    int score = 0;
    
    public void act()
    {
        // Add your action code here.
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
        showStatus();
    }
    
    public void robotMovement(){
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-2);
            animate();
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+2);
            animate();
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-2, getY());
            animate();
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+2, getY());
            animate();
        }
        
    }
    
    public void detectWallCollision(){
        if(isTouching(Wall.class)){
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    
    public void detectBlockCollision(){
        if(isTouching(Block.class)){
            setLocation(48,50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    
    public void detectHome(){
        if(isTouching(Home.class)){
            setLocation(48,50);
            Greenfoot.playSound("yipee.wav");
            if (pizzaEaten==5){
                pizzaEaten = 0;
            }
            increaseScore();
        }
    }
    
    public void eatPizza(){
        if(isTouching(Pizza.class)){
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
        }
    }
    
    private GreenfootImage robotimage1= new GreenfootImage("man01.png");
    private GreenfootImage robotimage2= new GreenfootImage("man02.png");
    
    public void animate(){
        if(getImage().equals(robotimage1)){
            setImage(robotimage2);
        } else{
            setImage(robotimage1);
        }
    }
    
    public void removeLife(){
        lives--;
        testEndGame();
        showStatus();
    }
    
    public void testEndGame(){
        if (lives < 0){
            setImage("gameover.png");
            Greenfoot.stop();
            lives = 3;
        }
    }
    
    public void increaseScore(){
        score++;
        showStatus();
    }
    
    public void showStatus(){
        getWorld().showText("Score : "+ score, 71, 530);
        getWorld().showText("Pizza : "+ pizzaEaten, 71, 550);
        getWorld().showText("Lives : "+ lives, 71, 570);
    }
}

