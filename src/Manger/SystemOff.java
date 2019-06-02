package Manger;

public class SystemOff implements SystemState{

    private static SystemManager mySystem;

    @Override
    public void internetOn() {

    }

    @Override
    public void turnOn() {
        mySystem.setSystemCurrentState(mySystem.getCheckConnection());

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void downloadFinish() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void internetOff() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void whenInDownload() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void timeEventAfterThreeSecond() {

    }

    @Override
    public void movieOn() {

    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void finishDownload() {

    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public void whenQueueGreaterThenZero() {

    }

    @Override
    public void fileRequest(File file) {

    }

    @Override
    public void timeEventAfterFourSecond(File file) {

    }

    @Override
    public void whenPointsLessthenFour() {

    }

    @Override
    public void whenPointsGreaterOrEqualFour() {

    }

    @Override
    public void whenPointsLessthenSeven() {

    }

    @Override
    public void whenPointsGreaterOrEqualSeven() {

    }

    @Override
    public String toString() {
        return "Off";
    }
}
