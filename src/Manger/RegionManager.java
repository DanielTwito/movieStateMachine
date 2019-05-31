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


    public RegionManager(){

        downloadRegion = new DownloadRegion();
        idleRegion = new IdleRegion();
        internetRegion = new InternetRegion();
        movieRegion = new MovieRegion();
        requestRegion = new RequestRegion();
        userStatusRegion = new UserStatusRegion();

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

    public static UserStatusRegion getUserStatusRegion() {
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
        internetRegion.internetOff();
        downloadRegion.internetOff();
        movieRegion.internetOff();
    }

    public void resume() {
        movieRegion.resume();
    }

    public void whenInDownload() {

    }

    public void internetOn() {
        internetRegion.internetOn();
        downloadRegion.internetOn();
//        movieRegion.internetOn();
    }

    public void errorFixed() {
        downloadRegion.errorFixed();

    }

    public void timeEventAfterThreeSecond() {

    }

    public void movieOn() {
        movieRegion.movieOn();
    }

    public void downloadAborted() {
        idleRegion.downloadAborted();
    }

    public void finishDownload() {
        downloadRegion.finishDownload();
        movieRegion.finishDownload();
    }

    public void restartMovie() {
        movieRegion.restartMovie();
    }

    public void holdMovie() {
        movieRegion.holdMovie();
    }

    public void whenQueueGreaterThenZero() {

    }

    public void fileRequest(File file) {
        requestRegion.fileRequest(file);
    }

    public void timeEventAfterFourSecond(File file) {
        requestRegion.timeEventAfterFourSecond(file);
    }

    public void whenPointsLessthenFour() {
        userStatusRegion.whenPointsLessthenFour();
    }

    public void whenPointsGreaterOrEqualFour() {
        userStatusRegion.whenPointsGreaterOrEqualFour();
    }

    public void whenPointsLessthenSeven() {
        userStatusRegion.whenPointsLessthenSeven();
    }

    public void whenPointsGreaterOrEqualSeven() {
        userStatusRegion.whenPointsGreaterOrEqualSeven();
    }

}
