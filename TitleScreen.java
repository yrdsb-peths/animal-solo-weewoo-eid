import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The title screen of the game
 * 
 * @author Dylan Tam 
 * @version May 9 2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 80);
    /**
     * Constructor for objects of class TitleScreen.
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, 300, 150);
    }
    
    /**
     * Main world act loop: Starts game if user presses space bar
     */
    public void act() {
        if(Greenfoot.isKeyDown("space")) {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }    
}
