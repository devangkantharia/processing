class Bubble {

  float x;
  float y;
  float diameter;
  
  Bubble(float xpos, float ypos, float tempD){
    x = xpos;
    y = ypos;
    diameter = tempD;
  }
  
  void ascend(){
    y--;
    x = x + random(-2, 2);
  }

  void display() {
    stroke(0);
    fill(random(255));
    ellipse(x, y, diameter, diameter);
  }

  void top() {
    if(y < diameter/2){
      y = diameter/2;
    }
  }
}