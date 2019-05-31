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

    public void setUserStatusStateCurrent(UserStatusState userStatusStateCurrent){
        System.out.println("Exit "+ this.userStatusStateCurrent.toString());
        this.userStatusStateCurrent = userStatusStateCurrent;
        System.out.println("Enter "+ this.userStatusStateCurrent.toString());
    }


    public UserStatusState getUserStatusStateCurrent() {return userStatusStateCurrent;}
    public UserStatusState getStatusBeginner() {return statusBeginner;}
    public UserStatusState getStatusAdvanced() {return statusAdvanced;}
    public UserStatusState getStatusProfessional() {return statusProfessional;}


    public void whenPointsLessthenFour() {
        userStatusStateCurrent.whenPointsLessthenFour();
    }


    public void whenPointsGreaterOrEqualFour() {
        userStatusStateCurrent.whenPointsGreaterOrEqualFour();
    }


    public void whenPointsLessthenSeven() {
        userStatusStateCurrent.whenPointsLessthenSeven();
    }


    public void whenPointsGreaterOrEqualSeven() {
        userStatusStateCurrent.whenPointsGreaterOrEqualSeven();
    }

}
