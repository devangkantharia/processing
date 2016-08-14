size(200, 200);
colorMode(HSB, 100);
background(99);

for(int i = 0; i < width; i++){
  float color1 = random(100);
  stroke(color1, 60, 100);
  line(i, 0, i, height);
}