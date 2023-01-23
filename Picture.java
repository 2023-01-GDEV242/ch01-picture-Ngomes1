/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person  bob;
    private Person jill;
    private Square  chimney;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        bob = new Person();
        jill = new Person();
        chimney = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-180);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("blue");
            window.moveHorizontal(-160);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
            
            chimney.changeColor("red");
            chimney.moveHorizontal(-110);
            chimney.moveVertical(-40);
            chimney.changeSize(30);
            chimney.makeVisible();
            
            roof.changeSize(60, 180);
            roof.moveHorizontal(-20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            bob.changeColor("blue");
            bob.moveHorizontal(100);
            bob.moveVertical(0);
            bob.changeSize(80,40);
            bob.makeVisible();
            
            jill.changeColor("magenta");
            jill.moveHorizontal(140);
            jill.moveVertical(0);
            jill.changeSize(50,30);
            jill.makeVisible();
            
            
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        bob.changeColor("black");
        jill.changeColor("black");
        chimney.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("green");
        window.changeColor("blue");
        roof.changeColor("blue");
        sun.changeColor("red");
        bob.changeColor("blue");
        jill.changeColor("magenta");
        chimney.changeColor("green");
    }
}
