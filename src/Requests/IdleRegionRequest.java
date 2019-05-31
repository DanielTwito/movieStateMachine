package Requests;

import Manger.File;

public class IdleRegionRequest implements RequestState{

    private RequestRegion myRequestRegion;

    public IdleRegionRequest(RequestRegion requestRegion) {

        this.myRequestRegion=requestRegion;
    }

    @Override
    public void fileRequest(File file) {

    }

    @Override
    public void timeEventAfterFourSecond(File file) {

    }
}
