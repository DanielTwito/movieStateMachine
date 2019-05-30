package Requests;

public interface RequestState {

    //for the event fileRequest[disk > file.size)
    //for the event fileRequest[disk < file.size)
    void fileRequest(int fileSize);

    //gor the event time(4)[disk > or < file.size]
    void timeEventAfterFourSecond(int fileSize);

}
