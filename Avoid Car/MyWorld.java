import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    
    static Counter score = new Counter("Score : ");
    static Counter health = new Counter("Hp : ");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        prepare();
    }

    private void prepare()
    {
        Car car = new Car();
        addObject(car,250,530);
        //Score score = new Score();
        //addObject(score,56,560);
        //score.setLocation(57,563);
        Live live = new Live();
        addObject(live,59,497);
        Live live2 = new Live();
        addObject(live2,57,563);
        
        addObject(score, 57,563);
        score.setValue(0);
        
        addObject(health, 59,497);
        health.setValue(3);
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(new CarBlue(), Greenfoot.getRandomNumber(230) + 131, 0);
        }
        if(Greenfoot.getRandomNumber(600)<1){
            addObject(new CarYellow(), Greenfoot.getRandomNumber(230) + 131, 0);
        }
        if(Greenfoot.getRandomNumber(1000)<1){
            addObject(new CarGreen(), Greenfoot.getRandomNumber(230) + 131, 0);
        }
        if(Greenfoot.getRandomNumber(10)<2){
            addObject(new Tree(), Greenfoot.getRandomNumber(95), 0);
            addObject(new Tree(), Greenfoot.getRandomNumber(100) + 400, 0);
        }
        if(Greenfoot.getRandomNumber(2500)<1){
            addObject(new Nyawa(), Greenfoot.getRandomNumber(230) + 131, 0);
        }
        if(MyWorld.health.getValue()==0){
            Greenfoot.setWorld(new GameOver());
        }
    }
}
