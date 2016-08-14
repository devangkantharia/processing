// プログラム全体の設定
size(200, 200);
rectMode(CENTER);
colorMode(HSB, 100);
background(99);
noStroke();

// 図形の描画
// 四角・大
fill(45, 60, 90);
rect(100, 100, 100, 100);

// 四角・中
fill(45, 40, 90);
rect(100, 100, 60, 60);

// 四角・小
fill(45, 20, 90);
rect(100, 100, 20, 20);

// 塗りつぶしなしの枠線で円を描画
noFill();
strokeWeight(60);

stroke(80, 99, 99, 30);
ellipse(50, 50, 200, 200);
stroke(60, 99, 99, 30);
ellipse(150, 50, 200, 200);
stroke(40, 99, 99, 30);
ellipse(50, 150, 200, 200);
stroke(20, 99, 99, 30);
ellipse(150, 150, 200, 200);