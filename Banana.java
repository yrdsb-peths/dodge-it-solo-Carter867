import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
{

    public void act()
    {
        move(-10);
        
        if(getX() <= 0) {
            resetBanana();
        }
        
        if(isTouching(Hero.class)){
            getWorld().removeObject(this);
        }
    }
    public void resetBanana() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600,100); 
        } else {
            setLocation(600, 300);
        }
    }
}
