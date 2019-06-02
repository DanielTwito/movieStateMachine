package Download;

import Manger.File;
import Manger.RegionManager;

import java.util.Queue;

public class Download  implements DownloadIState {

    private DownloadRegion downloadRegion;
    private double statusFile;


    public Download(DownloadRegion downloadRegion) {
        this.downloadRegion = downloadRegion;
        statusFile = 0;
    }

    public void Downloading(){

        Runnable target;
        System.out.println("Downloading...");
        Thread t = new Thread(() -> {
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
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(statusFile>=downloadRegion.file.getFileSize()){
                    finishDownload();
                    break;
                }
                if(statusFile/downloadRegion.file.getFileSize() >= 20){
                    RegionManager.moreThanTwentyPercent();
                }
            }
        });
        t.start();

    }

    @Override
    public void finishDownload() {
        downloadRegion.setFlag(false);
        int newPoints = RegionManager.getPoint() +1;
        RegionManager.setPoint(newPoints);
        downloadRegion.file = null;
        statusFile = 0;
        downloadRegion.setDownloadCurrentState(downloadRegion.getIdleRegionDownload());
    }

    @Override
    public void downloadError() {
        downloadRegion.setFlag(false);
        downloadRegion.setDownloadCurrentState(downloadRegion.getMalfunction());
        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            downloadRegion.getDownloadCurrentState().timeEventAfterThreeSecond();
        }).start();
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
    public void downloadAborted() {
        downloadRegion.setFlag(false);
        int newPoints = RegionManager.getPoint() -1;
        RegionManager.setPoint(newPoints);
        downloadRegion.setDownloadCurrentState(downloadRegion.getIdleRegionDownload());

    }

    @Override
    public void whenQueueGreaterThenZero() {

    }

    @Override
    public String toString() {
        return "Download";
    }


}
