import java.util.Scanner;

public class Find_Element_Array {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name Student: ");
        String input_name = sc.nextLine();

        boolean isExit = false;
        for (int i = 0 ; i < students.length ; i++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the student in the list: " + input_name + " is:" +(i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("Not Find Student in the list");
        }
    }
}
