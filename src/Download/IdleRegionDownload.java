package Download;

public class IdleRegionDownload implements DownloadIState{

    private DownloadRegion downloadRegion;

    public IdleRegionDownload(DownloadRegion downloadRegion) {
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
    public void downloadAborted() {

    }

    @Override
    public void whenQueueGreaterThenZero() {

    }
}
