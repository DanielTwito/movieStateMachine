package UserStatus;


public class UserStatusRegion implements UserStatusState {
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

    public UserStatusState getStatusBeginner() {return statusBeginner;}
    public UserStatusState getStatusAdvanced() {return statusAdvanced;}
    public UserStatusState getStatusProfessional() {return statusProfessional;}

    @Override
    public void whenPointsLessthenFour() {

    }

    @Override
    public void whenPointsGreaterOrEqualFour() {

    }

    @Override
    public void whenPointsLessthenSeven() {

    }

    @Override
    public void whenPointsGreaterOrEqualSeven() {

    }
}
