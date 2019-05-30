package Movie;

public class MovieRegion implements MovieState {

    public MovieState idleRegionMovie;
    public MovieState moveOn;
    public MovieState puseMove;

    public MovieState movieStateCurrent;

    public MovieRegion(){
        idleRegionMovie = new IdleRegionMovie(this);
        moveOn = new MoveOn(this);
        puseMove = new PuseMove(this);

        //initial state in movie regine
        movieStateCurrent = idleRegionMovie;
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
