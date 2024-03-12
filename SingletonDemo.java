public class SingletonDemo {

    //Create a static instance
    private static SingletonDemo singleton;

    //Establish a private Constructor
    private SingletonDemo(){
        System.out.println("Private SingletonDemo Constructor");
    }

    //Provide a public method that returns the instance and ensures its creation if doesn't exist
    public static SingletonDemo getInstance(){
        if(singleton == null){
            singleton = new SingletonDemo();
        }
        return singleton;
    }

    public static void main(String[] args){
        SingletonDemo demo1 = SingletonDemo.getInstance();
        SingletonDemo demo2 = SingletonDemo.getInstance();
        System.out.println("Are both objects same  : " + (demo1 == demo2));
    }
}
