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
        reposicionar();
        capturaMosca();
    } 

    /**
     * Função que verifica se a abelha está na direita do mundo
     */
    public boolean isAtDireita(){
        boolean ret = false;
        if (getX()>getWorld().getWidth()-20){
            ret = true;
        }
        return ret;
    }

    /**
     * Função que verifica se a abelha está na esquerda do mundo
     */
    public boolean isAtEsquerda(){
        return getX()<20;   
    }

    /**
     * Função que verifica se abelha está na base do mundo
     */
    public boolean isAtBase(){
        return getY()>getWorld().getHeight()-20;
    }

    /**
     * Função que verifica se abelha está no topo do mundo
     */
    public boolean isAtTopo(){
        return getY()<20;
    }

    /**
     * Procedimento que reposiciona a abelha se estiver em um 
     * dos cantos
     */
    public void reposicionar(){
        if (isAtDireita()){
            setLocation(20, getY());
        } else if (isAtEsquerda()){
            setLocation(getWorld().getWidth()-20, getY());
        } else if (isAtTopo()) {
            setLocation(getX(), getWorld().getHeight()-20);
        } else if(isAtBase()){
            setLocation(getX(), 20);
        }
    }
    /**
     * Procedimento que verifica se captura a mosca
     */
    public void capturaMosca(){
        if (isTouching(Mosca.class)){
            removeTouching(Mosca.class);
        }
    }
}
