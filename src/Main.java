import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bentuk> shapesList = new ArrayList<>();
        int choice = -1;

        while (choice != 0) {
            System.out.println("\nSHAPE MENU");
            System.out.println("1. SQUARE");
            System.out.println("2. CIRCLE");
            System.out.println("3. CYLINDER");
            System.out.println("4. SHOW ALL SHAPES");
            System.out.println("0. EXIT");
            System.out.println("======================");
            System.out.print("CHOOSE MENU: ");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("INVALID INPUT. PLEASE ENTER A NUMBER.");
                scanner.nextLine();
                continue;
            }

            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("ENTER SIDE  : ");
                    double side = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("ENTER COLOR : ");
                    String squareColor = scanner.nextLine();

                    BujurSangkar square = new BujurSangkar(side, squareColor);
                    shapesList.add(square);

                    System.out.println("\nSQUARE CREATED SUCCESSFULLY.");
                    square.printInfo();
                    break;

                case 2:
                    System.out.print("ENTER RADIUS : ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("ENTER COLOR  : ");
                    String circleColor = scanner.nextLine();

                    Lingkaran circle = new Lingkaran(radius, circleColor);
                    shapesList.add(circle);

                    System.out.println("\nCIRCLE CREATED SUCCESSFULLY.");
                    circle.printInfo();
                    break;

                case 3:
                    System.out.print("ENTER HEIGHT : ");
                    double height = scanner.nextDouble();
                    System.out.print("ENTER RADIUS : ");
                    double cylinderRadius = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("ENTER COLOR : ");
                    String cylinderColor = scanner.nextLine();

                    Silinder cylinder = new Silinder(height, cylinderRadius, cylinderColor);
                    shapesList.add(cylinder);

                    System.out.println("\nCYLINDER CREATED SUCCESSFULLY.");
                    cylinder.printInfo();
                    break;

                case 4:
                    System.out.println("LIST OF SHAPES:");
                    if (shapesList.isEmpty()) {
                        System.out.println("NO SHAPES CREATED YET.");
                    } else {
                        for (int i = 0; i < shapesList.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            shapesList.get(i).printInfo();
                        }
                    }
                    break;

                case 0:
                    System.out.println("EXITING PROGRAM. THANK YOU!");
                    break;

                default:
                    System.out.println("INVALID PLEASE TRY AGAIN.");
                    break;
            }
        }

        scanner.close();
    }
}