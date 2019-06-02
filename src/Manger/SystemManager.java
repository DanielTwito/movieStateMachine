package Manger;

public class SystemManager{

    private static SystemState systemOn;
    private static SystemState checkConnection;
    private static SystemState systemOff;

    private SystemState systemCurrentState;

    public SystemManager(int diskSize){
        systemOn=new RegionManager(diskSize,this) ;
        checkConnection =new checkConnection(this);
        systemOff=new SystemOff(this);
        systemCurrentState=systemOff;

    }

    public void internetOn() {
        systemCurrentState.internetOn();
    }


    public void turnOn() {
        systemCurrentState.turnOn();
    }


    public void turnOff() {
        systemCurrentState.turnOff();
    }


    public SystemState getSystemOn() {
        return systemOn;
    }

    public SystemState getCheckConnection() {
        return checkConnection;
    }

    public SystemState getSystemOff() {
        return systemOff;
    }

    public SystemState getSystemCurrentState() {
        return systemCurrentState;
    }

    public void setSystemCurrentState(SystemState systemCurrentState) {
        System.out.println("Exit "+this.systemCurrentState.toString());
        this.systemCurrentState = systemCurrentState;
        System.out.println("Enter "+this.systemCurrentState.toString());

    }

    public void downloadFinish() {
        systemCurrentState.downloadFinish();

    }

    public void downloadError() {
        systemCurrentState.downloadError();
    }

    public void internetOff() {
        systemCurrentState.internetOff();
    }

    public void resume() {
        systemCurrentState.resume();
    }

    public void whenInDownload() {
        systemCurrentState.whenInDownload();
    }

    public void errorFixed() {
        systemCurrentState.errorFixed();
    }

    public void timeEventAfterThreeSecond() {
        systemCurrentState.timeEventAfterThreeSecond();
    }

    public void movieOn() {
        systemCurrentState.movieOn();
    }

    public void downloadAborted() {
        systemCurrentState.downloadAborted();
    }

    public void finishDownload() {
        systemCurrentState.finishDownload();
    }

    public void restartMovie() {
        systemCurrentState.restartMovie();
    }

    public void holdMovie() {
        systemCurrentState.holdMovie();
    }

//    public void whenQueueGreaterThenZero() {
//        systemCurrentState.whenQueueGreaterThenZero();
//    }

    public void fileRequest(File file) {
        systemCurrentState.fileRequest(file);    }


    public void timeEventAfterFourSecond(File file) {
        systemCurrentState.timeEventAfterFourSecond(file);
    }

    public void whenPointsLessthenFour() {
        systemCurrentState.whenPointsLessthenFour();
    }

    public void whenPointsGreaterOrEqualFour() {
        systemCurrentState.whenPointsGreaterOrEqualFour();
    }

    public void whenPointsLessthenSeven() {
        systemCurrentState.whenPointsLessthenSeven();    }

    public void whenPointsGreaterOrEqualSeven() {
        systemCurrentState.whenPointsGreaterOrEqualSeven();    }

    public void movieOff(){
        systemCurrentState.movieOff();
    }


    public void setDiskSize(int size) {
        RegionManager.setDiskSize(size);
    }
}
