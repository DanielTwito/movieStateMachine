package Manger;

import Download.DownloadIState;
import Download.DownloadRegion;
import Internet.InternetRegion;
import Internet.InternetStatusState;
import Movie.MovieRegion;
import Movie.MovieState;
import Requests.RequestRegion;
import Requests.RequestState;
import UserStatus.UserStatusRegion;
import UserStatus.UserStatusState;
import idle.IdleRegion;

import java.util.LinkedList;
import java.util.Queue;

public class RegionManager{

    private static DownloadRegion downloadRegion;
    private static IdleRegion idleRegion;
    private static InternetRegion internetRegion;
    private static MovieRegion movieRegion;
    private static RequestRegion requestRegion;
    private static UserStatusRegion userStatusRegion;

    private static int diskSize;
    private static Queue<File> requestsQueue;


    public RegionManager(DownloadRegion downloadRegion, IdleRegion idleRegion, InternetRegion internetRegion, MovieRegion movieRegion, RequestRegion requestRegion, UserStatusRegion userStatusRegion) {
        this.downloadRegion = downloadRegion;
        this.idleRegion = idleRegion;
        this.internetRegion = internetRegion;
        this.movieRegion = movieRegion;
        this.requestRegion = requestRegion;
        this.userStatusRegion = userStatusRegion;

        requestsQueue = new LinkedList<>();
        diskSize = 100;
    }

    public static DownloadRegion getDownloadRegion() {
        return downloadRegion;
    }

    public static IdleRegion getIdleRegion() {
        return idleRegion;
    }

    public static InternetRegion getInternetRegion() {
        return internetRegion;
    }

    public static MovieRegion getMovieRegion() {
        return movieRegion;
    }

    public static RequestRegion getRequestRegion() {
        return requestRegion;
    }

    public UserStatusRegion getUserStatusRegion() {
        return userStatusRegion;
    }

    public static int getDiskSize() {
        return diskSize;
    }

    public static Queue<File> getRequestsQueue() {
        return requestsQueue;
    }

    public static void setDiskSize(int diskSize) {
        if(diskSize>=0)
            RegionManager.diskSize = diskSize;
    }

    public void downloadFinish() {

    }

    public void downloadError() {

    }

    public void internetOff() {

    }

    public void resume() {

    }

    public void whenInDownload() {

    }

    public void internetOn() {

    }

    public void errorFixed() {

    }

    public void timeEventAfterThreeSecond() {

    }

    public void movieOn() {

    }

    public void downloadAborted() {

    }

    public void finishDownload() {

    }

    public void restartMovie() {

    }

    public void holdMovie() {

    }

    public void whenQueueGreaterThenZero() {

    }

    public void fileRequest(File file) {

    }

    public void timeEventAfterFourSecond(File file) {

    }

    public void whenPointsLessthenFour() {

    }

    public void whenPointsGreaterOrEqualFour() {

    }

    public void whenPointsLessthenSeven() {

    }

    public void whenPointsGreaterOrEqualSeven() {

    }

}
