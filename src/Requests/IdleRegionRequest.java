package Requests;

public class IdleRegionRequest implements RequestState{

    private RequestRegion myRequestRegion;

    public IdleRegionRequest(RequestRegion requestRegion) {

        this.myRequestRegion=requestRegion;
    }

    @Override
    public void fileRequest(int fileSize) {

    }

    @Override
    public void timeEventAfterFourSecond(int fileSize) {

    }
}
