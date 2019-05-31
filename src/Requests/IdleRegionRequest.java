package Requests;

import Manger.File;
import Manger.RegionManager;

public class IdleRegionRequest implements RequestState{

    private RequestRegion myRequestRegion;

    public IdleRegionRequest(RequestRegion requestRegion) {

        this.myRequestRegion=requestRegion;
    }

    @Override
    public void fileRequest(File file) {

        int diskSize = RegionManager.getDiskSize();
        int fileSize = file.getFileSize();
        if(diskSize >= fileSize){
            myRequestRegion.setRequestCurrentState(myRequestRegion.getRequestApproval());
        }else{
            myRequestRegion.setRequestCurrentState(myRequestRegion.getRejectRequest());
        }

    }

    @Override
    public void timeEventAfterFourSecond(File file) {

    }
}
