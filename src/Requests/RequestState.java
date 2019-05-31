package Requests;

import Manger.File;

public interface RequestState {

    //for the event fileRequest[disk > file.size)
    //for the event fileRequest[disk < file.size)
    void fileRequest(File file);


    //gor the event time(4)[disk > or < file.size]
    void timeEventAfterFourSecond(File file);

    String getName();

}
