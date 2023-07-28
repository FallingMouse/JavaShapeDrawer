package shapedrawerapplication;

/**
 *
 * @author kewph
 */
public class Foot {
    private FootShape fs;
    
    public Foot(FootShape fs) {
        this.fs = fs;
    }
    
    public void draw(int shapeType) {
        switch(shapeType) {
            case 1:
                fs.drawAsEllipse();
                break;
            case 2:
                fs.drawAsRectangle();
                break;
        }
    }
}
