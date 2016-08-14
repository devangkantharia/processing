PImage frog = new PImage();
//Pixel[] pixels = new Pixel [width];

void setup() {
  size(254, 198);
  //size(710, 408);
  frog = loadImage("frog2.jpg");
}

void draw() {
  background(0);
  image(frog, 0, 0);
  loadPixels();
  frog.loadPixels();
  for (int x = 0; x < width-1; x++) {
    for (int y = 0; y < height; y++) {
      int loc1 = x      + y * width;
      int loc2 = (x+1) + y * width;      
      //float b1 = frog.pixels[loc1];
      //float b2 = frog.pixels[loc2];
      float b1 = brightness(frog.pixels[loc1]);
      float b2 = brightness(frog.pixels[loc2]);
      
      float diff = abs(b1-b2);
      //pixels[loc1] = color(diff);
      if(diff > 20){
        pixels[loc1] = color(0);
      } else {
        pixels[loc1] = color(255);
      }
      
    }
  }
  updatePixels();
}