package Download;
import Manger.File;
import Manger.RegionManager;

import java.util.Queue;


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
    public void whenQueueGreaterThenZero(File file) {
        int diskSize = RegionManager.getDiskSize();
        int fileSize = file.getFileSize();
        if(diskSize >= fileSize){
            Queue<File> q = RegionManager.getRequestsQueue();
            q.remove();
            System.out.println("file "+ file.getFileName() +" Remove From Download Queue Successfully!");
            downloadRegion.setDownloadCurrentState(downloadRegion.getDownload());

            // entry to download
            int newSize = RegionManager.getDiskSize() - file.getFileSize();
            RegionManager.setDiskSize(newSize);
            RegionManager.inDownload();

        }

    }
}
