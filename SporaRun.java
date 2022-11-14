public class SporaRun implements Runnable{
    @Override
    public synchronized void run(){
        while (Program.str.length()<6){
            Program.str=Program.str.substring(0,Program.str.length()-1);
            System.out.println("SPORA "+Program.str);
            try {
                Thread.sleep(2000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
