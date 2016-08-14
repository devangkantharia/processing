size(400, 400);
colorMode(HSB, 100);
background(99);
noFill();
smooth();
rectMode(CENTER);

int center_x = width/2;
int center_y = height/2;
int sz = width/4;

strokeWeight(4);
stroke(60, 60, 99);
ellipse(center_x, center_y, sz, sz);
ellipse(center_x, center_y, sz*2, sz*2);
ellipse(center_x, center_y, sz*3, sz*3);
ellipse(center_x, center_y, sz*4, sz*4);