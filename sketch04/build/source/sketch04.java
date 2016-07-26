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

public class sketch04 extends PApplet {
  public void setup() {
 // \u753b\u9762\u30b5\u30a4\u30ba\u6307\u5b9a

point(40, 40); // \u70b9\u3092\u63cf\u304f
point(80, 80);
point(120, 120);
point(160, 160);
line(200, 0, 0, 200); // \u7dda\u3092\u63cf\u304f
    noLoop();
  }

  public void settings() { size(200, 200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch04" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
