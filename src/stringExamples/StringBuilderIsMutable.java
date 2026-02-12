package stringExamples;

public class StringBuilderIsMutable {
	
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Alok");
        System.out.println("Initial StringBuilder: " + sb);

        sb.append(" is awesome!");
        System.out.println("After append: " + sb);
    }
//    Initial StringBuilder: Alok
//    After append: Alok is awesome!
}
