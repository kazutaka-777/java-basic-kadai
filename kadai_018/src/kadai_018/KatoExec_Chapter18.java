package kadai_018;

// 実行クラス
public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        // 各子クラスのインスタンスを作成
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

        // 紹介を実行
        taro.setGivenName();
        taro.execIntroduce();
        System.out.println(); // 空行
        ichiro.setGivenName();
        ichiro.execIntroduce();
        System.out.println(); // 空行
        hanako.setGivenName();
        hanako.execIntroduce();
    }
}