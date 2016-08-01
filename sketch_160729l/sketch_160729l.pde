
void setup() {
  size(400, 300);
}

void draw() {
  background(0);  
  stroke(255);
  strokeWeight(2);

  int x = 0;
  while (x < width) {
    line(x, 0, x, height);
    x = x + 20;
  }

  for(int y = 0; y < height; y = y + 20){
    line(0, y, width, y);
  }

}