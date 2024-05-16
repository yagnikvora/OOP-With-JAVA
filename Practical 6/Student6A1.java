import java.util.*;

class Student {
    int id_no, no_of_subjects_registered;
    int subject_code[];
    int subject_credit[];
    char grade_obtained[];
    double spi;

    Student(int id, int no_sub, int sub_code[], int sub_credit[], char grade[]) {
        id_no = id;
        no_of_subjects_registered = no_sub;
        subject_code = sub_code;
        subject_credit = sub_credit;
        grade_obtained = grade;
    }

    void calculateSpi() {
        int sum = 0, csum = 0;
        for (int i = 0; i < no_of_subjects_registered; i++) {
            switch (grade_obtained[i]) {
                case 'A':
                    sum += (10 * subject_credit[i]);
                    break;
                case 'B':
                    sum += (9 * subject_credit[i]);
                    break;
                case 'C':
                    sum += (8 * subject_credit[i]);
                    break;
                case 'D':
                    sum += (7 * subject_credit[i]);
                    break;
                case 'E':
                    sum += (6 * subject_credit[i]);
                    break;
                case 'F':
                    sum += (0 * subject_credit[i]);
                    break;
                default:
                    break;
            }
        }
        for (int c : subject_credit) {
            csum += c;
        }
        spi = sum / csum;
        System.out.println("\tSPI :- " + spi);
    }
}

public class Student6A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_students = Integer.parseInt(args[0]);
        Student s[] = new Student[no_of_students];

        for (int i = 0; i < no_of_students; i++) {
            System.out.println("Student----" + (i + 1));
            System.out.print("\tEnter Student ID :- ");
            int id = sc.nextInt();
            System.out.print("\tEnter No of Subjects :- ");
            int no_of_subs = sc.nextInt();
            int credit[] = new int[no_of_subs];
            int code[] = new int[no_of_subs];
            char grade[] = new char[no_of_subs];
            for (int j = 0; j < no_of_subs; j++) {
                System.out.println("\t\tFor Subject - " + (j + 1));
                System.out.print("\t\t\tEnter subject code :- ");
                code[j] = sc.nextInt();
                System.out.print("\t\t\tEnter credit code :- ");
                credit[j] = sc.nextInt();
                System.out.print("\t\t\tEnter Grade code :- ");
                grade[j] = sc.next().charAt(0);
            }

            s[i] = new Student(id, no_of_subs, code, credit, grade);
            s[i].calculateSpi();
        }
    }
}