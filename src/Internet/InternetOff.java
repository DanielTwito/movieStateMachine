package Internet;

public class InternetOff implements InternetStatusState {

    private InternetRegion internetRegion;

    public InternetOff(InternetRegion internetRegion) {
        this.internetRegion = internetRegion;
    }

    @Override
    public void internetOn() {

    }

    @Override
    public void internetOff() {

    }
}
