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
