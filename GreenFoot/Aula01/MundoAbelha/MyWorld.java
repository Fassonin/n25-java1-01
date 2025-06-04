import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        Mosca mosca = new Mosca();
        addObject(mosca,312,269);
        Abelha abelha = new Abelha();
        addObject(abelha,300,143);
        abelha.setLocation(332,163);
        mosca.setLocation(336,265);
        mosca.setLocation(236,272);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,236,272);
        mosca.setLocation(292,285);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,292,285);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,330,315);
        Mosca mosca5 = new Mosca();
        addObject(mosca5,385,277);
    }
}
