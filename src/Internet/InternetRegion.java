package Internet;

public class InternetRegion implements InternetStatusState{

    private InternetStatusState connectInternet;
    private InternetStatusState internetOff;
    private InternetStatusState internetStatusCurrentState;

    public InternetRegion() {
        connectInternet = new ConnectInternet(this);
        internetOff = new InternetOff(this);

        internetStatusCurrentState = connectInternet;
    }



    @Override
    public void internetOn() {

    }

    @Override
    public void internetOff() {

    }
}
