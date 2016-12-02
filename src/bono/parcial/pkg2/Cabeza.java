/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bono.parcial.pkg2;

import ch.aplu.turtle.Turtle;
import javafx.scene.shape.Circle;

/**
 *
 * @author USER
 */
public class Cabeza extends Thread{
  private Turtle turtle;

  Cabeza(Turtle turtle){
    this.turtle = turtle;
  }
 
public void run(){
     segment(turtle);
 }

 private void segment(Turtle t){
     for (int i = 0; i < 2; i++) {
        t.right(90);
        t.forward(100);
        t.right(90);
        t.forward(50);
     }
     int x=-70;
     for (int i = 0; i < 4; i++) {
         t.penUp();
         t.setPos(x, 125);
         t.penDown();
         for (int j = 0; j < 2; j++) {
             t.right(90);
             t.forward(10);
             t.right(90);
             t.forward(10);    
         }
         x+=10;
     }
     t.penUp();
     t.setPos(-80, 110);
     t.penDown();
     for (int i = 0; i < 2; i++) {
         t.right(90);
         t.forward(60);
         t.right(90);
         t.forward(15);
     }
     t.penUp();
     t.setPos(-40, 140);
     t.penDown();
     circle(10, t);
    
     
     t.penUp();
     t.setPos(-80, 140);
     t.penDown();
     circle(10, t);
     
     t.penUp();
     t.setPos(-35, 140);
     t.penDown();
     halfcircle(5, t);
     
     t.penUp();
     t.setPos(-75, 140);
     t.penDown();
     halfcircle(5, t);
     
 }
 private void circle( int radius, Turtle t ){
        for ( int i = 0; i < 360; i++ )
        {
            t.forward( radius * .0174 );
            t.right( 1 );
        }
    }
 private void halfcircle( int radius, Turtle t ){
        for ( int i = 0; i < 180; i++ )
        {
            t.forward( radius * .0174 );
            t.right( 1 );
        }
    }
}
