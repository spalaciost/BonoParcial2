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
public class Piernas extends Thread{
  private Turtle turtle;

  Piernas(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
public void run(){
     segment(turtle);
 }

 private void segment(Turtle t){
     for (int i = 0; i < 2; i++) {
        t.right(90);
        t.forward(20);
        t.right(90);
        t.forward(60);
     }
    
     t.penUp();
     t.setPos(-30, -35);
     t.penDown();
     
     for (int i = 0; i < 2; i++) {
         t.right(90);
        t.forward(20);
        t.right(90);
        t.forward(60);
     }
     
     t.penUp();
     t.setPos(-90, -95);
     t.penDown();
     t.right(180);
     t.forward(8);
     
     t.penUp();
     t.setPos(-10, -95);
     t.penDown();
     t.forward(8);
        
     t.penUp();
     t.setPos(-70, -95);
     t.penDown();
     t.forward(20);
     t.right(90);
     t.forward(50);
     t.right(158.2);
     t.forward(53.86);
     t.right(112);

     
    t.penUp();
     t.setPos(-30, -95);
     t.penDown();
     t.forward(20);
     t.left(90);
     t.forward(50);
     t.left(158.26);
     t.forward(53.85);
     
 }

}
