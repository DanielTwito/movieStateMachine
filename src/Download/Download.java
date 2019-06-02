package Download;

import Manger.File;
import Manger.RegionManager;

import java.util.Queue;

public class Download  implements DownloadIState {

    private DownloadRegion downloadRegion;
    private double statusFile;
    Queue<File> q;
    File file;

    public Download(DownloadRegion downloadRegion) {
        this.downloadRegion = downloadRegion;
        statusFile = 0;
        q = RegionManager.getRequestsQueue();
        file = (File)q.peek();
    }

    public void Downloading(){

        while (downloadRegion.getFlag()){
            if(RegionManager.getUserStatus() == 1){
                statusFile+=1;
            }
            else if(RegionManager.getUserStatus() == 2 ){
                statusFile+=1.2;
            }
            else {
                statusFile+=1.5;
            }

            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(statusFile>=file.getFileSize()){
                finishDownload();
            }
            if(statusFile/file.getFileSize() >= 20){
                RegionManager.moreThanTwentyPercent();
            }
        }
    }

    @Override
    public void finishDownload() {
        downloadRegion.setFlag(false);
        int newPoints = RegionManager.getPoint() +1;
        RegionManager.setPoint(newPoints);
        downloadRegion.setDownloadCurrentState(downloadRegion.getFinish());
    }

    @Override
    public void downloadError() {
        downloadRegion.setFlag(false);
        downloadRegion.setDownloadCurrentState(downloadRegion.getMalfunction());
    }

    @Override
    public void internetOff() {
        downloadRegion.setFlag(false);
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
        downloadRegion.setFlag(false);
        if (x.Comparison(file)){
            int newPoints = RegionManager.getPoint() -1;
            RegionManager.setPoint(newPoints);
            downloadRegion.setDownloadCurrentState(downloadRegion.getIdleRegionDownload());
        }
    }

    @Override
    public void whenQueueGreaterThenZero() {

    }

    @Override
    public String toString() {
        return "Download";
    }


}
