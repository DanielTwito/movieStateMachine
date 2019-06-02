package Movie;

public class MovieRegion{

    private MovieState idleRegionMovie;
    private MovieState moveOn;
    private MovieState puseMove;

    private MovieState movieCurrentState;
    public int currentTime;
    public boolean hold;

    public MovieRegion(){
        idleRegionMovie = new IdleRegionMovie(this);
        moveOn = new MoveOn(this);
        puseMove = new PuseMove(this);

        //initial state in movie regine
        movieCurrentState = idleRegionMovie;
        currentTime=0;
        hold=false;
    }

    public void setMovieCurrentState(MovieState movieCurrentState) {
        System.out.println("Exit "+this.movieCurrentState.toString());
        this.movieCurrentState = movieCurrentState;
        System.out.println("Enter "+this.movieCurrentState.toString());

    }


    public MovieState getMovieCurrentState() {return movieCurrentState;}
    public MovieState getIdleRegionMovie() {return idleRegionMovie;}
    public MovieState getMoveOn() {return moveOn;}
    public MovieState getPuseMove() {return puseMove;}

    public void movieOn() {
        movieCurrentState.movieOn();
    }

    public void movieOff(){
        movieCurrentState.movieOff();
    }


    public void downloadAborted() {
        movieCurrentState.downloadAborted();
    }

    public void finishDownload() {
        movieCurrentState.finishDownload();
    }

    public void restartMovie() {
        movieCurrentState.restartMovie();
    }


    public void holdMovie() {
        movieCurrentState.holdMovie();
    }

    public void downloadError() {
        movieCurrentState.downloadError();
    }

    public void internetOff() {
        movieCurrentState.internetOff();
    }

    public void resume() {
        movieCurrentState.resume();
    }

    public void whenInDownload() {
        movieCurrentState.whenInDownload();
    }
}
