/*
-------------------------------------------------------------------------
Name:		Sketch.java
Purpose: 5.4 Processing Task 3 - Creating Variables, If Statements
Author:	Chan. A
Created:	date in 03/05/2022
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
      background(163,203,240);
    }

    else if (randWidth >= 400 && randHeight <= 400) {
      background(136, 196, 236);
    }

    else if (randWidth <= 400 && randHeight >= 400) {
      background(145, 175, 217);
    }

    else if (randWidth >= 400 && randHeight >= 400) {
      background(136, 202, 210);
    }
    
    else {
      background(0, 18, 24);
    }
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

   // draw ground
    //225, 325
   noStroke();

   fill(113, 81, 55);
   rect(randWidth - 225, randHeight + 325, 800, 200);
   grass(randWidth -225, randHeight + 325);
   grass(randWidth - 5, randHeight + 325);
   grass(randWidth + 175, randHeight + 325);
   grass(randWidth + 375, randHeight + 325);
   grass(randWidth + 525, randHeight + 325);

   fill(147, 192, 97);
   rect(randWidth - 225, randHeight + 325, 800, 45);


   stroke(0, 0, 0);
   strokeWeight(1);

   // draw sun 
   fill(255, 255, 35);
   ellipse(randWidth - 125, randHeight -125, 75, 75);

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

   // draw clouds
   noStroke();
   fill(255, 255, 255);
   ellipse(randWidth + 75, randHeight - 275, 100, 50);
   ellipse(randWidth + 125, randHeight - 255, 100, 50);

   ellipse(randWidth + 325, randHeight - 275, 100, 50);
   ellipse(randWidth + 375, randHeight -255, 100, 50);
   ellipse(randWidth + 405, randHeight - 275, 100, 50);




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