## Processingリファレンス

#### __rect(左上x, 左上y, 幅, 高さ)__
矩形（長方形、正方形）を描く
rectMode([MODE]):rectの座標指定方法を変更
rectMode([CORNER]):左上座標で指定（デフォルト）
rectMode([CENTER]):中心座標で指定
rectMode([CORNERS]):左上と右下の座標で指定
```
rectMode(CORNER);
rect(50, 50, 150, 150);
rectMode(CENTER);
rect(50, 50, 150, 150);
rectMode(CORNERS);
rect(50, 50, 150, 150);
```

#### __triangle(頂点1x, 頂点1y, 頂点2x, 頂点2y, 頂点3x, 頂点3y)__
三角形を描く
```
triangle(100,50,50,150,150,150);
```

#### __quad(頂点1x, 頂点1y, 頂点2x, 頂点2y, 頂点3x, 頂点3y, 頂点4x, 頂点4y)__
四角形を描く
```
quad(100,50,75,100,100,150,125,100);
```
