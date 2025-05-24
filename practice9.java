
/*class numbers {
    private int a;
    private int b;

    public void sum() {
        System.out.println(a+b);
    }
    public void sub() {
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        numbers obj = new numbers();
        obj.a =5;
        obj.b = 10;

        obj.sum();
        obj.sub(); */


public class practice9 {

    static String Employee_Name;
    static Float Employee_Salary;

    static void set(String n, Float p) {
        Employee_Name = n;
        Employee_Salary = p;
    }

    static void get() {
        System.out.println("Employee Name: " + Employee_Name);
        System.out.println("Employee Salary: " + Employee_Salary);
    }

    public static void main(String[] args) {
        practice9.set("Amit mishra", 10000.0f);
        practice9.get();
    }
}