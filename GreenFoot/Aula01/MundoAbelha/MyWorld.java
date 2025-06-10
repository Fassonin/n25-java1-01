import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da Classe BeeWorld
 * 
 * @author Gustavo Fassoni 
 * @version 2025-06-04
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,260,207);
        aranha.setLocation(276,207);
        aranha.setLocation(268,220);
        aranha.setLocation(271,219);
        Abelha abelha = new Abelha();
        addObject(abelha,300,143);
        abelha.setLocation(332,163);
    }
}
