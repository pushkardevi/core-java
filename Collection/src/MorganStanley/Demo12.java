package MorganStanley;

public class Demo12 {


    int iVal = 85;
    Demo12() {
        iVal = 41;
    }
    {
        iVal = 27;
    }

    public static void main(String[] args) {
        Demo12 myVar = new Demo12();
        System.out.println(myVar.iVal);
    }
}
