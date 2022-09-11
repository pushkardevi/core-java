package DefaultInterface;

public interface Actor {

    void dance();

    void speak();

    default void comedy() {

        System.out.println("I am Comedy....");


    }

}
