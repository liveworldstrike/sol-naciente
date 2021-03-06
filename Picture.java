/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Square campo;
    private Circle sun; 
    private Person xpeque;
    private Circle O;
    private Circle S;
    private Circle F;
   
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();    
        
        
        campo = new Square();
        campo.changeColor("green");
        campo.moveHorizontal(-420);
        campo.moveVertical(140);
        campo.changeSize(1000);
        campo.makeVisible();
        
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
        
        O = new Circle();        
        O.moveHorizontal(-230);
        O.moveVertical(-40);
        O.changeSize(30);
        
        S = new Circle();        
        S.moveHorizontal(-190);
        S.moveVertical(-20);
        S.changeSize(30);
        
        F = new Circle();
        F.moveHorizontal(-150);
        F.moveVertical(0);
        F.changeSize(30);
        
        
        
        
       
      
  }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }
    
    /**
     * Change this picture down sun display
     */
    public void moveSun ()
    {
        if (wall != null)   // only if it's painted already...
        {
            sun.slowMoveVertical(130);
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
            campo.changeColor("black");
            
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    /**
     * Change this picture to nuevo xpeke 
     */
    public void setxpeque()
    {
        if (wall != null)   // only if it's painted already...
        {   
            
        xpeque = new Person();
        xpeque.changeColor("black");
        xpeque.moveHorizontal(-300);
        xpeque.moveVertical(30);        
        xpeque.makeVisible();
        xpeque.slowMoveHorizontal(160);
        
        }
    }
    
    
    /**
     * Change this picture to estrellas aparecen
     */
    public void ESTRELLAS ()
    {
        if (wall != null)   // only if it's painted already...
        {   
            
       
        O.makeVisible();
        O.changeColor("black");
        
        
        S.makeVisible();
        S.changeColor("black");
        
        
        F.makeVisible();
        F.changeColor("black");
        }
 }
 
  /**
     * Change this picture to estrellas aparecen
     */
    public void ESTRELLAScambioDEPOSICION ()
    {
        if (wall != null)   // only if it's painted already...
        { 
           
   
        
         
        O.moveHorizontal(230);
        O.moveVertical(-40);
        O.changeSize(30);
        
        
        
        S.moveHorizontal(190);
        S.moveVertical(-20);
        S.changeSize(30);
        
        
        
        F.moveHorizontal(150);
        F.moveVertical(0);
        F.changeSize(30);
      
        }
 }
 }
