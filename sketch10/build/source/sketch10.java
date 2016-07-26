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

public class sketch10 extends PApplet {
  public void setup() {

// colorMode(RGB, 256);
colorMode(HSB, 100);
background(60, 60, 99);

// stroke(0, 88, 91);
ellipse(40, 40, 60, 60);

// noStroke();
ellipse(100, 100, 60, 60);

strokeWeight(5);
// stroke(0, 88, 91);
ellipse(160, 160, 60, 60);
    noLoop();
  }

  public void settings() { size(200, 200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch10" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
