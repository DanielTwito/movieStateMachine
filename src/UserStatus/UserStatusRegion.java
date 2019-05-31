package UserStatus;


public class UserStatusRegion {
    private UserStatusState statusBeginner;
    private UserStatusState statusAdvanced;
    private UserStatusState statusProfessional;

    private UserStatusState userStatusStateCurrent;

    public UserStatusRegion(){
        statusBeginner = new StatusBeginner(this);
        statusAdvanced = new StatusAdvanced(this);
        statusProfessional = new StatusProfessional(this);

        //initial state begiiner
        userStatusStateCurrent = statusBeginner;
    }

    public void setUserStatusStateCurrent(UserStatusState userStatusStateCurrent) {this.userStatusStateCurrent = userStatusStateCurrent;}


    public UserStatusState getUserStatusStateCurrent() {return userStatusStateCurrent;}
    public UserStatusState getStatusBeginner() {return statusBeginner;}
    public UserStatusState getStatusAdvanced() {return statusAdvanced;}
    public UserStatusState getStatusProfessional() {return statusProfessional;}


    public void whenPointsLessthenFour() {

    }


    public void whenPointsGreaterOrEqualFour() {

    }


    public void whenPointsLessthenSeven() {

    }


    public void whenPointsGreaterOrEqualSeven() {

    }
}
