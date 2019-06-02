package Download;
import Manger.File;

public interface DownloadIState {

    void finishDownload();
    void downloadError();
    void internetOff();
    void internetOn();
    void errorFixed();
    void timeEventAfterThreeSecond();
    void downloadAborted(File x, File file);
    String toString();

    //for the event when(Queue > 0)
    void whenQueueGreaterThenZero();



}
