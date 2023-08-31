import java.util.*;

class Student {
    String studentCode;
    String fullName;

    Student(String studentCode, String fullName) {
        this.studentCode = studentCode;
        this.fullName = fullName;
    }
}

class Course {
    String courseCode;
    String courseName;
    int credit;

    Course(String courseCode, String courseName, int credit) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit = credit;
    }
}

class Invoice {
    Student student;
    List<Course> courses;
    String decreeCode;
    String decreeName;
    double tuitionFee;

    Invoice(Student student, List<Course> courses, String decreeCode, String decreeName, double tuitionFee) {
        this.student = student;
        this.courses = courses;
        this.decreeCode = decreeCode;
        this.decreeName = decreeName;
        this.tuitionFee = tuitionFee;
    }

    double calculateTotalTuitionFee() {
        double totalTuitionFee = 0;
        for (Course course : courses) {
            totalTuitionFee += course.credit * tuitionFee;
        }
        return totalTuitionFee;
    }
}

class PaymentController {
    Invoice getInvoice() {
        Scanner scanner = new Scanner(System.in);
        String studentCode = scanner.nextLine();
        String fullName = scanner.nextLine();
        int numCourses = scanner.nextInt();
        scanner.nextLine(); // Clear newline character

        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            String courseCode = scanner.nextLine();
            String courseName = scanner.nextLine();
            int credit = scanner.nextInt();
            scanner.nextLine(); // Clear newline character

            courses.add(new Course(courseCode, courseName, credit));
        }

        String decreeCode = scanner.nextLine();

        String decreeName = scanner.nextLine();
        double tuitionFee = scanner.nextDouble();

        Student student = new Student(studentCode, fullName);
        Invoice invoice = new Invoice(student, courses, decreeCode, decreeName, tuitionFee);

        return invoice;
    }
}

class InvoiceView {
    static void show(Invoice invoice) {
        System.out.println("Mã sinh viên: " + invoice.student.studentCode);
        System.out.println("Họ tên: " + invoice.student.fullName);
        System.out.println("Các môn học:");
        for (Course course : invoice.courses) {
            System.out.println(course.courseName);
        }
        double totalTuitionFee = invoice.calculateTotalTuitionFee();
        System.out.println("Học phí phải nộp là: " + totalTuitionFee);
        System.out.println("Theo QĐ: " + invoice.decreeCode);
    }
}

public class hocPhi {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
