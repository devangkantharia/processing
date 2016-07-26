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

public class sketch06 extends PApplet {
  public void setup() {


ellipse(50, 50, 100, 100);
arc(150, 150, 100, 100, radians(0), radians(270));
    noLoop();
  }

  public void settings() { size(200, 200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch06" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
