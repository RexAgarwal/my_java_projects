import java.util.Scanner;

class CreditCard {
    String name;
    String cardNo;
    boolean enabled;
    int pin;
    String expiryMonth;
    String cardType; // (Platinum, Gold, Silver)
    int currentCredit;
    int creditLimit;

    CreditCard(String ename, String ecardNo) {
        name = ename;
        cardNo = ecardNo;
        enabled = true;
        setdata();

    }

    void setdata() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter your pin: ");
        pin = s.nextInt();
        System.out.println("\n Expiry Month:");
        expiryMonth = s.next();
        System.out.println("\n Credit Limit: ");
        creditLimit = s.nextInt();
        System.out.println("\n Current Credit:");
        currentCredit = s.nextInt();
        System.out.println("\n Card Type(platinum,gold,silver): ");
        cardType = s.next();
        boolean is_valid = false;
        System.out.println(cardType);
        while (!is_valid) {
            if (cardType.equals("platinum") || cardType.equals("gold") || cardType.equals("silver")) {
                is_valid = true;

            } else {
                System.out.println("Please enter a valid card type");
                System.out.println("\n Card Type(platinum,gold,silver): ");
                cardType = s.next();

            }

        }
    }

    boolean check_pin(int ppin) {
        if (pin == ppin)
        return true;

        else
        return false;

        
    }

    void changePin(int newPin) {
        pin = newPin;
        System.out.println("Pin is successfully changed...");

    }

    void display() {
        System.out.println(" Name:" + name + "\n Card number:" + cardNo + "\n Expiry Month:" + expiryMonth + "\n"
                + " Card Type:" + cardType + "\n Credit limit:" + creditLimit);
    }

    void changeCardStatus(boolean status) {
        enabled = status;

    }

    void transact(int amt) {
        if (enabled) {
            Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
            System.out.println("Please Enter your pin: ");
            int a = sc.nextInt();
            if (a == pin) {
                if (amt < creditLimit) {
                    if (cardType == "platinum") {
                        currentCredit -= amt * 0.97;
                    } else if (cardType == "gold") {
                        currentCredit -= amt * 0.99;
                    } else if (cardType == "silver") {
                        currentCredit -= amt * 0.98;
                    }

                    System.out.println("Your transcation was successful.. \n you have made a transit of " + amt);

                } else {
                    System.out.println("Credit Limit Exceeded....");
                }

            }

        } else {
            System.out.println("Your Credit Card is not Enabled..");

        }

    }

}