package UserStatus;

public class StatusAdvanced implements UserStatusState {

    private UserStatusRegion myUserStatusRegion;

    public StatusAdvanced(UserStatusRegion userStatusRegion) {
        this.myUserStatusRegion = userStatusRegion;
    }

    @Override
    public void whenPointsLessthenFour() {
        myUserStatusRegion.setUserStatusStateCurrent(myUserStatusRegion.getStatusBeginner());
    }

    @Override
    public void whenPointsGreaterOrEqualFour() {

    }

    @Override
    public void whenPointsLessthenSeven() {

    }

    @Override
    public void whenPointsGreaterOrEqualSeven() {
        myUserStatusRegion.setUserStatusStateCurrent(myUserStatusRegion.getStatusProfessional());

    }


    @Override
    public String toString() {
        return "Advance Status";
    }
}
