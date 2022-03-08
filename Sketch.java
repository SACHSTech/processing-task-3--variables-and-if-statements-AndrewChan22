/*
-------------------------------------------------------------------------
Name:		Sketch.java
Purpose: 5.4 Processing Task 3 - Creating Variables, If Statements
Author:	Chan. A
Created:	date in 03/07/2022
-------------------------------------------------------------------------
*/

import processing.core.PApplet;

public class Sketch extends PApplet {

  float randWidth = random(100, 600);
  float randHeight = random(100, 600);

	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
      //()
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  
  public void setup() {
    if (randWidth <= 400 && randHeight <= 400) {
      background(0, 170, 255);
    }

    else if (randWidth >= 400 && randHeight <= 400) {
      background(170, 0, 255);
    }

    else if (randWidth <= 400 && randHeight >= 400) {
      background(255, 0, 170);
    }

    else if (randWidth >= 400 && randHeight >= 400) {
      background(38, 255, 0);
    }
    
    else {
      background(0, 18, 24);
    }
  }
  /*
  int hour = hour();
  int minute = minute();
  int second = second();
  */

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  
  public void draw() {

   // Reference Point: 225, 325

   stroke(0, 0, 0);
   strokeWeight(1);

   // draw house
   fill(168, 97, 87);
   rect(randWidth, randHeight, 350, 325);

   // draw roof
   fill(124, 117, 110);
   triangle(randWidth + 175, randHeight - 150, randWidth - 60, randHeight, randWidth + 410, randHeight);

   // draw left window
   fill(122, 184, 221);
   ellipse(randWidth + 88, randHeight + 95, 50, 75);
   line(randWidth + 63, randHeight + 95, randWidth + 113, randHeight + 95);
   line(randWidth + 88, randHeight + 58, randWidth + 88, randHeight + 132);

   // draw right window
   ellipse(randWidth + 263, randHeight + 95, 50, 75);
   line(randWidth + 239, randHeight + 95, randWidth + 288, randHeight + 95);
   line(randWidth + 263, randHeight + 58, randWidth + 263, randHeight + 131);

   // draw door
   fill(123, 68, 29);
   rect(randWidth + 125, randHeight + 175, 100, 150);

   // draw door knob
   fill(70, 71, 77);
   ellipse(randWidth + 150, randHeight + 240, 15, 15);

   // Clock format
   int hour = hour();
   int minute = minute();
   int second = second();

   String time = hour + ":" + minute + ":" + second;

   // AM or PM conditional
   if (hour > 12) {

     time = hour - 12 + ":" + minute + ":" + second + " PM";

     fill(255, 250, 250);
     rect(100, 75, 325, 100);

     fill(0, 0, 0);
     textSize(50);

     text(time, 125, 150);
   }

   else if (hour < 12) {

     time = hour + ":" + minute + ":" + second + " AM";

     fill(255, 250, 250);
     rect(100, 75, 325, 100);

     fill(0, 0, 0);
     textSize(50);

     text(time, 125, 150);
   }

   else if (hour == 0) {

     time = "12: " + minute + "." + second + ":" + " AM";
     
     fill(255, 250, 250);
     rect(200, 200, 275, 75);

     fill(0, 0, 0);
     textSize(50);

     text(time, 200, 225);
   }

  }


  
  // define other methods down here.
  

  
  /**
   * Given two floats, return the x and y coordinates of a rectangle
   * 
   * @param x The first x coordinate
   * @param y The first y coordinate
   * @return the two floats as the x and y coordinate of a rectangle
   * @author A. Chan
   */
    public void grass(float x, float y) {

    fill(147, 192, 97);
    rect(x, y, 50, 75);
  
    }


  
}