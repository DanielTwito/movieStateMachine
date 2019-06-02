package UserStatus;

public interface UserStatusState {

    //for the event when(point<4)
    void whenPointsLessthenFour();
    //for the event when(point>=4)
    void whenPointsGreaterOrEqualFour();
    //for the event when(point<7)
    void whenPointsLessthenSeven();
    //for the event when(point>=7)
    void whenPointsGreaterOrEqualSeven();
    //string to print the name of the state
    String toString();
    int getUserStatus();
}
