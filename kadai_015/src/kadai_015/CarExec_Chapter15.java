package kadai_015;

public class CarExec_Chapter15 {
    public static void main(String[] args) {
        // Car_Chapter15クラスのインスタンスを作成
        Car_Chapter15 car = new Car_Chapter15();

        // ギアを3に変更
        car.gearChange(3);

        // 走行メソッドを呼び出して速度を表示
        car.run();
    }
}