size(200, 200);
colorMode(RGB, 100);
background(99);
noStroke();

for(int i = 0; i < 600; i++){
  float color1 = random(0, 50);
  float color2 = random(50, 100);
  float loc_x = random(200);
  float loc_y = random(200);

  fill(color1, color2, color2, 60);
  rect(loc_x, loc_y, 10, 10);
}