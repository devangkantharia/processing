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

public class sketch09 extends PApplet {
  public void setup() {


// \u63cf\u753b\u30e2\u30fc\u30c9
beginShape();
// beginShape(POINTS);
// beginShape(TRIANGLES);
// beginShape(QUADS);
// beginShape(TRIANGLE_STRIP);
// beginShape(QUAD_STRIP);

// curveVertex(20, 20);
// curveVertex(100, 60);
// curveVertex(180, 20);
// curveVertex(140, 100);
// curveVertex(180, 180);
// curveVertex(100, 140);
// curveVertex(20, 180);
// curveVertex(60, 100);
// curveVertex(20, 20);
// curveVertex(100, 60);
// curveVertex(180, 20);

// curveVertex(100, 60);
// curveVertex(100, 60);
// curveVertex(180, 20);
// curveVertex(140, 100);
// curveVertex(180, 180);
// curveVertex(100, 140);
// curveVertex(20, 180);
// curveVertex(60, 100);
// curveVertex(60, 100);
// vertex(60, 100);
// vertex(20, 20);

vertex(60, 30);
vertex(140, 30);
bezierVertex(160, 30, 170, 40, 170, 60);
vertex(170, 140);
bezierVertex(170, 160, 160, 170, 140, 170);
vertex(60, 170);
bezierVertex(40, 170, 30, 160, 30, 140);
vertex(30, 60);
bezierVertex(30, 40, 40, 30, 60, 30);


// endShape(CLOSE);
endShape();
    noLoop();
  }

  public void settings() { size(200, 200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch09" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
