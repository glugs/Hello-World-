import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Hello_World_v2 extends PApplet {


//Global Variables
char z, y, x;
String d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, ten, one;
int two, skipCount=7, twenty;
float decimal=1.0f, thirty; //must include a zero decimal or compiler reads as INTEGER
//
public void setup()
{
  String secondSentence = "I failed math class so many times I can't even count."; //Local Variables
  //println(secondSentence);
  //Populations, Declaration, Valuing
  z = '.';
  y = ',';
  x=':';
  d = "I";
  e = "failed";
  f = "math";
  g = "class";
  h ="so";
  i = "many";
  j= "times";
  k= "can't";
  l = "even";
  m = "count";
  n="See";
  o="The";
  p="bank";
  q="account";
  r="want";
  s="have";
  t="Retail";
  u="therapy";
  v="vs";
  w="my";
  ten = "Hello";
  twenty = 800;
  thirty = 1000000.0f; //12 zeros
 
  one = "1";
  two = 20;
  
  //println(d+z, e, f, g, ten+y, h, str(two)+z); //Casting, making an INTEGER into a STRING 
  //println("One plus two is", int(one)+two); //Casting is int(one), to change STRING to INTEGER
}//End setup
//
public void draw()
{
  two+=skipCount; //+=, -=, *=, /=
  println(d, e, f, g, h, i, j, d, k, l, m+z, n+y, str(two)+z);
  twenty-=skipCount; // Formula to count backwards from 10000 //ten-1, ten--, ten-=1
  println(t, u, v+z, w, p, q, x, str(twenty)+z);
  thirty+=skipCount; // Formula to count backwards from 10000 //ten-1, ten--, ten-=1
  println(o, p, q, d, r, x ,str(thirty));
  // clear out old frames
  background(142, 56, 76);

  // draw current frame based on state
  ellipse(300, circleY, 200, 200);
  text(ten, 10,90);
  textSize(65);
  
  // modify state
  circleY = circleY + ySpeed;

  if (circleY > height) {
    ySpeed = ySpeed * -1;
    // bounce off bottom
  }//End draw
  //
}
public void keyPressed() {
}//End keyPressed
//
public void mousePressed() {
}//End mousePressed
//
// What we will copy and paste from the Static Program
/*
 // Concatenation
 
 //
 
 
 
 //
/*Note: the computer is adding ASCII Values
 Period has an ASCII Value of 46
 So, int(one)+two+z = 1 + 1 + 46
 */


// state*
float circleY = 0;
float ySpeed = 1;
  public void settings() {  size(600, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "Hello_World_v2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
