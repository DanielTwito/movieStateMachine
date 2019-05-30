package Download;

public interface DownloadIState {

    void finish();
    void downloadError();
    void internetOff();
    void internetOn();
    void errorFixed();
    void timeEventAfterThreeSecond();
    void downloadAborted();

    //for the event when(Queue > 0)
    void whenQueueGreaterThenZero();



}
