package _java.Java8;

public interface StaticMethodInterface {
    public static void main(String[] args) {
        System.out.println("Static method in interface");
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.version"));
    }
}
