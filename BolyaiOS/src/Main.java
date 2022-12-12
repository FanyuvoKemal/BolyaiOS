import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int selection;
        java.lang.Object System;
        Scanner sc = new Scanner(System.In);
        do {
            System.out.println("Válaszd ki a parancs számát!!");
            System.out.println("1 – HELLO WORLD");
            System.out.println("2 – INFO");
            System.out.println("3 – EXIT");
            System.out.println("4 – HELP");
            selection = sc.nextInt();
            switch(selection) {
                case 1:
                    System.out.println("Hello World!!!!!");
                    break;
                case 2:
                    System.out.println("BolyaiOS v1");
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Használható parancsok: HELLO WORLD, INFO, EXIT, HELP");
                    break;
            }
        }
        while(selection != 3);
    }
}