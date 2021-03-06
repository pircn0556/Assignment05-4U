/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hhssadventure;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/**
 *
 * @author halll7908
 */
public class Screen {

    private BufferedImage image;
    private String area;
    private String direction;
    private boolean isBlocked;
    private String nextArea;
    private String nextDirection;
    private boolean north;
    private boolean east;
    private boolean south;
    private boolean west;

    /**
     * Using a scanner to create new screen
     *
     * @param input A scanner containing screen info
     */
    public Screen(String area, String direction, String image, boolean isBlocked, String nextArea, String nextDirection) {
             
        // load the image
        try {
            this.image = ImageIO.read(new File("images/" + image));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // establish variables
        this.area = area;
        this.direction = direction;
        this.isBlocked = isBlocked;
        this.nextArea = nextArea;
        this.nextDirection = nextDirection;
        
    }

    // automatically not blocked
    public boolean isBlocked() {
        return isBlocked;
    }

    public BufferedImage getImage() {
        return image;
    }
    
    public String getArea() {
        return area;
    }
    
    public String getDirection() {
        return direction;
    }
    
    public boolean canGoNorth(){
        return north;
    }
    
    public boolean canGoEast(){
        return east;
    }
    
    public boolean canGoSouth(){
        return south;
    }
    
    public boolean canGoWest(){
        return west;
    }
    
    public String getNextDirection(){
        return nextDirection;
    }
    
    public String getNextArea(){
        return nextArea;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // creates new screen
        Screen s = new Screen("", "", "", false, "", "");
        
        // display image
        System.out.println(s.getImage());
    }
    
    
}
