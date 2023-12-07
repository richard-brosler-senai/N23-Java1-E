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
        
        int qtde=0;
        while (qtde<10){
            qtde++; //qtde = qtde + 1;
            int vel = Greenfoot.getRandomNumber(8)+1; //velocidade
            int ang = Greenfoot.getRandomNumber(360); //angulo
            int pX = Greenfoot.getRandomNumber(getWidth())+1;//posx
            int pY = Greenfoot.getRandomNumber(getHeight())+1;//posy
            //Criando as moscas
            addObject(new Mosca(vel,ang), pX, pY);
        }

    }
    public Abelha getAbelha(){
        return abelha;
    }
}
