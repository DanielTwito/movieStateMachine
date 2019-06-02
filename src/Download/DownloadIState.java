package Download;

public interface DownloadIState {

    void Downloading();
    void finishDownload();
    void downloadError();
    void internetOff();
    void internetOn();
    void errorFixed();
    void timeEventAfterThreeSecond();
    void downloadAborted();
    String toString();

    //for the event when(Queue > 0)
    void whenQueueGreaterThenZero();



}
