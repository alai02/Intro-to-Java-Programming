/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import hsa.Console;
import java.awt.Color;

/**
 * Version: 1.0, Description: A main class that tests the pacman classes
 * 
 * @author Alex lai
 */
public class PackmanTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Console c = new Console();
        PacmanCharacter.setConsole(c);

        //Creating a pacman
        Pacman pacman = new Pacman(370, 370, true);
        //Creating ghosts
        Ghost ghost1 = new Ghost(Color.PINK, false, true, "Pinky", true, 300, 200);
        Ghost ghost2 = new Ghost(Color.GREEN, false, true, "Inky", true, 310, 200);
        Ghost ghost3 = new Ghost(Color.RED, false, true, "Blinky", true, 320, 200);
        Ghost ghost4 = new Ghost(Color.CYAN, false, true, "Clyde", true, 330, 200);

        //move pacman and ghosts
        for (int i = 0; i < 200; i++) {

            pacman.move();
            ghost2.move();
            ghost1.move();
            ghost4.move();
            ghost3.move();
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }

            //test if ghost has died
            System.out.println("Test killing a ghost:" + ghost1.isIsAlive());
            ghost1.setIsAlive(false);
            System.out.println("Test killing a ghost:" + ghost1.isIsAlive());
            
            System.out.println("-------------------------------");          

            // moving pacman down
            System.out.println("Test moving pacman down before:" + pacman.getyLoc());
            pacman.moveDown();
            System.out.println("Test moving pacman down after:" + pacman.getyLoc());
                        

            System.out.println("-------------------------------");

            //moving pacman up
            System.out.println("Test moving pacman up before:" + pacman.getyLoc());
            pacman.moveUp();
            System.out.println("Test moving pacman up after:" + pacman.getyLoc());

            System.out.println("-------------------------------");

            //moving pacman left
            System.out.println("Test moving pacman left before:" + pacman.getxLoc());
            pacman.moveLeft();
            System.out.println("Test moving pacman left after:" + pacman.getxLoc());

            System.out.println("-------------------------------");

            //moving pacman right
            System.out.println("Test moving pacman right before:" + pacman.getxLoc());
            pacman.moveRight();
            System.out.println("Test moving pacman rigth after:" + pacman.getxLoc());

            System.out.println("-------------------------------");

            //check if pacman losses lives
            System.out.println("Test killing pacman, lives left before:" + pacman.getLivesLeft());
            pacman.setPacmanAlive(false);
            System.out.println("Test killing pacman. lives left after:" + pacman.getLivesLeft());

            System.out.println("-------------------------------");

            //check toString methods
            System.out.println(pacman.toString());
            System.out.println(ghost1.toString());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 * Version: 1.0, Description: An interface for the pacman game
 * 
 * @author Alex lai
 */
public interface Movement {

    public void moveLeft();
    public void moveRight();
    public void moveUp();
    public void moveDown();
    public void draw();
    public void erase();
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
  * Version: 1.0, Description: An abstract class that is a blueprint for creating a pacman character 
 * 
 * @author Alex lai
 */
public abstract class PacmanCharacter implements Movement {

    // CLASS VARIABLES
    protected static Console c;

    public static int radius = 35;

    private static int MOVEMENT_SIZE = 15;

    // OBJECT VARIABLES
    private int direction;
    private int xLoc;
    private int yLoc;

    private boolean erasePacman;

    public PacmanCharacter() {
        if (c == null) {
            System.out.println("WARN: HSA Console NOT set.");
        }
    }

    public PacmanCharacter(Console hsaConsole) {
        this();
        if (c == null) {
            c = hsaConsole;
            System.out.println("INFO: HSA Console set.");
        }
    }

    public PacmanCharacter(int xLoc, int yLoc) {
        this.xLoc = xLoc;
        this.yLoc = yLoc;

    }

    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        //      if (xLoc > 0 && xLoc < Con)
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public void move() {

        int randomDirection = new java.util.Random().nextInt(4);

        switch (randomDirection) {
            case 1:
                moveLeft();
                break;
            case 2:
                moveRight();
                break;
            case 3:
                moveUp();
                break;
            case 0:
                moveDown();
                break;

        }

    }

    public void moveLeft() {
        this.erase();
        this.xLoc = xLoc - MOVEMENT_SIZE;
        this.draw();
    }

    public void moveRight() {
        this.erase();
        this.xLoc = xLoc + MOVEMENT_SIZE;
        this.draw();
    }

    public void moveUp() {
        this.erase();
        this.yLoc = yLoc - MOVEMENT_SIZE;
        this.draw();
    }

    public void moveDown() {
        this.erase();
        this.yLoc = yLoc + MOVEMENT_SIZE;
        this.draw();
    }

