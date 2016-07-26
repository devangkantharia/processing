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

public class sketch07 extends PApplet {
  public void setup() {


curve(40,0,160,60,40,120,160,200);
rectMode(CENTER);
rect(40, 0, 8, 8);
rect(160, 60, 8, 8);
rect(40, 120, 8, 8);
rect(160, 200, 8, 8);

bezier(40,40,160,40,40,160,160,160);
rectMode(CENTER);
rect(40, 40, 8, 8);
rect(160, 40, 8, 8);
rect(40, 160, 8, 8);
rect(160, 160, 8, 8);
    noLoop();
  }

  public void settings() { size(200, 200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch07" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
