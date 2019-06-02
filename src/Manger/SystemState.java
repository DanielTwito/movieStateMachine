package Manger;

public interface SystemState {


    void internetOn();
    void turnOn();
    void turnOff();
    void downloadFinish();
    void downloadError();
    void internetOff();
    void resume();
    void whenInDownload();
    void errorFixed();
    void timeEventAfterThreeSecond();
    void movieOn();
    void downloadAborted();
    void finishDownload();
    void restartMovie();
    void holdMovie();
    //void whenQueueGreaterThenZero();
    void fileRequest(File file);
    void timeEventAfterFourSecond(File file);
    void whenPointsLessthenFour();
    void whenPointsGreaterOrEqualFour();
    void whenPointsLessthenSeven();
    void whenPointsGreaterOrEqualSeven();
    void movieOff();


    String toString();

}
