package Java8;

interface Car {

    int drive(int input, int input1);
    //void fast();
}

public class LambdaExpression1 {

    public static void main(String[] args) {

        Car car = (input,input2) -> {
            return input - input2;
            //System.out.print("Driving");
        };
        car.drive(5,2);

    }


}
