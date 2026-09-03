public class Main {
    public static void main(String[] args) {
        TV television1 = new TV();
        television1.tvState();

        television1.turnOn();
        television1.channelUp();
        television1.volumeUp();
        television1.channelUp();
        television1.channeldown();
        television1.tvState();
        television1.setChannel(15);
        television1.tvState();
    }

}