package Requests;

import Manger.File;

public class RejectRequest implements RequestState {

    private RequestRegion myRequestRegion;

    public RejectRequest(RequestRegion requestRegion) {
        this.myRequestRegion = requestRegion;
    }

    @Override
    public void fileRequest(File file) {

    }

    @Override
    public void timeEventAfterFourSecond(File file) {

    }
}
