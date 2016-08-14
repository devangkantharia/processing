PImage frog = new PImage();

void setup() {
  size(710, 408);
  frog = loadImage("frog.jpg");
  background(0 );
}

void draw() {
  //image(frog, 0, 0);
  for(int i =0; i < 100; i++){
    float x = random(width);
    float y = random(height);
    
    //int index = x + y * width;
  
    //color c = frog.pixels[index];
    color c = frog.get(int(x),int(y)); 
    fill(c, 100);
    noStroke();
    ellipse(x, y, 100, 100);
  }
}