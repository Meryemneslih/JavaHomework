package day9;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your sizes ?");

        String size = scanner.nextLine();
        if (size.equals ("S")){
            System.out.println("size is small");
        }
        else if (size.equals("M")){
            System.out.println("size is medium");
        }else if (size.equals ("L")){
            System.out.println("size is large");
        }else if (size.equals("XL")) {
            System.out.println("size is x-large");
        }
        System.out.println("provide your size");
        String sizes = scanner.nextLine();
        switch (sizes) {
            case "S":
                System.out.println("size is small");
                break;
        }
    }
}
