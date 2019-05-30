package UserStatus;


public class UserStatusRegion implements UserStatusState {
    public UserStatusState statusBeginner;
    public UserStatusState statusAdvanced;
    public UserStatusState statusProfessional;

    public UserStatusState userStatusStateCurrent;

    public UserStatusRegion(){
        statusBeginner = new StatusBeginner(this);
        statusAdvanced = new StatusAdvanced(this);
        statusProfessional = new StatusProfessional(this);

        //initial state begiiner
        userStatusStateCurrent = statusBeginner;
    }

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
