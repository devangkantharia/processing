class Bubble {

  float x;
  float y;
  float diameter;
  
  PImage img;
  
  Bubble(float tempX, float tempY, float tempD){
    x = tempX;
    y = tempY;
    diameter = tempD;
  }
  
  void ascend(){
    y--;
    x = x + random(-2, 2);
  }

  void display() {
    //stroke(0);
    //fill(127, 100);
    //ellipse(x, y, diameter, diameter);
    tint(255,127);
    imageMode(CENTER);
    image(flower, x, y, diameter, diameter);
  }

  void top() {
    if(y < diameter/2){
      y = diameter/2;
    }
  }
}