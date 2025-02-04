package kadai_018;

// 子クラス（加藤一郎）
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
    // コンストラクタ
    public KatoIchiro_Chapter18() {
        setGivenName(); // 名を設定
    }

    // 名を設定するメソッド
    public void setGivenName() {
        givenName = "一郎";
    }

    // 個別の紹介を出力するメソッド
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}