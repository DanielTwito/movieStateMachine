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
    public void errorFixed() {

    }

    @Override
    public void timeEventAfterThreeSecond() {

    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public String toString() {
        return "Idle Region Download";
    }

    @Override
    public void whenQueueGreaterThenZero() {
        int diskSize = RegionManager.getDiskSize();
        Queue<File> q = RegionManager.getRequestsQueue();
        downloadRegion.file =(File)q.peek();
        int fileSize = downloadRegion.file.getFileSize();
        if(diskSize >= fileSize){
            q.poll();
            System.out.println("file "+ downloadRegion.file.getFileName() +" Remove From Download Queue Successfully!");
            downloadRegion.setDownloadCurrentState(downloadRegion.getDownload());

            // entry to download
            int newSize = RegionManager.getDiskSize() - downloadRegion.file.getFileSize();
            RegionManager.setDiskSize(newSize);
            RegionManager.inDownload();


            downloadRegion.setFlag(true);
            DownloadIState download = downloadRegion.getDownload();
            download.Downloading();


        }

    }
}
