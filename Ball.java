import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    public void act()
    {
        move(-8);
        
        if(getX() <= 0) {
            resetBall();
        }
        
        if(isTouching(Hero.class)){
            //add game over
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
    public void resetBall() {
        int num = Greenfoot.getRandomNumber(3);
        if(num == 0) {
            setLocation(600,100); 
        } else {
            setLocation(600, 300);
        }
    }
}
