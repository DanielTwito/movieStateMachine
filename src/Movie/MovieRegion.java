package Movie;

public class MovieRegion implements MovieState {

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

    public MovieState getIdleRegionMovie() {return idleRegionMovie;}
    public MovieState getMoveOn() {return moveOn;}
    public MovieState getPuseMove() {return puseMove;}

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
}
