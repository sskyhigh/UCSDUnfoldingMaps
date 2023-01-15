package guiModule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyDisplay extends PApplet {
	PImage img;

	public void setup() {
		size(400, 400);
		background(255);
		stroke(0);
		img = loadImage("http://www.nurserymag.com/fileuploads/image/2022/01/11/AdobeStockft-laud-palms.jpg?w=1200&h=627&scale=both", "jpg");
		img.resize(0, height);
		image(img, 0, 0);
	}

	public void draw() {
		int[]color = sunColorSec(second()); // calculaute color code for the sun
		fill(color[0], color[1],color[2]); // sets the sun color
		ellipse(width/4,height/5,width/4,height/5); // draws the sun
	}
	public int[] sunColorSec(float seconds) {
		int[] rgb = new int [3];
		float diffFrom30 = Math.abs(30-seconds);
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		return rgb;
	}
}
