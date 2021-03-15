package day13;

import java.util.Scanner;

//This is an example of Runtime Polymorphism (dynamic binding) - can be achieved by overriding of Methods
public class AccountTeast {

    public static void main(String[] args) {
        PolymorphismInterface account = null;
        System.out.println("Enter choice:");
        String choice = new Scanner(System.in).next();
        switch (choice){
            case "saving":
                account = new PolyImplementInterfaceSaving();
                break;
            case "current":
                account = new currentAccount();
                break;
            default:
                System.out.println("Wrong choice...");
        }

        if (account!=null){
            account.openAccount();
        }
    }
}
