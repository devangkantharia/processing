int x;
int y;

void setup(){
  size(400,400);
}

void draw(){
  background(204);
  int x = mouseX;
  int y = mouseY;

  line(x, 0, x, height);
  line(0, y, width, y);
  line(0, y-30, width, y-30);
  line(0, y+30, width, y+30);
}

void mousePressed(){
  rect(mouseX, mouseY, 30, 30);
  rect(mouseX-30, mouseY-30, 30, 30);
}