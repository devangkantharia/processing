int x = 0;
boolean going = false;

void setup() {
  size(400, 360);
};

void draw() {
  background(0);
  fill(255);

  ellipse(x, 150, 24, 24);
  if (going) {
    x = x + 2;
  }
}

void mousePressed() {
  going = !going;
};