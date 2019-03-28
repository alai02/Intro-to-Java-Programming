/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOP;

import hsa.Console;
import java.awt.Color;

/**
 * @author 1laiale
 */
public abstract class PacmanCharacter implements Movement {

    // CLASS VARIABLES
    protected static Console c;
    
    public static int radius = 25;
    
    private static int direction;
    private static int directionLeft = 1;
    private static int directionRight = 2;
    private static int directionUp = 3;
    private static int directionDown = 4;
    private static int MOVEMENT_SIZE = 15;
    
    // OBJECT VARIABLES
    protected boolean alive;
    private int xLoc;
    private int yLoc;
    

    public PacmanCharacter() {
        if( c == null ) {
            System.out.println( "WARN: HSA Console NOT set." );
        }
    }
    
    public PacmanCharacter( Console hsaConsole ) {
        this();
        if( c == null ) {
            c = hsaConsole;
            System.out.println( "INFO: HSA Console set." );
        }
    }

    public PacmanCharacter( boolean alive, int xLoc, int yLoc ) {
        this.alive = alive;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }        
    
    public boolean isIsAlive() {
        return alive;
    }

    public void setIsAlive( boolean isAlive ) {
        this.alive = isAlive;
    }

    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc( int xLoc ) {
  //      if (xLoc > 0 && xLoc < Con)
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc( int yLoc ) {
        this.yLoc = yLoc;
    }
    
    public void move (){
        if (direction == directionLeft){
            moveLeft();
        }
        else if (direction == directionRight){
            moveRight();
        }
        else if (direction == directionUp){
            moveUp();
        }
        else if (direction == directionDown){
            moveDown();
        }
    }
    
    public void moveLeft( ) {
        this.erase();
        this.xLoc = xLoc - MOVEMENT_SIZE;
        this.draw();     
    }
    
    public void moveRight( ) {
        this.erase();
        this.xLoc = xLoc + MOVEMENT_SIZE;
        this.draw();
    }
    
    public void moveUp( ) {
        this.erase();
        this.yLoc = yLoc + MOVEMENT_SIZE;
        this.draw();
    }
    
    public void moveDown( ) {
        this.erase();
        this.yLoc = yLoc - MOVEMENT_SIZE;
        this.draw();
    }
    
    public void draw( ) {
        
    }
    
    public void erase() {
        c.setColor(Color.white);
        c.fillOval(this.getxLoc(), this.getyLoc(), radius, radius);    
        
    }
   
    /**
     * The parent class, PacmanCharacter, must have reference to the HSA Console.
     * Set it ONCE.
     * @param hsaConsole 
     */
    public static void setConsole( Console hsaConsole ) {
        c = hsaConsole;
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OOP;

import java.awt.Color;

/**
 *
 * @author User
 */
public class Pacman extends PacmanCharacter{
    
    public static int radius = 25;
    
    private int killCount;
    private int coinsEatin;
    private int livesLeft;
    
    
    public Pacman(){      
    }
    
    public Pacman (int xLoc, int yLoc, boolean alive){
        
        super(alive, xLoc, yLoc);
        
//        this.killCount  = killCount;
//        this.coinsEatin = coinsEatin;
//        this.livesLeft = livesLeft;
        this.draw();
        
    }

    public int getKillCount() {
        return killCount;
    }

    public void setKillCount(int killCount) {
        this.killCount = killCount;
    }

    public int getCoinsEatin() {
        return coinsEatin;
    }

    public void setCoinsEatin(int coinsEatin) {
        this.coinsEatin = coinsEatin;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        this.livesLeft = livesLeft;
    }
    
    public void draw(int i ) {
        c.setColor(Color.yellow);
        
        if (i %2 == 0){
            c.fillArc(this.getxLoc(), this.getyLoc(), radius, radius, 30, 300);
        }
        else{
            c.fillOval(this.getxLoc(), this.getyLoc(), radius, radius);
        }
        
    }

    @Override
    public String toString() {
        return "Pacman{" + "Ghosts killed: " + killCount + ", Amount of coins eaten: " + coinsEatin + ", Amount of lives left:" + livesLeft + '}';
    }
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import hsa.Console;
import java.awt.Color;

/**
 *
 * @author User
 */
public class Ghost extends PacmanCharacter {

    public static int raduis = 25;
    public static int width = 25;
    public static int height = 20;

    private boolean killedPacman;
    private boolean killable;
    private String ghostName;
    private Color color;

    public Ghost(Color color, boolean killedPacman, boolean killable, String ghostName, boolean alive, int xLoc, int yLoc) {
        super(alive, xLoc, yLoc);
        this.color = color;
        this.draw();

        this.killedPacman = killedPacman;
        this.killable = killable;
        this.ghostName = ghostName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color != null){
        this.color = color;
        }
        else {
            System.out.println("Not a valid color");
        }
    }

    public boolean isKilledPacman() {
        return killedPacman;
    }

    public void setKilledPacman(boolean killedPacman) {
        this.killedPacman = killedPacman;
    }

    public boolean isKillable() {
        return killable;
    }

    public void setKillable(boolean killable) {
        this.killable = killable;
    }

    public String getGhostName() {
        return ghostName;
    }

    public void setGhostName(String ghostName) {
        if (ghostName != null){
        this.ghostName = ghostName;
        }
        else {
            System.out.println("Not a valid name");
        }
    }

    public void draw() {
        c.setColor(this.color);
        c.fillOval(this.getxLoc(), this.getyLoc() - 10, raduis, raduis);
        c.fillRect(this.getxLoc(), this.getyLoc(), width, height);

    }

    public String toString() {
        return "Ghost{" + "Times killed pacman: " + killedPacman + ", killable=" + killable + ", This ghosts name is: " + ghostName + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import hsa.Console;
import java.awt.Color;

/**
 *
 * @author User
 */
public class PackmanTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Console c = new Console();
        PacmanCharacter.setConsole(c);

        Pacman pacman = new Pacman(250, 250, true);
        Ghost ghost1 = new Ghost(Color.PINK, false, true, "Pinky", true, 300, 300);
        Ghost ghost2 = new Ghost(Color.ORANGE, false, true, "Inky", true, 400, 400);
        Ghost ghost3 = new Ghost(Color.RED, false, true, "Blinky", true, 200, 200);
        Ghost ghost4 = new Ghost(Color.CYAN, false, true, "Clyde", true, 100, 100);

//      pacman.draw();
        //   pacman.moveDown();
        for (int i = 0; i < 200; i++) {
            pacman.draw(i);
        }
        
        ghost1.toString();

    
    
}



