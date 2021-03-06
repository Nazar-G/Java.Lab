package pong1;
import java.util.Random;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public class Kulka {

    private static final double R =10;

//    private double ySpeed;
//    private double xSpeed;
//    private double xPos;
//    private double yPos;
//    private Color color;
    protected double ySpeed;
    protected double xSpeed;
    protected double xPos;
    protected double yPos;
    protected Color color;
    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    Kulka(double xPos, double yPos, double xSpeed, double ySpeed)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.color = color;
    }
    public  void checkBoundaryCollision(double xLeft ,double yTop, double xRight, double yBotton)
    {
        if ((xPos - R <= xLeft) || (xPos + R >=xRight )) { xSpeed=-xSpeed;}
        if ((yPos - R <= yTop) || (yTop + R >= yBotton)) { ySpeed=-ySpeed;}
    }
    public void draw (GraphicsContext gc){
        gc.setFill(color);
        gc.fillOval(xPos - R, yPos - R, 2* R, 2* R);
        gc.restore();
    }
    public  void  update(){
        xPos+=xSpeed;    yPos+=ySpeed;
    }
}
