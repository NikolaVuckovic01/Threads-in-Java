public class Spora extends Thread {
    @Override
    public synchronized void run(){
        int fl = 0;
        while (fl != 1)
        {
            //If the letter is not found, the previous letter in the English alphabet is set.
            if (Program.rec.charAt(0) != 'L') {
                char[] niz = Program.rec.toCharArray();
                int slovoint = Program.rec.charAt(0);
                slovoint--;
                niz[0] = (char) slovoint;
                Program.rec = String.valueOf(niz);
            }
            //If the letter is found, it is not changed until the end of the program.
            else {
                char[] niz = Program.rec.toCharArray();
                int slovoint = Program.rec.charAt(0);
                niz[0] = (char) slovoint;
                Program.rec = String.valueOf(niz);
            }
            if (Program.rec.charAt(1) != 'E') {
                char[] niz = Program.rec.toCharArray();
                int slovoint = Program.rec.charAt(1);
                slovoint--;
                niz[1] = (char) slovoint;
                Program.rec = String.valueOf(niz);
            }
            else {
                char[] niz = Program.rec.toCharArray();
                int slovoint = Program.rec.charAt(1);
                niz[1] = (char) slovoint;
                Program.rec = String.valueOf(niz);
            }
            if (Program.rec.charAt(2) != 'G') {
                char[] niz = Program.rec.toCharArray();
                int slovoint = Program.rec.charAt(2);
                slovoint--;
                niz[2] = (char) slovoint;
                Program.rec = String.valueOf(niz);
            }
            else {
                char[] niz = Program.rec.toCharArray();
                int slovoint = Program.rec.charAt(2);
                niz[2] = (char) slovoint;
                Program.rec = String.valueOf(niz);
            }
            if (Program.rec.charAt(3) != 'O') {
                char[] niz = Program.rec.toCharArray();
                int slovoint = Program.rec.charAt(3);
                slovoint--;
                niz[3] = (char) slovoint;
                Program.rec = String.valueOf(niz);
            }
            else {
                char[] niz = Program.rec.toCharArray();
                int slovoint = Program.rec.charAt(3);
                niz[3] = (char) slovoint;
                Program.rec = String.valueOf(niz);
                fl = 1;
                break;
            }
            System.out.println(Program.rec);
            try {
                sleep(2000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
