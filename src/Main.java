
public class Main {

    public static void main(String[] args) {
        BackupProcess backupProcess = new BackupProcess();
        try {
            backupProcess.someErrorThrowingFunction();
            return;
        }
        catch (Exception e) {
            if(e.getClass().getCanonicalName().equals("SessionExpireException")){
                //Handling....!!!!
                // logout the user and show appropriate message that his session has been expired.
                //Delete user database
                System.out.println("SessionExpireException Exception Occurred!: "+e.getMessage());
                System.out.println("SessionExpireException Exception Cause!: "+e.getCause());

            }
             if(e.getMessage()!=null&& e.getMessage().equals("NPE")){
                //Handling....!!!
                //Initialize that particular object if it is null or show appropriate message.
                //Handling is done according to the scenario.
                System.out.println("NullPointerException Exception Occurred!: "+e.getCause());

            }
        }finally{
            //Here we close any db connections we opened above. etc
            //This blocks always executes.
            System.out.println("This code always execute");
        }
        System.out.println("Safe code executed!");

    }
}
