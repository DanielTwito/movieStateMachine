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

public class RegionManager implements DownloadIState, InternetStatusState, MovieState, RequestState, UserStatusState {

    private DownloadRegion downloadRegion;
    private IdleRegion idleRegion;
    private InternetRegion internetRegion;
    private MovieRegion movieRegion;
    private RequestRegion requestRegion;
    private UserStatusRegion userStatusRegion;

    private static int diskSize;
    private static Queue<File> requestsQueue;


    public RegionManager(DownloadRegion downloadRegion, IdleRegion idleRegion, InternetRegion internetRegion, MovieRegion movieRegion, RequestRegion requestRegion, UserStatusRegion userStatusRegion) {
        this.downloadRegion = downloadRegion;
        this.idleRegion = idleRegion;
        this.internetRegion = internetRegion;
        this.movieRegion = movieRegion;
        this.requestRegion = requestRegion;
        this.userStatusRegion = userStatusRegion;

        this.requestsQueue = new LinkedList<>();
        this.diskSize = 100;
    }

    public DownloadRegion getDownloadRegion() {
        return downloadRegion;
    }

    public IdleRegion getIdleRegion() {
        return idleRegion;
    }

    public InternetRegion getInternetRegion() {
        return internetRegion;
    }

    public MovieRegion getMovieRegion() {
        return movieRegion;
    }

    public RequestRegion getRequestRegion() {
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
    public void resume() {

    }

    @Override
    public void whenInDownload() {

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
    public void movieOn() {

    }

    @Override
    public void downloadAborted() {

    }

    @Override
    public void finishDownload() {

    }

    @Override
    public void restartMovie() {

    }

    @Override
    public void holdMovie() {

    }

    @Override
    public void whenQueueGreaterThenZero() {

    }

    @Override
    public void fileRequest(int fileSize) {

    }

    @Override
    public void timeEventAfterFourSecond(int fileSize) {

    }

    @Override
    public void whenPointsLessthenFour() {

    }

    @Override
    public void whenPointsGreaterOrEqualFour() {

    }

    @Override
    public void whenPointsLessthenSeven() {

    }

    @Override
    public void whenPointsGreaterOrEqualSeven() {

    }
}
