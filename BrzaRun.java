public class BrzaRun implements Runnable{
    @Override
    public synchronized void run(){
        while (Program.str.length()<6){
            Program.str+="#";
            System.out.println("BRZA "+Program.str);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
