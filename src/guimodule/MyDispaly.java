package guimodule;

import processing.core.PApplet;

public class MyDispaly extends PApplet{
	// private String URL = "";
	// private PImage backgroundImage;
	
	public void setup() {
		size(600, 600);
		// backgroundImage = loadImage("data/palmTrees.jpg");
		background(200, 200, 200);
	}
	
	public void draw() {
		fill(255, 255, 0);
		ellipse(width/2, height/2, width-10, height-10);
		fill(0,0,0);
		ellipse((int)(width/3.3), (int)(height/3), 150, 200);
		ellipse(width - (int)(width/3.3), (int)(height/3), 150, 200);
		noFill();
		arc(width/2, height*2/3, 400, 200, 0, PI);
	}
}
