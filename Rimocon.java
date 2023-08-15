// デバイスのインターフェース
interface Device {
    String getName();
    void change();
}

// テレビクラス
class Television implements Device {
    private String name;
    private int currentChannel;

    public Television(String name) {
        this.name = name;
        currentChannel = 1; // 初期チャンネル
    }

    @Override
    public String getName() {
        return name;
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
    private String name;
    private int currentTemperature;

    public AirConditioner(String name) {
        this.name = name;
        currentTemperature = 25; // 初期温度
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void change() {
        currentTemperature--;
        System.out.println("エアコンの温度を" + currentTemperature + "度に変更しました。");
        // 温度を変更する処理
    }
}

// リモコンクラス
class RemoteControl {
    public void adjust(Device device) {
        System.out.println("リモコンで" + device.getName() + "の状態を変更します。");
        device.change();
    }
}

class Main{
    public static void main(String[] args) {
        Device tv = new Television("テレビ");
        Device ac = new AirConditioner("エアコン");

        RemoteControl remote = new RemoteControl();
        remote.adjust(tv);
        remote.adjust(ac);
    }
}
