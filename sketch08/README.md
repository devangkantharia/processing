## Processingリファレンス

#### __beginShape__
図形の指定を開始
###### __beginShape();__
endShapeまでに含まれる点で閉じた曲線を描く
###### __beginShape(TRIANGLE_STRIP);__
endShapeまでに含まれる3点ごとに三角形として描く
###### __beginShape(QUAD_STRIP);__
endShapeまでに含まれる4点ごとに四角形として描く
```
ex.
```

#### __endShape();__
図形の指定を終了
###### __endShape(CLOSE);__
3点ごとに三角形として描く
```
ex.
```

#### __vertex(頂点x, 頂点y);__
点の座標を指定
```
ex.
```
