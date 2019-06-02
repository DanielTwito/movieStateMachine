package Movie;

public interface MovieState {

    void movieOn();
    void downloadAborted();
    void finishDownload();
    void restartMovie();
    void holdMovie();
    void downloadError();
    void internetOff();
    void resume();
    void movieOff();
    //not sure about this function
    //this is the transition between puse_movie to move_on in the state machine
    void whenInDownload();
    String toString();



}
