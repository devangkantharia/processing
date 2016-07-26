## Processingリファレンス

#### __ellipse(中心x, 中心y, 横直径, 縦直径)__
楕円（正円）を描く
ellipseMode([MODE]):ellipseの座標指定方法を変更
ellipseMode([CENTER]):指定方法を(中心x, 中心y, 横直径, 縦直径)に
ellipseMode([RADIUS]):指定方法を(中心x, 中心y, 横半径, 縦半径)に
ellipseMode([CORNER]):指定方法を(左上角x, 左上角y, 横直径, 縦直径)に
ellipseMode([CORNERS]):指定方法を(左上角x, 左上角y, 右下角x, 右下角y)に
```
ellipse(50, 50, 100, 100);
```

#### __arc(中心x, 中心y, 横直径, 縦直径, 描き始めの角度, 描き終わりの角度)__
円弧を描く
```
arc(150, 150, 100, 100, radians(0), radians(270));
```

#### __radians(角度)__
0~360°の角度の数値をラジアンに変換
```
radians(270);
```
