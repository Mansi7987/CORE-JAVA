class Student {
    public int roll_no;
    public String name;

    Student(int roll_no) {
        this.roll_no = roll_no;
        this.name = name;
}
@Override
public String toString() {
    return "roll_no: " + roll_no + ", name: " + name;
}

}

public class Main{
    public static void main(String[] args) {
        Student arr[] = new Student[5];

        arr[0] = new Student(1);
        arr[1] = new Student(2);
        arr[2] = new Student(3);
        arr[3] = new Student(4);
        arr[4] = new Student(5);

        for (int i = 0; i < arr.length; i++) 
        System.out.println("Element at " + i + " : { " + arr[i].roll_no + " " + arr[i].name + "}");
    }
}
