public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(20);
        tv1.setVolumeLevel(6);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeLevelUp();
        tv2.volumeLevelUp();

        System.out.println("tv1's channel is "+tv1.channel+" and volume is "+ tv1.volumeLevel);
        System.out.println("tv2's channel is "+tv2.channel+" and volume is "+ tv2.volumeLevel);

    }
}