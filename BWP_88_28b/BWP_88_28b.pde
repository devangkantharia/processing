size(200, 200);
colorMode(HSB,100);
background(99);
noStroke();

for(int y = 0; y < 10; y++){
  for(int x = 0; x < 10; x++){
    fill(x*10, 10 + y*10, 99);
    rect(x*20, y*20, 10, 10);
  }
}