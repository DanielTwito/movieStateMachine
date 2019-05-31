package Download;

/**
 * this class need to support history!
 */


public class DownloadRegion{

    private DownloadIState idleRegionDownload;
    private DownloadIState download;
    private DownloadIState finish;
    private DownloadIState waitingForInternet;
    private DownloadIState malfunction;

    private DownloadIState downloadCurrentState;


    public DownloadRegion() {
        idleRegionDownload = new IdleRegionDownload(this);
        download = new Download(this);
        finish = new Finish(this);
        waitingForInternet = new WaitingForInternet(this);
        malfunction = new Malfunction(this);

        downloadCurrentState = idleRegionDownload;
    }

    public DownloadIState getDownloadCurrentState() {
        return downloadCurrentState;
    }


    public void downloadFinish() {

    }

    public void downloadError() {

    }

    public void internetOff() {

    }

    public void internetOn() {

    }

    public void errorFixed() {

    }

    public void timeEventAfterThreeSecond() {

    }

    public void downloadAborted() {

    }

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
