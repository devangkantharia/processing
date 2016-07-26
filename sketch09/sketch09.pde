size(200, 200);

// 描画モード
beginShape();
// beginShape(POINTS);
// beginShape(TRIANGLES);
// beginShape(QUADS);
// beginShape(TRIANGLE_STRIP);
// beginShape(QUAD_STRIP);

// curveVertex(20, 20);
// curveVertex(100, 60);
// curveVertex(180, 20);
// curveVertex(140, 100);
// curveVertex(180, 180);
// curveVertex(100, 140);
// curveVertex(20, 180);
// curveVertex(60, 100);
// curveVertex(20, 20);
// curveVertex(100, 60);
// curveVertex(180, 20);

// curveVertex(100, 60);
// curveVertex(100, 60);
// curveVertex(180, 20);
// curveVertex(140, 100);
// curveVertex(180, 180);
// curveVertex(100, 140);
// curveVertex(20, 180);
// curveVertex(60, 100);
// curveVertex(60, 100);
// vertex(60, 100);
// vertex(20, 20);

vertex(60, 30);
vertex(140, 30);
bezierVertex(160, 30, 170, 40, 170, 60);
vertex(170, 140);
bezierVertex(170, 160, 160, 170, 140, 170);
vertex(60, 170);
bezierVertex(40, 170, 30, 160, 30, 140);
vertex(30, 60);
bezierVertex(30, 40, 40, 30, 60, 30);


// endShape(CLOSE);
endShape();
