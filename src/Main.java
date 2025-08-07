public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Alice", 20, "BSIT", 85, 90, 90);
        Student s2 = new Student("Bob", 21, "BSCS", 90, 80, 90);
        Student s3 = new Student("Charlie", 22, "BSIT", 90, 90, 80);

        int passingCount = 0;


        System.out.println();
        s1.displayInfo();
        double avg1 = s1.calculateAverage();
        System.out.println("Average: " + avg1);
        String grade1 = s1.getLetterGrade();
        System.out.println("Letter Grade: " + grade1);
        boolean pass1 = s1.isPassing();
        if (pass1) {
            System.out.println("Status: PASSING");
            passingCount++;
        } else {
            System.out.println("Status: FAILING");
        }


        System.out.println();
        s2.displayInfo();
        double avg2 = s2.calculateAverage();
        System.out.println("Average: " + avg2);
        String grade2 = s2.getLetterGrade();
        System.out.println("Letter Grade: " + grade2);
        boolean pass2 = s2.isPassing();
        if (pass2) {
            System.out.println("Status: PASSING");
            passingCount++;
        } else {
            System.out.println("Status: FAILING");
        }


        System.out.println();
        s3.displayInfo();
        double avg3 = s3.calculateAverage();
        System.out.println("Average: " + avg3);
        String grade3 = s3.getLetterGrade();
        System.out.println("Letter Grade: " + grade3);
        boolean pass3 = s3.isPassing();
        if (pass3) {
            System.out.println("Status: PASSING");
            passingCount++;
        } else {
            System.out.println("Status: FAILING");
        }

        System.out.println();
        System.out.println("Summary: " + passingCount + " out of 3 students are passing.");
    }
}
class Student {
    String name;
    int age;
    String course;
    double grade1;
    double grade2;
    double grade3;


    public Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }


    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }


    public String getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }


    public boolean isPassing() {
        return calculateAverage() >= 70;
    }
}
