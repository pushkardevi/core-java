package MorganStanley;

public class Demo3 {

    public static void main(String[] args) {

        Demo3 demo3 = new Demo3();

        try{
            demo3.divide(3,0);
        }catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }catch (Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println("Finally End");
        }

    }

    public void divide(int a, int b){
        try{
            int c = a/b;
        }finally {
            System.out.println("Finally");
        }
    }
}
