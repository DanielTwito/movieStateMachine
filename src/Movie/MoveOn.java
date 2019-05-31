package Movie;

public class MoveOn implements MovieState {

    private MovieRegion myMovieRegion;

    public MoveOn(MovieRegion movieRegion) {


        this.myMovieRegion=movieRegion;
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
