import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta classe representa a classe Abelha para o jogo BeeWorld.
 * 
 * @author Richard Brosler 
 * @version 01-12-2023
 */
public class Abelha extends Actor
{
    /**
     * Act - Método que é executado quando apertamos os botões
     * Act ou o botão Run na tela inicial do Greenfoot.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if (Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")){
            turn(5);
        }
    }
    
}
