// デバイスのインターフェース
interface Device {
    void change();
}

// テレビクラス
class Television implements Device {

    private int currentChannel;

    public Television() {
        currentChannel = 1; // 初期チャンネル
    }

    @Override
    public void change() {
        currentChannel++;
        System.out.println("テレビのチャンネルを" + currentChannel + "に変更しました。");
        // チャンネルを変更する処理
    }
}

// エアコンクラス
class AirConditioner implements Device {

    private int currentTemperature;

    public AirConditioner() {
        currentTemperature = 25; // 初期温度
    }

    @Override
    public void change() {
        currentTemperature--;
        System.out.println("エアコンの温度を" + currentTemperature + "度に変更しました。");
        // 温度を変更する処理
    }
}

class Rimocon {
    public static void main(String[] args) {
        Device tv = new Television();
        Device ac = new AirConditioner();

        tv.change();
        ac.change();
    }
}