    public void draw() {

    }

    public void erase() {

        if (erasePacman == true) { // erases pacman
            c.setColor(Color.white);
            c.fillOval(this.getxLoc(), this.getyLoc(), radius, radius);
        } else {
            c.setColor(Color.WHITE); // erases a ghost
            c.fillOval(this.getxLoc(), this.getyLoc() - 15, radius, radius);
            c.fillRect(this.getxLoc(), this.getyLoc(), radius, radius);
        }

    }

    /**
     * The parent class, PacmanCharacter, must have reference to the HSA
     * Console. Set it ONCE.
     *
     * @param hsaConsole
     */
    public static void setConsole(Console hsaConsole) {
        c = hsaConsole;
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
 * Version: 1.0, Description: A class that is a blueprint for creating a ghost
 * 
 * @author Alex lai
 */
public class Ghost extends PacmanCharacter {

    public static int GHOST_HEAD_RADIUS = 25;
    public static int WIDTH = 25;
    public static int HEIGHT = 20;
    public static int ghostCount;

    private boolean killedPacman;
    private boolean killable;
    private String ghostName;
    private Color color;
    private boolean ghostAlive;
    
    public Ghost(){
    }

    public Ghost(Color color, boolean killedPacman, boolean killable, String ghostName, boolean ghostAlive, int xLoc, int yLoc) {
        super(xLoc, yLoc);
        this.color = color;
        this.draw();
        this.ghostAlive = ghostAlive;
        this.killedPacman = killedPacman;
        this.killable = killable;
        this.ghostName = ghostName;
         
        ghostCount++;       
        System.out.println("New Ghost Created, there are:" + ghostCount +"Ghosts");
    }
    
        public boolean isIsAlive() {
        return ghostAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.ghostAlive = isAlive;
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

    public boolean hasKilledPacman() {
        return killedPacman;
    }

    public void setKilledPacman(boolean killedPacman) {
        this.killedPacman = killedPacman;
    }

    public boolean isKillable() {
        return killable;
    }

    private void setKillable(boolean killable) {
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
        if (ghostAlive = true){
        c.setColor(this.color);
        c.fillOval(this.getxLoc(), this.getyLoc() - 10, GHOST_HEAD_RADIUS, GHOST_HEAD_RADIUS);
        c.fillRect(this.getxLoc(), this.getyLoc(), WIDTH, HEIGHT);
        }
        else {
            System.out.println("This character is dead");
        }

    }

    public String toString() {
        return "Ghost{" + "Has killed pacman " + killedPacman + ", killable=" + killable + ", This ghosts name is: " + ghostName + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.awt.Color;

/**
 * Version: 1.0, Description: A class that is a blueprint for creating a pacman
 * 
 * @author Alex lai
 */
public class Pacman extends PacmanCharacter {

    public static int PACMAN_RADIUS = 25;
    private int killCount;
    private int livesLeft;
    private boolean mouthOpen;
    private boolean pacmanAlive;

    public Pacman() {
    }

    public Pacman(int xLoc, int yLoc, boolean pacmanAlive) {

        super(xLoc, yLoc);
        this.draw();
        this.pacmanAlive = pacmanAlive;
        System.out.println("New pacman character created!");

    }

    public boolean isPacmanAlive() {
        return pacmanAlive;
    }

    public void setPacmanAlive(boolean pacmanAlive) {
        if (pacmanAlive = true){
        this.pacmanAlive = pacmanAlive;
        }
        else {
            livesLeft--;
        }
    }
    

    private void setLivesLeft(int livesLeft) {
        if (livesLeft > 0 ){          
        this.livesLeft = 5;           
        }
        else {
            System.out.println("Game is over, you lose!");
        }

    }

    public int getLivesLeft() {
        
        return livesLeft;
    }

    protected int getKillCount() {
        return killCount;
    }

    public void setKillCount(int killCount) {
        
        this.killCount = killCount;
    }

    @Override
    public void draw() {
        if (mouthOpen) {
            //draw with mouth open
            c.setColor(Color.yellow);
        c.fillArc(this.getxLoc(), this.getyLoc(), PACMAN_RADIUS, PACMAN_RADIUS, 30, 300);
        
        } else {
            //draw with mouth closed
            c.setColor(Color.yellow);
            c.fillOval(this.getxLoc(), this.getyLoc(), PACMAN_RADIUS, PACMAN_RADIUS);
        }

        mouthOpen = !mouthOpen;
    }

    @Override
    public String toString() { // toString method for pacman
        return "Pacman{" + "Amout of ghosts pacman has killed =" + killCount + ", Lives left=" + livesLeft + '}';
    }

}


