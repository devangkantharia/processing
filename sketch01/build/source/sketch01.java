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

public class sketch01 extends PApplet {
  public void setup() {
// water test with vertex colouring


float yoff = 0, zoff = 0, ns = 0.1f, zs = 8;
float nx, ny = yoff, z1, z2;
noiseDetail(8, 0.5f);
noStroke();

background(20, 40, 50);
translate(width * 0.5f, height * .55f, 0);
rotate(PI / 3.25f);
scale(15);

for(int y = -10; y <= 10; y++){
  nx = 0.005f;
  beginShape(TRIANGLE_STRIP);
  for(int x = -25; x < 25; x++){
    z1 = noise(nx, ny, zoff);
    z2 = noise(nx, ny + ns, zoff);
    fill(0, z1 * 160, z1 * 255, pow(10, 0.85f + z1 * 2));
    vertex(x, y, z1*zs);
    fill(0, z2 * 160, z2 * 255, pow(10, 0.85f + z2 * 2));
    vertex(x, y+1, z2 * zs);
    nx += ns;
  }
  endShape();
  ny+=ns;
}
    noLoop();
  }

  public void settings() { 
size(512, 512, P3D); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch01" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
