/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bono.parcial.pkg2;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author USER
 */
public class Cuerpo extends Thread{
  private Turtle turtle;

  Cuerpo(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run(){
     segment(turtle);
 }

 private void segment(Turtle t){
 for (int i = 0; i < 2; i++) {
        t.right(90);
        t.forward(120);
        t.right(90);
        t.forward(130);
     }
         t.penUp();
         t.setPos(-100, 75);
         t.penDown();
 for (int i = 0; i < 2; i++) {
        t.right(90);
        t.forward(100);
        t.right(90);
        t.forward(30);
     }
     t.penUp();
     t.setPos(-30, -15);
     t.penDown();
     circle(6, t);
     
     t.penUp();
     t.setPos(-55, -15);
     t.penDown();
     circle(6, t);
     
     t.penUp();
     t.setPos(-75, -15);
     t.penDown();
     circle(6, t);
 }
 private void circle( int radius, Turtle t ){
        for ( int i = 0; i < 360; i++ )
        {
            t.forward( radius * .0174 );
            t.right( 1 );
        }
    }

}
