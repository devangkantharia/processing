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

public class sketch05 extends PApplet {
  public void setup() {


// rect(50, 50, 100, 100);
rectMode(CORNER);
rect(50, 50, 150, 150);
rectMode(CENTER);
rect(50, 50, 150, 150);
rectMode(CORNERS);
rect(50, 50, 150, 150);
triangle(100,50,50,150,150,150);
quad(100,50,75,100,100,150,125,100);
    noLoop();
  }

  public void settings() { size(200, 200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch05" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
