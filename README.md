## Java8のサンプルコード置き場
### お品書き
* メソッド参照
* 関数型インターフェース

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


