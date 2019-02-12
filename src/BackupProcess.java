public class BackupProcess {

    void someErrorThrowingFunction() throws SessionExpireException, ArithmeticException {
        throw new SessionExpireException();
//        throw new NullPointerException("NPE");
    }
}
