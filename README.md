## Java8のサンプルコード置き場
### お品書き
* メソッド参照
* 関数型インターフェース
* ラムダ式

## メソッド参照
* クラスメソッド：String::toString（クラス名::クラスメソッド）
* インスタンスメソッド：System.out::println（オブジェクト参照::インスタンスメソッド）
* コンストラクタ：String::new（クラス名::new）

## 関数型インターフェース
抽象メソッドのみあるインターフェース
```
@FunctionalInterface
interface MethodName {
  public void methodName(String piyo);
}
```

`@FunctionalInterface`をつけておくことで　SAM(Single Abstract Method)インターフェース
であるかどうかがコンパイル時に検証される。

## ラムダ式
メソッド定義を式として記述できる。
メソッド参照と同様にメソッド単体の参照を変数に代入できる

### ラムダ式の文法
```
（仮引数列） -> {処理本体の文（複数}
または
（仮引数列） -> 処理本体の式
```


