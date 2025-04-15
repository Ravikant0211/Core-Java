package javaInterface.Devices;

public class SmartPhone implements Camera, MusicPlayer, Phone {
    @Override
    public void takePhoto() {
        System.out.println("Taking photo with smartphone.");
    }

    @Override
    public void recordVideo() {
        System.out.println("Record video with smartphone.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music with smartphone.");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music with smartphone.");
    }

    @Override
    public void makeCall(int number) {
        System.out.println("Calling " + number + " from smartphone.");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call on smartphone.");
    }
}
