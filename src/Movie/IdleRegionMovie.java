package Movie;

import Internet.ConnectInternet;
import Manger.RegionManager;

public class IdleRegionMovie implements MovieState{

    private MovieRegion myMovieRegion;




    public IdleRegionMovie(MovieRegion movieRegion) {
    this.myMovieRegion=movieRegion;
    myMovieRegion.currentTime=0;
    }



    @Override
    public void movieOn() {
        if(RegionManager.getInternetRegion().getInternetStatusCurrentState() instanceof ConnectInternet){
            //and if presence of download >20%
            myMovieRegion.currentTime=0;
            myMovieRegion.setMovieCurrentState(myMovieRegion.getMoveOn());
        }

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

    @Override
    public String toString() {
        return "Idle";
    }
}
