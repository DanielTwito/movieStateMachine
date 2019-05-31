package Movie;

public class MovieRegion{

    private MovieState idleRegionMovie;
    private MovieState moveOn;
    private MovieState puseMove;

    private MovieState movieCurrentState;

    public MovieRegion(){
        idleRegionMovie = new IdleRegionMovie(this);
        moveOn = new MoveOn(this);
        puseMove = new PuseMove(this);

        //initial state in movie regine
        movieCurrentState = idleRegionMovie;
    }

    public void setMovieCurrentState(MovieState movieCurrentState) {this.movieCurrentState = movieCurrentState;}

    public MovieState getMovieCurrentState() {return movieCurrentState;}
    public MovieState getIdleRegionMovie() {return idleRegionMovie;}
    public MovieState getMoveOn() {return moveOn;}
    public MovieState getPuseMove() {return puseMove;}

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

    public void downloadError() {

    }

    public void internetOff() {

    }

    public void resume() {

    }

    public void whenInDownload() {

    }
}
