size(200, 200);
colorMode(HSB, 100);
background(99);

for(int i = 0; i < 100; i++){
  stroke(random(100), random(100), random(100));
  line(random(width),random(height),random(width),random(height));
}