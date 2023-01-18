public class HumanTest {
    public static void main(String[] args) {
        Human ladron = new Human();
        Human cocinero = new Human();
        Human profesor = new Human();
        ladron.attack(cocinero);
        ladron.attack(profesor);
    }
}
