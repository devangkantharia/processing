void setup(){
  size(500, 500);
  noStroke();
}

void draw(){
  float x = mouseX;
  float y = mouseY;
  x = width - mouseX;
  y = height - mouseY;
  background(0,0,0);
  ellipse(x,y,30,30);
  
}