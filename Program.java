public class Program extends Thread{
    public static String rec="JEEJ";
    public static String str="###";
    public static void main(String[] args) throws InterruptedException {

        //The program will be executed until the word "LEGO" is found.
        Brza br=new Brza(); //The "Brza" class places the next letter of the alphabet.
        Spora sp=new Spora(); //The "Spora" class places the previous letter of the alphabet.
        br.start();
        sp.start();
        br.join();
        sp.join();

        // The program will be executed until 6 characters are obtained in the string.
        BrzaRun bRun=new BrzaRun(); //The class "bRun" appends # to the string.
        SporaRun sRun=new SporaRun(); //The class subtracts # from a string.
        Thread th1=new Thread(bRun);
        Thread th2=new Thread(sRun);
        th1.start();
        th2.start();
    }
}
