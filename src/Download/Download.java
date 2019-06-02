package Download;

import Manger.File;
import Manger.RegionManager;

public class Download  implements DownloadIState {

    private DownloadRegion downloadRegion;

    public Download(DownloadRegion downloadRegion) {
        this.downloadRegion = downloadRegion;
    }

    @Override
    public void finishDownload() {
        int newPoints = RegionManager.getPoint() +1;
        RegionManager.setPoint(newPoints);
        downloadRegion.setDownloadCurrentState(downloadRegion.getFinish());
    }

    @Override
    public void downloadError() {
        downloadRegion.setDownloadCurrentState(downloadRegion.getMalfunction());
    }

    @Override
    public void internetOff() {
        downloadRegion.setDownloadCurrentState(downloadRegion.getWaitingForInternet());
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
        if (x.Comparison(file)){
            int newPoints = RegionManager.getPoint() -1;
            RegionManager.setPoint(newPoints);
            downloadRegion.setDownloadCurrentState(downloadRegion.getIdleRegionDownload());
        }
    }

    @Override
    public void whenQueueGreaterThenZero() {

    }
}
