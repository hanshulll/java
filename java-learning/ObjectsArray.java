class Student{
    int rollno;
    String name;
    int marks;

}
public class ObjectsArray {
    public static void main(String [] args){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Hanshul";
        s1.marks = 100;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Random";
        s2.marks = 67;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Hulk";
        s3.marks = 80;

        System.out.println(s1.name+" : "+s1.marks);

        Student[] arr = new Student[3];
        arr[0]= s1;
        arr[1]=s2;
        arr[2]=s3;

        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i].name+" : "+arr[i].marks);
        }

    }

}