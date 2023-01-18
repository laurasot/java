public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        manipulator.trimAndConcat("    Hola     ","     Mundo    ");       
        
        int a = manipulator.getIndexOrNull("Coding", "n");
        int b = manipulator.getIndexOrNull("Hola Mundo", "n");
        int c = manipulator.getIndexOrNull("Saludar", "n");
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // -1

        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        int d = manipulator.getIndexOrNull(word, subString);
        int e = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // -1


        String word1 = manipulator.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(word1); // olmundo

    }
}
