import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BackupProcess backupProcess = new BackupProcess();
        try {
            backupProcess.someErrorThrowingFunction();
            return;
        }
        catch (SessionExpireException e) {
//            if(e.getClass().getCanonicalName().equals("SessionExpireException")){
                //Handling....!!!!
                // logout the user and show appropriate message that his session has been expired.
                //Delete user database
                System.out.println("SessionExpireException Exception Occurred!: "+e.getMessage());
                System.out.println("SessionExpireException Exception Cause!: "+e.getCause());
                //may be send the cause to server for further debugging.

//            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer Exception Occurred!: "+e.getMessage());
        }
        catch (IOException e){
            System.out.println("IO Exception Occurred!: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Other Exception Occurred!: "+e.getMessage());
        }
        finally{
            //Here we close any db connections we opened above. etc
            //This blocks always executes.
            System.out.println("This code always execute");
        }
        System.out.println("Safe code executed!");

    }
}
