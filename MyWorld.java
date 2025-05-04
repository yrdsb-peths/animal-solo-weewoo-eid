import greenfoot.*;

public class MyWorld extends World {
    
    public int score = 0;
    Label scoreLabel;
    
    public MyWorld() {
        super(600, 400, 1, false);
        
        // Create elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        // Create new label
        scoreLabel = new Label(0, 60);
        addObject(scoreLabel, 20, 20);
        
        createApple();
    }
    
    /**
     * End game, print "Game Over"
     */
    public void gameOver() {
        Label gameOverLabel = new Label("Game Over", 120);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Increase score method
     */
    public void increaseScore() {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void createApple() {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}


