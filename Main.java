// デバイスのインターフェース
interface Device {
    void change();
}

// テレビクラス
class Television implements Device {
    private int currentChannel;

    private Television() {
        currentChannel = 1; // 初期チャンネル
    }

    @Override
    public void change() {
        currentChannel++;
        System.out.println("テレビのチャンネルを" + currentChannel + "に変更しました。");
        // チャンネルを変更する処理
    }

    public static Television create() {
        return new Television();
    }
}

// エアコンクラス
class AirConditioner implements Device {
    private int currentTemperature;

    private AirConditioner() {
        currentTemperature = 25; // 初期温度
    }

    @Override
    public void change() {
        currentTemperature--;
        System.out.println("エアコンの温度を" + currentTemperature + "度に変更しました。");
        // 温度を変更する処理
    }

    public static AirConditioner create() {
        return new AirConditioner();
    }
}

public class Rimocon {
    public static void main(String[] args) {
        Device tv = Television.create();
        Device ac = AirConditioner.create();

        tv.change();
        ac.change();
    }
}
