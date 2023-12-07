import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta classe representa a classe Abelha para o jogo BeeWorld.
 * 
 * @author Richard Brosler 
 * @version 01-12-2023
 */
public class Abelha extends Actor
{
    int score;
    int vidas;
    static int VALOR_MOSCA = 100;
    private GreenfootImage[] imgs;
    private int ultImg;
    /**
     * Constructor da Abelha
     */
    public Abelha(){
        score = 0;
        vidas = 3;
        imgs = new GreenfootImage[4];//criando um conjunto de 4
        //Usando as imagens
        /*
        imgs[0] = new GreenfootImage("bee01.png");
        imgs[1] = new GreenfootImage("bee02.png");
        imgs[2] = new GreenfootImage("bee03.png");
        imgs[3] = new GreenfootImage("bee04.png"); 
        */
        //Alterando o código para deixar dinâmico o carregamento
        for (int i=0;i<4;i++){
            imgs[i] = new GreenfootImage("bee0"+(i+1)+".png");
        }
        ultImg = 0;
    }
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
        capturadaPelaAranha();
        mostrarScore();
        trocaImagem();
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
            Greenfoot.playSound("slurp.wav");
            getWorld().addObject(
              new Mosca(), 
              Greenfoot.getRandomNumber(getWorld().getWidth())+1, 
              Greenfoot.getRandomNumber(getWorld().getHeight())+1
              );
            score += VALOR_MOSCA; //score = score + VALOR_MOSCA
        }
    }
    /**
     * Procedimento alternativo de captura da mosca
     */
    public void capturaMosca2(){
        Actor mosca = getOneIntersectingObject(Mosca.class);
        if (mosca != null){
            getWorld().removeObject(mosca);
        }
    }
    /**
     * Método que verifica se foi capturado pela Aranha
     */
    public void capturadaPelaAranha(){
        if (isTouching(Aranha.class)){
            setLocation(
              Greenfoot.getRandomNumber(getWorld().getWidth())+1, 
              Greenfoot.getRandomNumber(getWorld().getHeight())+1
              );
            Greenfoot.playSound("capturado.wav");
            vidas--;
            if (vidas<=0) {
                getWorld().showText("GAME OVER", 400, 300);
                Greenfoot.stop();
            }
        }
    }
    /**
     * Método que mostra o score e vidas na tela
     */
    public void mostrarScore(){
        getWorld().showText("Score: " + score, 150, 20);
        getWorld().showText("Vidas: " + vidas, 650, 20);
    }
    /**
     * Procedimento para troca de imagens da abelha
     */
    public void trocaImagem(){
        setImage(imgs[ultImg]);
        //Módulo ou resto da divisão %
        ultImg = ++ultImg % 4;
    }
}