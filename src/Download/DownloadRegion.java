package Download;

import Manger.File;

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


    public void finishDownload() {
        downloadCurrentState.finishDownload();
    }

    public void downloadError() {
        downloadCurrentState.downloadError();
    }

    public void internetOff() {
        downloadCurrentState.internetOff();
    }

    public void internetOn() {
        downloadCurrentState.internetOn();
    }

    public void errorFixed() {
        downloadCurrentState.errorFixed();
    }

    public void timeEventAfterThreeSecond() {
        downloadCurrentState.timeEventAfterThreeSecond();
    }

    public void downloadAborted(File x, File file) {
        downloadCurrentState.downloadAborted(x, file);
    }

    public void whenQueueGreaterThenZero() {
        downloadCurrentState.whenQueueGreaterThenZero();
    }
    public String toString() {
        return "Download Region";
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
        System.out.println("Exit "+this.downloadCurrentState.toString());
        downloadCurrentState = newCurrentState;
        System.out.println("Enter "+this.downloadCurrentState.toString());
    }




}
