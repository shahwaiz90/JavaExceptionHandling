public class BackupProcess {

    void someErrorThrowingFunction() throws SessionExpireException, ArithmeticException {
        //Gets server response, in server response: there wasn't any user object. Which means its session is expired.
        SessionExpireException sessionExpireException = new SessionExpireException("SessionExpired");
        sessionExpireException.initCause(new NullPointerException("No User Object Found"));
        throw sessionExpireException;
    }
}
