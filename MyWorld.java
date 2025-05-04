import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        // Create elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        // Create new label
        Label scoreLabel = new Label(0, 60);
        addObject(scoreLabel, 20, 20);
        
        createApple();
    }
    
    public void createApple() {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}


