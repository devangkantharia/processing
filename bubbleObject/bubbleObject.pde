Bubble b1;
Bubble b2;

void setup() {
  size(640, 360);
  b1 = new Bubble(random(10,width), random(10, height), 64);
  b2 = new Bubble(random(50,width), random(50, height), 16);
}

void draw() {
  background(255);
  b1.ascend();
  b1.display();
  b1.top();

  b2.ascend();
  b2.display();
  b2.top();
}

void mousePressed() {
  //b.pop();
}