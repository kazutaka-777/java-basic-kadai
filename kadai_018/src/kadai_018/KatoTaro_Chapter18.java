package kadai_018;

// 子クラス（加藤太郎）
public class KatoTaro_Chapter18 extends Kato_Chapter18 {
    // コンストラクタ
    public KatoTaro_Chapter18() {
        setGivenName(); // 名を設定
    }

    // 名を設定するメソッド
    public void setGivenName() {
        givenName = "太郎";
    }

    // 個別の紹介を出力するメソッド
    @Override
    public void eachIntroduce() {
        System.out.println("Javaが得意です");
    }
}