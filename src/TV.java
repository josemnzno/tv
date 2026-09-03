public class TV {
    private int channel, volumeLevel;
    private boolean on;


    public void tvState(){
        System.out.println("canal; "+channel+ "\nvolumen: "+volumeLevel+"\nla tv esta: "+on);
        return;
    }

    public boolean turnOn() {
        on = true;
        return on;
    }

    public boolean turnOff() {
        on = false;
        return on;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
    public void channelUp(){
        channel = channel+1;
        return;
    }
    public void channeldown(){
        channel = channel-1;
    }
    public void volumeUp(){
        volumeLevel = volumeLevel +1;
    }
    public void volumeDown( ){
        volumeLevel = volumeLevel -1;
    }

}
