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

public class sketch_160615a extends PApplet {

// \u30d7\u30ed\u30b0\u30e9\u30e0\u958b\u59cb\u6642\u306b\u4e00\u5ea6\u3060\u3051\u5b9f\u884c\u3055\u308c\u308b\u51e6\u7406
public void setup() {
    // \u753b\u9762\u30b5\u30a4\u30ba\u3092\u8a2d\u5b9a
  background(255); // \u80cc\u666f\u8272\u3092\u8a2d\u5b9a
}

// setup\u5b9f\u884c\u5f8c\u306b\u7e70\u308a\u8fd4\u3057\u5b9f\u884c\u3055\u308c\u308b\u51e6\u7406
public void draw() {
  // \u56f3\u5f62\u306e\u8f2a\u90ed\u7dda\u3092\u6d88\u3059
  noStroke();
  // \u30e9\u30f3\u30c0\u30e0\u306a\u8272\u3092\u6307\u5b9a
  fill(random(255), random(255), random(255), random(255));
  // \u30de\u30a6\u30b9\u306e\u4f4d\u7f6e\u306b\u30e9\u30f3\u30c0\u30e0\u306a\u5927\u304d\u3055\u306e\u6955\u5186\u3092\u63cf\u304f
  ellipse(mouseX, mouseY, random(50), random(50));
}
  public void settings() {  size(750, 350); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_160615a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
