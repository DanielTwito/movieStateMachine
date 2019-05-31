package Requests;

import Manger.File;

public class RequestApproval implements RequestState {
    private RequestRegion myRequestRegion;

    public RequestApproval(RequestRegion requestRegion) {
    this.myRequestRegion=requestRegion;
    }

    @Override
    public void fileRequest(File file) {

    }

    @Override
    public void timeEventAfterFourSecond(File file) {

    }
}
