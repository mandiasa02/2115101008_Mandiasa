import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    int currentMaxTurnSpeed = 2;
    int currentLevel = 1;
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Robot robot = new Robot();
        addObject(robot,48,50);

        Block block = new Block(2);
        addObject(block,427,145);

        Wall wall = new Wall();
        addObject(wall,52,147);
        Wall wall2 = new Wall();
        addObject(wall2,159,147);
        Wall wall3 = new Wall();
        addObject(wall3,266,147);
        Wall wall4 = new Wall();
        addObject(wall4,587,147);
        Wall wall5 = new Wall();
        addObject(wall5,692,147);
        Wall wall6 = new Wall();
        addObject(wall6,791,147);

        Home home = new Home();
        addObject(home,751,552);

        Scorepanel scorepanel = new Scorepanel();
        addObject(scorepanel,71,554);

        Pizza pizza = new Pizza();
        addObject(pizza,720,46);
        Pizza pizza2 = new Pizza();
        addObject(pizza2,433,38);
        Pizza pizza3 = new Pizza();
        addObject(pizza3,183,302);
        Pizza pizza4 = new Pizza();
        addObject(pizza4,682,312);
        Pizza pizza5 = new Pizza();
        addObject(pizza5,417,537);
        
        
    }
    
    public void setUpLevel(){
        if(currentLevel == 2){
            currentMaxTurnSpeed++;
            new Block(currentMaxTurnSpeed);
            Pizza pizza6 = new Pizza();
            addObject(pizza6,635,97);
            Pizza pizza7 = new Pizza();
            addObject(pizza7,536,145);
            Pizza pizza8 = new Pizza();
            addObject(pizza8,319,149);
            Pizza pizza9 = new Pizza();
            addObject(pizza9,173,573);
            Pizza pizza10 = new Pizza();
            addObject(pizza10,780,213);
        } else if(currentLevel == 3){
            currentMaxTurnSpeed++;
            new Block(currentMaxTurnSpeed);
            Pizza pizza6 = new Pizza();
            addObject(pizza6,9,211);
            Pizza pizza7 = new Pizza();
            addObject(pizza7,782,215);
            Pizza pizza8 = new Pizza();
            addObject(pizza8,165,582);
            Pizza pizza9 = new Pizza();
            addObject(pizza9,520,141);
            Pizza pizza10 = new Pizza();
            addObject(pizza10,671,550);
        } else if(currentLevel == 4){
            currentMaxTurnSpeed = 5;
            new Block(currentMaxTurnSpeed);
            Pizza pizza6 = new Pizza();
            addObject(pizza6,783,214);
            Pizza pizza7 = new Pizza();
            addObject(pizza7,516,182);
            Pizza pizza8 = new Pizza();
            addObject(pizza8,28,489);
            Pizza pizza9 = new Pizza();
            addObject(pizza9,787,79);
            Pizza pizza10 = new Pizza();
            addObject(pizza10,24,214);
            Pizza pizza11 = new Pizza();
            addObject(pizza11,772,472);
            Wall wall7 = new Wall();
            addObject(wall7,693,252);
            Wall wall8 = new Wall();
            addObject(wall8,107,254);
            Wall wall9 = new Wall();
            addObject(wall9,107,361);
            Wall wall10 = new Wall();
            addObject(wall10,694,112);
            Wall wall11 = new Wall();
            addObject(wall11,694,361);
        }
    }
    
    public void increaseLevel(){
        currentLevel++;
        setUpLevel();
    }
}
    