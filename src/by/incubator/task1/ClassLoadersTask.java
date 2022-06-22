package by.incubator.task1;

public class ClassLoadersTask {

    public static void main(String[] args) {

        ClassLoadersTask classLoaders = new ClassLoadersTask();
        MyClass myClass = new MyClass();
        System.out.println("main class loader: " + classLoaders.getClass().getClassLoader());
        System.out.println("main class loader parent: " + classLoaders.getClass().getClassLoader().getParent());
        System.out.println("main class loader 2-nd gen parent: " + classLoaders.getClass().getClassLoader().getParent().getParent());

        System.out.println();

        System.out.println("Integer class loader: " + Integer.class.getClassLoader());

        System.out.println();

        System.out.println("MyClass loader: " + myClass.getClass().getClassLoader());
        System.out.println("MyClass loader parent: " + myClass.getClass().getClassLoader().getParent());
        System.out.println("MyClass loader 2-nd gen parent: " + myClass.getClass().getClassLoader().getParent().getParent());
    }
}
