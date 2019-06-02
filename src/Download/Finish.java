package Download;

import Manger.File;

public class Finish implements DownloadIState {

    DownloadRegion downloadRegion;

    public Finish(DownloadRegion downloadRegion) {
        this.downloadRegion = downloadRegion;
    }

    @Override
    public void finishDownload() {

    }

    @Override
    public void downloadError() {

    }

    @Override
    public void internetOff() {

    }

    @Override
    public void internetOn() {

    }

    @Override
    public void errorFixed() {

    }

    @Override
    public void timeEventAfterThreeSecond() {

    }

    @Override
    public void downloadAborted(File x, File file) {

    }

    @Override
    public void whenQueueGreaterThenZero() {

    }

    @Override
    public String toString() {
        return "Finish";
    }
}
