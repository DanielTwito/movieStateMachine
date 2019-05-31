package Download;

/**
 * this class need to support history!
 */


public class DownloadRegion implements DownloadIState {

    private DownloadIState idleRegionDownload;
    private DownloadIState download;
    private DownloadIState finish;
    private DownloadIState waitingForInternet;
    private DownloadIState malfunction;

    public DownloadIState getDownloadCurrentState() {
        return downloadCurrentState;
    }

    private DownloadIState downloadCurrentState;


    public DownloadRegion() {
        idleRegionDownload = new IdleRegionDownload(this);
        download = new Download(this);
        finish = new Finish(this);
        waitingForInternet = new WaitingForInternet(this);
        malfunction = new Malfunction(this);

        downloadCurrentState = idleRegionDownload;
    }


    @Override
    public void downloadFinish() {

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


    public DownloadIState getIdleRegionDownload() {
        return idleRegionDownload;
    }

    public DownloadIState getDownload() {
        return download;
    }

    public DownloadIState getFinish() {
        return finish;
    }

    public DownloadIState getWaitingForInternet() {
        return waitingForInternet;
    }

    public DownloadIState getMalfunction() {
        return malfunction;
    }

    public void setDownloadCurrentState(DownloadIState newCurrentState) {
        downloadCurrentState = newCurrentState;
    }




}
