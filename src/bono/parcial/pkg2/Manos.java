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
public class Manos extends Thread{
  private Turtle turtle;

  Manos(Turtle turtle)
  {
    this.turtle = turtle;
  }
 
 
public void run(){
     segment(turtle);
 }

 private void segment(Turtle t){
     for (int i = 0; i < 2; i++) {
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(5);
     }
     t.penUp();
     t.setPos(-127.5, 70);
     t.penDown();
     for (int i = 0; i < 2; i++) {
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(5);
     }
     t.penUp();
     t.setPos(-126.5, 65);
     t.penDown();
     for (int i = 0; i < 2; i++) {
        t.left(90);
        t.forward(12);
        t.left(90);
        t.forward(50);
     }
     
     t.penUp();
     t.setPos(-127.5, 15);
     t.penDown();
     for (int i = 0; i < 2; i++) {
        t.left(90);
        t.forward(8);
        t.left(90);
        t.forward(10);
     }
     t.penUp();
     t.setPos(-110, -5);
     t.penDown();
     for (int i = 0; i < 2; i++) {
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(20);
     }
     t.penUp();
     t.setPos(-140, -5);
     t.penDown();
     for (int i = 0; i < 2; i++) {
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(20);
     }
     //
     //
     t.penUp();
     t.setPos(20, 85);
     t.penDown();
     for (int i = 0; i < 2; i++) {
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(5);
     }
     t.penUp();
     t.setPos(37.5, 70);
     t.penDown();
     for (int i = 0; i < 2; i++) {
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(5);
     }
     t.penUp();
     t.setPos(38.5, 65);
     t.penDown();
     for (int i = 0; i < 2; i++) {
        t.left(90);
        t.forward(12);
        t.left(90);
        t.forward(50);
     }
     
     t.penUp();
     t.setPos(37.5, 15);
     t.penDown();
     for (int i = 0; i < 2; i++) {
        t.left(90);
        t.forward(8);
        t.left(90);
        t.forward(10);
     }
     t.penUp();
     t.setPos(22, -5);
     t.penDown();
     for (int i = 0; i < 2; i++) {
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(20);
     }
     t.penUp();
     t.setPos(52, -5);
     t.penDown();
     for (int i = 0; i < 2; i++) {
        t.left(90);
        t.forward(10);
        t.left(90);
        t.forward(20);
     }
     //
    //
     /*t.penUp();
     t.setPos(22, -5);
     t.penDown();
     circle(10, t);*/
     
     t.penUp();
     t.setPos(20, 85);
     t.penDown();
     circle(10, t);
     
     t.penUp();
     t.setPos(24, 85);
     t.penDown();
     circle(5, t);
     
     t.penUp();
     t.setPos(-140, -5);
     t.penDown();
     circle(10, t);
     
     t.penUp();
     t.setPos(-140, 80);
     t.penDown();
     circle(10, t);
     
     t.penUp();
     t.setPos(-137.5, 80);
     t.penDown();
     circle(5, t);
 
     
 }
  private void circle( int radius, Turtle t ){
        for ( int i = 0; i < 360; i++ )
        {
            t.forward( radius * .0174 );
            t.right( 1 );
        }
    }

}
