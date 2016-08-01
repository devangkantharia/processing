class Bubble {

  float x;
  float y;
  float diameter;
  float yspeed;
  
  boolean active = false; 

  
  Bubble(float tempD){
    x = random(width);
    y = height;
    diameter = tempD;
    yspeed = random(0.1, 2);
  }
  
  void ascend(){
    y = y- yspeed;
    x = x + random(-2, 2);
  }

  void display() {
    stroke(0);
    //noFill();
    fill(175, 100);
    ellipse(x, y, diameter, diameter);
  }

  void top() {
    if(y < diameter/2){
      //y = diameter/2;
      y = height;
    }
  }
}