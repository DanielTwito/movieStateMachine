package Download;

/**
 * this class need to support history!
 */


public class DownloadRegion implements DownloadIState {
    public DownloadIState idleRegionDownload;
    public DownloadIState download;
    public DownloadIState finish;
    public DownloadIState waitingForInternet;
    public DownloadIState malfunction;

    public DownloadIState downloadStateCurrent;

    public DownloadRegion() {
        idleRegionDownload = new IdleRegionDownload(this);
        download = new Download(this);
        finish = new Finish(this);
        waitingForInternet = new WaitingForInternet(this);
        malfunction = new Malfunction(this);

        downloadStateCurrent = idleRegionDownload;
    }


    @Override
    public void finish() {

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
