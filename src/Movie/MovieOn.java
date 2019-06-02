package Movie;

public class MovieOn implements MovieState {

    private MovieRegion myMovieRegion;

    public MovieOn(MovieRegion movieRegion) {

        this.myMovieRegion=movieRegion;
    }

    @Override
    public void movieOn() {
        myMovieRegion.currentTime++;

    }

    @Override
    public void downloadAborted() {
        myMovieRegion.setMovieCurrentState(myMovieRegion.getIdleRegionMovie());

    }

    @Override
    public void finishDownload() {
        myMovieRegion.setMovieCurrentState(myMovieRegion.getIdleRegionMovie());

    }

    @Override
    public void restartMovie() {
        myMovieRegion.currentTime=0;

    }

    @Override
    public void holdMovie() {
        myMovieRegion.hold=true;
        myMovieRegion.setMovieCurrentState(myMovieRegion.getPuseMove());

    }

    @Override
    public void downloadError() {
        myMovieRegion.setMovieCurrentState(myMovieRegion.getPuseMove());
    }

    @Override
    public void internetOff() {
        myMovieRegion.setMovieCurrentState(myMovieRegion.getPuseMove());

    }

    @Override
    public void resume() {

    }

    @Override
    public void movieOff() {
        myMovieRegion.setMovieCurrentState(myMovieRegion.getIdleRegionMovie());
    }

    @Override
    public void whenInDownload() {

    }

    @Override
    public String toString() {
        return "Movie On";
    }
}
