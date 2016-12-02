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
public class Antena extends Thread{
  private Turtle turtle;

  Antena(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
 public void run(){
     segment(turtle);
 }

 private void segment(Turtle t){
     
 for (int i = 0; i < 2; i++) {
        t.forward(15);
        t.right(90);
        t.forward(10);
        t.right(90);
     }
         t.penUp();
         t.setPos(-55, 184.5);
         t.penDown();
         circle(10, t);
 }
 private void circle( int radius, Turtle t ){
        for ( int i = 0; i < 360; i++ )
        {
            t.forward( radius * .0174 );
            t.right( 1 );
        }
    }

}
