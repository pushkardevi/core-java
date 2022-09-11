package JavaNewFeatures;

public class StringTest {


    public static void main(String[] args) {

        System.out.println(" ".isBlank());
        System.out.println(" ".isBlank());
        System.out.println(" LR FG FEE ".strip().replace(" ", "$"));
        System.out.println(" LR ".stripLeading().replace(" ", "$"));
        System.out.println(" LR ".stripTrailing().replace(" ", "$"));

    }
}
