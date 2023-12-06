import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeeWorld extends World
{
    Abelha abelha;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        abelha = new Abelha();
        addObject(abelha,72,79);
        Aranha aranha = new Aranha();
        addObject(aranha,28,337);
        
        addObject(new Mosca(),60,180);

        addObject(new Mosca(), Greenfoot.getRandomNumber(800)+1,
            Greenfoot.getRandomNumber(600)+1);
        addObject(new Mosca(), Greenfoot.getRandomNumber(800)+1,
            Greenfoot.getRandomNumber(600)+1);
        addObject(new Mosca(), Greenfoot.getRandomNumber(800)+1,
            Greenfoot.getRandomNumber(600)+1);

    }
    public Abelha getAbelha(){
        return abelha;
    }
}
