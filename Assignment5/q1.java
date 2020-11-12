public class q1 {
public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                int x = 0;
                int y,z;
                while (x<=100) {
                    x = x + 1;
                    System.out.print(x + " ");
                    if (x % 10 == 0)
                    {   System.out.println();
                        System.out.println("10 second message");
                        
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
    }
}