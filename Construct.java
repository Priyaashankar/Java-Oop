
class Sample {
    int rollno;
    int marks;

    Sample(int num, int mark) {
        System.out.println("This is default Contructor");
        rollno = num;
        marks = mark;

    }
}

class Construct {
    public static void main(String args[]) {
        Sample obj = new Sample(26, 96);
        System.out.println(obj.rollno);
        System.out.println(obj.marks);
    }
}
