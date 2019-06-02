package Download;
import Manger.File;
import Manger.RegionManager;
public class Malfunction implements DownloadIState {

    private DownloadRegion downloadRegion;

    public Malfunction(DownloadRegion downloadRegion) {
        this.downloadRegion = downloadRegion;
    }

    @Override
    public void Downloading() {

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
    public String toString() {
        return "Malfunction";
    }

    @Override
    public void errorFixed() {
        downloadRegion.setDownloadCurrentState(downloadRegion.getDownload());
        downloadRegion.setFlag(true);
        DownloadIState download = downloadRegion.getDownload();
        download.Downloading();
        RegionManager.inDownload();
    }

    @Override
    public void timeEventAfterThreeSecond() {

    }

    @Override
    public void downloadAborted(File x, File file) {

    }

    @Override
    public void whenQueueGreaterThenZero() {
        int newPoints = RegionManager.getPoint() -1;
        RegionManager.setPoint(newPoints);

    }
}
