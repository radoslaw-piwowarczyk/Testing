package AssertJ.enumSource;

public class AcessController {
    public boolean checkAccessForSignupStatus(SingUpStatus singUpStatus){
        return singUpStatus == SingUpStatus.PAID;
    }
}
