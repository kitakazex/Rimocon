# デバイスのインターフェース
class Device:
    def change(self):
        pass

# テレビクラス
class Television(Device):
    def __init__(self):
        self.current_channel = 1

    def change(self):
        self.current_channel += 1
        print(f"テレビのチャンネルを{self.current_channel}に変更しました。")
        # チャンネルを変更する処理

    @staticmethod
    def create():
        return Television()

# エアコンクラス
class AirConditioner(Device):
    def __init__(self):
        self.current_temperature = 25

    def change(self):
        self.current_temperature -= 1
        print(f"エアコンの温度を{self.current_temperature}度に変更しました。")
        # 温度を変更する処理

    @staticmethod
    def create():
        return AirConditioner()

def main():
    tv = Television.create()
    ac = AirConditioner.create()

    tv.change()
    ac.change()

if __name__ == "__main__":
    main()
