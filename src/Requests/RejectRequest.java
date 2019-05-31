package Requests;

import Manger.File;
import Manger.RegionManager;

public class RejectRequest implements RequestState {

    private RequestRegion myRequestRegion;
    public String name = "RejectRequest";
    public RejectRequest(RequestRegion requestRegion) {
        this.myRequestRegion = requestRegion;
    }

    @Override
    public void fileRequest(File file) {


    }

    @Override
    public void timeEventAfterFourSecond(File file) {
        int diskSize = RegionManager.getDiskSize();
        int fileSize = file.getFileSize();
        if(diskSize >= fileSize){
            myRequestRegion.setRequestCurrentState(myRequestRegion.getRequestApproval());
            ((RequestApproval)myRequestRegion.getRequestCurrentState()).doAction(file);

        }else{
            System.out.println("Disk cant store this file");
            myRequestRegion.setRequestCurrentState(myRequestRegion.getIdleRegionRequest());
        }

    }

    @Override
    public String getName() {
        return name;
    }
}
