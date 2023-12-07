import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mosca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mosca extends Inseto
{
    //Fields
    private int velocidade = 1;
    private int angulo = 0;
    //Constructors
    public Mosca(int pVelocidade, int pAngulo){
        velocidade = pVelocidade;
        angulo = pAngulo;
        setRotation(angulo);
    }
    
    public Mosca(){
        turn(Greenfoot.getRandomNumber(90)-45);
    }
    //Metodos
    /**
     * Act - do whatever the Mosca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        verificaCanto();
    }
}
