package Manger;

import Download.Download;
import Download.DownloadRegion;
import Internet.InternetRegion;
import Movie.MovieRegion;
import Requests.RequestRegion;
import UserStatus.UserStatusRegion;
import idle.IdleRegion;


import java.util.LinkedList;
import java.util.Queue;

public class RegionManager implements SystemState{

    private static DownloadRegion downloadRegion;
    private static IdleRegion idleRegion;
    private static InternetRegion internetRegion;
    private static MovieRegion movieRegion;
    private static RequestRegion requestRegion;
    private static UserStatusRegion userStatusRegion;

    private static int diskSize;
    private static Queue<File> requestsQueue;



    private static boolean twentyPrecent;

    private SystemManager mySystem;

    private static int point;


    public RegionManager(int diskSize,SystemManager systemManager){

        downloadRegion = new DownloadRegion();
        idleRegion = new IdleRegion();
        internetRegion = new InternetRegion();
        movieRegion = new MovieRegion();
        requestRegion = new RequestRegion();
        userStatusRegion = new UserStatusRegion();
        requestsQueue = new LinkedList<>();
        setDiskSize(diskSize);
        point=0;
        mySystem=systemManager;
        twentyPrecent=false;
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

    public static int getPoint() {
        return point;
    }

    public static void setDiskSize(int diskSize) {
        if(diskSize>=0)
            RegionManager.diskSize = diskSize;
    }

    public static void setPoint(int pointNew) {
        int currPoint=point;
        if(pointNew<0)
            return;
        RegionManager.point = pointNew;
        if(currPoint==3&&point==4){
            userStatusRegion.whenPointsGreaterOrEqualFour();
            System.out.println("Event when(point>=4) was fired");
        }
        else if(currPoint==4&&point==3){
            userStatusRegion.whenPointsLessthenFour();
            System.out.println("Event when(point<4) was fired");

        }
        else if(currPoint==6&&point==7){
            userStatusRegion.whenPointsGreaterOrEqualSeven();
            System.out.println("Event when(point>=7) was fired");

        }
        else if(currPoint==7&&point==6){
            userStatusRegion.whenPointsLessthenSeven();
            System.out.println("Event when(point<7) was fired");

        }
    }

    public static boolean isTwentyPrecent() {
        return twentyPrecent;
    }

    public static void setTwentyPrecent(boolean twentyPrecent) {
        RegionManager.twentyPrecent = twentyPrecent;
    }

    public static void inDownload(){
        movieRegion.whenInDownload();
    }

    public static int getUserStatus(){
        return userStatusRegion.getUserStatus();
    }

    public static void moreThanTwentyPercent(){
        setTwentyPrecent(true);
    }


    public void downloadFinish() {
        downloadRegion.finishDownload();
        movieRegion.finishDownload();
    }

    public void downloadError() {
        downloadRegion.downloadError();
        movieRegion.downloadError();
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
        downloadRegion.setFlag(true);
        if(downloadRegion.getDownloadCurrentState() instanceof Download){
            downloadRegion.getWaitingForInternet().internetOn();
        }
        internetRegion.internetOn();
        downloadRegion.internetOn();
//        movieRegion.internetOn();
    }

    @Override
    public void turnOn() {


    }

    @Override
    public void turnOff() {
        mySystem.setSystemCurrentState(mySystem.getSystemOff());
        downloadRegion.setFlag(false);

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
        downloadRegion.downloadAborted();
        movieRegion.downloadAborted();
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

    public static void whenQueueGreaterThenZero() {
        downloadRegion.whenQueueGreaterThenZero();
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

    @Override
    public void movieOff() {
        movieRegion.movieOff();
    }

    @Override
    public String toString() {
        return "SystemOn";
    }
}
