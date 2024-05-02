package java_obj_test;

public class TestMethodStatic {
    public static void main(String[] args) {
        String chaine = "12";
        int parsedChaine = Integer.parseInt(chaine);
        System.out.println(parsedChaine);
        int a = 3;
        int b = 5;
        int result = Integer.max(a, b);
        System.out.println(result);
    }
}
