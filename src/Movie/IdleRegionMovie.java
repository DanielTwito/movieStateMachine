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
            if(RegionManager.isTwentyPrecent()){
                myMovieRegion.currentTime=0;
                myMovieRegion.setMovieCurrentState(myMovieRegion.getMoveOn());
            }
            else{
                System.out.println("The download percent is not 20 or more yet. Can't Play Movie");
            }

        }
        else{
            System.out.println("No Internet Connection. Can't Play Movie");
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
    public void movieOff() {

    }

    @Override
    public void whenInDownload() {

    }

    @Override
    public String toString() {
        return "IdleMovieRegion";
    }
}
