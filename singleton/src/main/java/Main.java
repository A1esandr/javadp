public class Main {
    public static void main(String[] args){

        System.out.println("---Singleton as Enum---");

        AsEnum instance1 = AsEnum.INSTANCE;
        AsEnum instance2 = AsEnum.INSTANCE;

        System.out.println(instance1.equals(instance2));
        System.out.println(instance1.toString());
        System.out.println(instance2.toString());

        System.out.println("---Singleton as simple class with private constructor---");

        SimpleSingleton simpleSingleton1 = SimpleSingleton.getInstance();
        SimpleSingleton simpleSingleton2 = SimpleSingleton.getInstance();

        System.out.println(simpleSingleton1.equals(simpleSingleton2));
        System.out.println(simpleSingleton1.toString());
        System.out.println(simpleSingleton2.toString());
    }
}
