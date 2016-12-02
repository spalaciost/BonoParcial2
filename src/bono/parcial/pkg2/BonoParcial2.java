package bono.parcial.pkg2;

import java.awt.Color;
import ch.aplu.turtle.*;

public class BonoParcial2 extends TurtleFrame
{
    public void simular(){
        Turtle hilo1 = new Turtle(this, Color.red);
        Turtle hilo2 = new Turtle(this, Color.red);
        Turtle hilo3 = new Turtle(this, Color.red);
        Turtle hilo4 = new Turtle(this, Color.red);
        Turtle hilo5 = new Turtle(this, Color.red);
                
        hilo1.setPos(-100, 160);
        hilo2.setPos(-110, 95);
        hilo3.setPos(-90, -35);
        hilo4.setPos(-110, 85);
        hilo5.setPos(-52.5, 160);
        hilo1.setPenColor(Color.red);
        hilo2.setPenColor(Color.red);
        hilo3.setPenColor(Color.red);
        hilo4.setPenColor(Color.red);
        hilo5.setPenColor(Color.red);
        
        new Cabeza(hilo1).start();
        new Cuerpo(hilo2).start();
        new Piernas(hilo3).start();
        new Manos(hilo4).start();
        new Antena(hilo5).start();
        
    }


public static void main(String[] args)
{
   BonoParcial2 tablero =  new BonoParcial2();
   tablero.simular();
}
}
