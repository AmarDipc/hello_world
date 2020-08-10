package R;
import java.util.*;
public class marks {
    public static void main(String[]args){
        int maths,science,english,biology,Physical_education;
        double total;
        boolean result;
        String Students;

        Scanner marks = new Scanner(System.in);
        do {
            System.out.println("Name of Students");
            Students = marks.next();
            System.out.println("marks for maths");
            maths = marks.nextInt();
            System.out.println("marks for science");
            science = marks.nextInt();
            System.out.println("marks for english");
            english = marks.nextInt();
            System.out.println("marks for biology");
            biology = marks.nextInt();
            System.out.println("marks for Physical_education");
            Physical_education = marks.nextInt();
            total = (maths+science+english+biology+Physical_education)/5;
            if(total>80)
            {
                System.out.println("excellent");

                System.out.println("Percentage of the Students" +total);
            }
            else if (total>60)
            {
                System.out.println("great");
                System.out.println("Percentage of the Students" +total);
            }
            else if (total>40)
            {
                System.out.println("good");

                System.out.println("Percentage of the Students" +total);
            }
            else
            {
                System.out.println("fail");

                System.out.println("Percentage of the Students" +total);
            }
            System.out.println("any students?(true or false)");
            result =marks.nextBoolean();

        }while (result);

    }

}
