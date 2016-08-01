void setup() {
  // Set size of the window
  size(640, 360);
  background(50);
};

void draw() {
  fill(150);
  stroke(255);
  strokeWeight(5);
  line(pmouseX, pmouseY, mouseX, mouseY);
};

void mousePressed(){
  background(50);
}

void keyPressed(){
background(0,255,0);
}