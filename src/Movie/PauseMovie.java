package Movie;

public class PauseMovie implements MovieState {

    private MovieRegion myMovieRegion;

    public PauseMovie(MovieRegion movieRegion) {
    this.myMovieRegion=movieRegion;
    }

    @Override
    public void movieOn() {

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
        myMovieRegion.hold=false;
        myMovieRegion.setMovieCurrentState(myMovieRegion.getMoveOn());

    }

    @Override
    public void movieOff() {
        myMovieRegion.setMovieCurrentState(myMovieRegion.getIdleRegionMovie());
    }

    @Override
    public void whenInDownload() {
        if(!myMovieRegion.hold){
            System.out.println("Event when(inDownload)[!hold] was fired");
            myMovieRegion.setMovieCurrentState(myMovieRegion.getMoveOn());

        }
    }

    @Override
    public String toString() {
        return "Pause Movie";
    }
}
