package Download;

import Manger.File;
import Manger.RegionManager;

public class WaitingForInternet implements DownloadIState {

    private DownloadRegion downloadRegion;

    public WaitingForInternet(DownloadRegion downloadRegion) {
        this.downloadRegion = downloadRegion;
    }

    @Override
    public void finishDownload() {
    }

    public WaitingForInternet() {
    }

    @Override
    public void downloadError() {

    }

    @Override
    public void internetOff() {

    }

    @Override
    public void internetOn() {
        downloadRegion.setDownloadCurrentState(downloadRegion.getDownload());
        RegionManager.inDownload();
    }

    @Override
    public String toString() {
        return "Waiting For Internet";
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
}
