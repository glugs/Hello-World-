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

public class HelloWorld extends PApplet {

//Global Variables
char z, y;
String d, e, f, g, ten, h, one;
int two, skipCount=2, twenty;
float decimal=1.0f, thirty; //must include a zero decimal oe compiler reads as Integer
//
public void setup()
{
  String secondSentence = "Mr. Mercer counts to 10, by 1."; //Local Variables
  //println(secondSentence);
  //Populations, Declaration, Valuing
  z = '.';
  y = ',';
  d = "Mr";
  e = "Mercer";
  f = "counts";
  g = "to";
  ten = "10000";
  twenty= 10000;
  thirty=1000000000000.0f; //12 zeros
  h = "by";
  one = "1";
  two = 1;
  println(d+z, e, f, g, ten+y, h, str(two)+z); //Casting, making an INTEGER into a STRING 
  println("One plus two is", PApplet.parseInt(one)+two); //Casting is int(one), to change STRING to INTEGER
}//End setup
//
public void draw()
{
  two*=skipCount; //+=, *=, /=
  println(d+z, e, f, g, ten+y, h, str(two)+z);
  twenty/=skipCount;//Formula to count backwards from 10000// ten-1. ten--, ten-=1
  println(d+z, e, f, g, one+y, "backwards from", str(twenty)+z);
}//End draw
//
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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--hide-stop", "HelloWorld" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
