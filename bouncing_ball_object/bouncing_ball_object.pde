Ball b;

void setup(){
  b = new Ball();
  size(640, 480);
}

void draw(){
  background(255);
  b.display();
  b.update();
  b.checkEdges();
}