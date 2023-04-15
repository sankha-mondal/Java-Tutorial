package generics;

 

//class Abc {

//        void read(int a, int b) {
//            System.out.println(a+" "+b);
//        }
//        void read(double a, double b) {
//            System.out.println(a+ " "+b);
//        }
//        void read(String s1, String s2) {
//            System.out.println(s1+" "+s2);
//        }
//}
 

class XYZ<T> {
        void read(T t1, T t2) {
            System.out.println(t1+" "+t2);
        }
        T getInfo(T t) {
            return t;
        }
}

public class GenericTestApp {

    public static void main(String[] args) {

        

//        Abc obj1 = new Abc();
//        obj1.read(10, 20);
//        obj1.read(10.10,20.30);
//        obj1.read("Raj", "Deep");

        XYZ obj2 = new XYZ();

        obj2.read(1, 2);
        obj2.read(10.10, 20.20);
        obj2.read("Ravi", "Raj");

        System.out.println(obj2.getInfo("Raj"));
        System.out.println(obj2.getInfo(10));
        System.out.println(obj2.getInfo(10.10));

    }

}