package kadai_015;

public class Car_Chapter15 {
    // フィールド
    private int gear = 1;  // ギア（初期値は1）
    private int speed = 10; // 速度（初期値は10km/h）

    // ギアチェンジメソッド
    public void gearChange(int afterGear) {
        this.gear = afterGear; // ギアを更新
        switch (this.gear) {
            case 1:
                this.speed = 10;
                break;
            case 2:
                this.speed = 20;
                break;
            case 3:
                this.speed = 30;
                break;
            case 4:
                this.speed = 40;
                break;
            case 5:
                this.speed = 50;
                break;
            default:
                this.speed = 10; // 1～5以外のギアは速度10km/h
                break;
        }
    }

    // 走行メソッド（速度を表示）
    public void run() {
        System.out.println("ギア" + this.gear + "から" + this.gear + "に切り替えました");
        System.out.println("速度は時速" + this.speed + "kmです");
    }
}