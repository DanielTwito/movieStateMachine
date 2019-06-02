package Requests;

import Manger.File;
import Manger.RegionManager;

public class IdleRegionRequest implements RequestState{

    private RequestRegion myRequestRegion;
    public String name = "IdleRegionRequest";

    public IdleRegionRequest(RequestRegion requestRegion) {

        this.myRequestRegion=requestRegion;
    }

    @Override
    public void fileRequest(File file) {

        int diskSize = RegionManager.getDiskSize();
        int fileSize = file.getFileSize();
        if(diskSize >= fileSize){
            myRequestRegion.setRequestCurrentState(myRequestRegion.getRequestApproval());
            ((RequestApproval)myRequestRegion.getRequestCurrentState()).doAction(file);

        }else{
            System.out.println("your'e request to insert file "+file.getFileName()+" to the Download Queue  is rejected");
            myRequestRegion.setRequestCurrentState(myRequestRegion.getRejectRequest());
            myRequestRegion.getRejectRequest().timeEventAfterFourSecond(file);

        }

    }

    @Override
    public void timeEventAfterFourSecond(File file) {

    }

    @Override
    public String getName() {
        return name;
    }
}
