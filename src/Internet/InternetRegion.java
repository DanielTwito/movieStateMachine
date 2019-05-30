package Internet;

public class InternetRegion implements InternetStatusState{
    public InternetStatusState connectInternet;
    public InternetStatusState internetOff;

    public InternetStatusState internetStatusStateCurrent;

    public InternetRegion() {
        connectInternet = new ConnectInternet(this);
        internetOff = new InternetOff(this);

        internetStatusStateCurrent = connectInternet;
    }



    @Override
    public void internetOn() {

    }

    @Override
    public void internetOff() {

    }
}
