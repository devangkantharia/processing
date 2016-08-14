size(200, 200);
colorMode(HSB, 100);
background(99);
noStroke();
smooth();
rectMode(CENTER);

int x = 100;
int y = 100;
int sz = 200;

fill(30, 60, 99);
rect(x, y, sz, sz);
fill(60, 60, 99);
ellipse(x, y, sz, sz);

sz -= 60;

fill(30, 60, 99);
rect(x, y, sz, sz);
fill(60, 60, 99);
ellipse(x, y, sz, sz);

sz -= 40;

fill(30, 60, 99);
rect(x, y, sz, sz);
fill(60, 60, 99);
ellipse(x, y, sz, sz);

sz -= 30;

fill(30, 60, 99);
rect(x, y, sz, sz);
fill(60, 60, 99);
ellipse(x, y, sz, sz);