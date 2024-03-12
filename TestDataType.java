import java.util.List;
import java.util.function.Predicate;

public class TestDataType {

        public void print(Integer i) {
            System.out.println("Integer");
        }

        public void print(int i) {
            System.out.println("int");
        }

        public void print(long i) {
            System.out.println("long");
        }

        public static void main(String args[]) {
            TestDataType test = new TestDataType();
            test.print(10);
        }

}
