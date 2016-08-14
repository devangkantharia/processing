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
      float r = red(frog.pixels[loc]);
      float g = green(frog.pixels[loc]);
      float b = blue(frog.pixels[loc]);
      //float d = dist(width/2, height/2, x, y);
      float d = dist(mouseX, mouseY, x, y);
      //float factor = map(d, 0, 200, 0, 2);
      float factor = map(d, 0, 200, 2, 0);

      pixels[loc] = color(r*factor, g*factor, b*factor);
      //pixels[loc] = color(r+d, g+d, b+d);
      //pixels[loc] = color(r+mouseX, g+mouseX, b+mouseX);
      //pixels[loc] = color(r*1.1, g+mouseX, b+mouseX);
      //pixels[loc] = color(r+((mouseX + mouseY)/10), g+((mouseX + mouseY)/10), b+((mouseX + mouseY)/10));
 
       //widthが200以上になるとピクセルのカラーをオリジナルから変更
      //if(x > 200){
      //  pixels[loc] = color(g,r,b*2);
      //} else {
      //  pixels[loc] = color(r,g,b);
      //}
    }
  }
  updatePixels();
}