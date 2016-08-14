PImage frog = new PImage();
//Pixel[] pixels = new Pixel [width];

void setup() {
  size(710, 408);
  frog = loadImage("frog.jpg");
}

void draw() {
  background(0);
  //image(frog, 0, 0);
  loadPixels();
  frog.loadPixels();
  for (int x = 0; x < width; x++) {
    for (int y = 0; y < height; y++) {
      int loc = x + y * width;
      float b = brightness(frog.pixels[loc]);
      // 条件式の値を変えて出力を変える
      if(b > mouseX){
        pixels[loc] = color(255);
      } else {
        pixels[loc] = color(0);
      }
    }
  }
  updatePixels();
}