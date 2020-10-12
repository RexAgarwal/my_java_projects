import java.util.Scanner;
class EmployeeTester{
    public static void main(String[] args) {
        String uname;
        String uid;
        int udept;
        float ubasic;
        int i=0;
        Employee user1[] = new Employee[3];
        Scanner user = new Scanner(System.in);
        for (int j = 0; j < 3; j++) {
            System.out.println("\n Please Enter name & id & department name and basic sal of Employee: ");
            uname = user.next();
            uid = user.next();
            udept = user.nextInt();
            ubasic = user.nextFloat();

            user1[j] = new Employee(uname, uid,udept,ubasic);
            break;
        }

            System.out.print("Main Menu \n ...................................   ");
            System.out.println(" You want details for which Employee? Enter the id");
            uid = user.next();
            for (i = 0; i < user1.length; i++) {
                boolean check = user1[i].check_id(uid);
                if (check){
            
                    break;
                }
    
            }
            if (i == user1.length){
                System.out.println("No such Employee was found..");
            }
            else 
            user1[i].displayDetails();
            user.close();

    }
}