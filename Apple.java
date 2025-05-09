import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage apple = new GreenfootImage("images/apple-fruit.png");
    public Apple() {
        apple.scale(45, 55);
        setImage(apple);    
    }
    
    public void act()
    {
        setLocation(getX(), getY() + 2);
        
        // to remove apple and draw game over
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()) {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
