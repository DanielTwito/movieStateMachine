package UserStatus;

public class StatusProfessional implements UserStatusState {

    private UserStatusRegion myUserStatusRegion;

    public StatusProfessional(UserStatusRegion userStatusRegion) {
        this.myUserStatusRegion =userStatusRegion;
    }

    @Override
    public void whenPointsLessthenFour() {

    }

    @Override
    public void whenPointsGreaterOrEqualFour() {

    }

    @Override
    public void whenPointsLessthenSeven() {
        myUserStatusRegion.setUserStatusStateCurrent(myUserStatusRegion.getStatusAdvanced());

    }

    @Override
    public void whenPointsGreaterOrEqualSeven() {

    }

    @Override
    public String toString() {
        return "Professional Status";
    }
}
