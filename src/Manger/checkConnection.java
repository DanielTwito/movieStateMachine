package Manger;

public class checkConnection implements SystemState {

    private SystemManager mySystem;

    public checkConnection(SystemManager systemManager){
        mySystem=systemManager;
    }


    @Override
    public void internetOn() {
        mySystem.setSystemCurrentState(mySystem.getSystemOn());

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {
        mySystem.setSystemCurrentState(mySystem.getSystemOff());


    }

    @Override
    public void downloadFinish() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void internetOff() {
        System.out.println("No Internet Connection");
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
    public void movieOff() {

    }

    @Override
    public String toString() {
        return "Waiting For Internet";
    }
}
