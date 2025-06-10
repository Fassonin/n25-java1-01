import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aqui é a Classe Mosca.
 * 
 * @author Gustavo Fassoni 
 * @version 2025-06-03
 */
public class Mosca extends Inseto
{
    //Fields
    private int velocidade;
    private int rotacao;
    //Contructor padrão
    public Mosca(){
        velocidade = 1;
        rotacao = 0;
    }
    //Contructor com parametros
    public Mosca(int vel,int rot){
       velocidade = vel;
       rotacao = rot;
    }
    /**
     * Act - Método responsável pelas ações da mosca quando
     * os botões Act ou Run são pressionados.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.getRandomNumber(100)<20){
            turn(45-Greenfoot.getRandomNumber(90));
            
        }
        move(velocidade);
        verificarCanto();
    }
}
