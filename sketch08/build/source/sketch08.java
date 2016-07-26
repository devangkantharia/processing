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

public class sketch08 extends PApplet {
  public void setup() {


// \u63cf\u753b\u30e2\u30fc\u30c9
// beginShape();
// beginShape(POINTS);
// beginShape(TRIANGLES);
// beginShape(QUADS);
// beginShape(TRIANGLE_STRIP);
beginShape(QUAD_STRIP);

// \u30da\u30f3\u30bf\u30d5\u30b0\u30e9\u30e0
// vertex(100, 0);
// vertex(60, 50);
// vertex(0, 50);
// vertex(40, 100);
// vertex(0, 150);
// vertex(60, 150);
// vertex(100, 200);
// vertex(140, 150);
// vertex(200, 150);
// vertex(160, 100);
// vertex(200, 50);
// vertex(140, 50);

vertex(50,50);
vertex(150,50);
vertex(50,100);
vertex(150,100);
vertex(50,150);
vertex(150,150);

// CLOSE
// endShape(CLOSE);
endShape();
    noLoop();
  }

  public void settings() { size(200, 200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch08" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
