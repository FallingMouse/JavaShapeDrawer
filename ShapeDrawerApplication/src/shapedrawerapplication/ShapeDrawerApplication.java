package shapedrawerapplication;

import java.util.Scanner;

/**
 *
 * @author kewph
 */
public class ShapeDrawerApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FootShape fs = new FootShape();
        
        Foot foot = new Foot(fs);
        
        Scanner scn = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int shapeType = scn.nextInt();
        foot.draw(shapeType);
    }
}
