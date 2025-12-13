import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int continueOuterLoop = 1;
        int continueInnerLoop;
        int menuChoice;

        Tiger tiger = new Tiger();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("Selected: " + tiger.getNameOfAnimal());
                        menuChoice = animalDetailsMenu(keyboard, tiger);
                        handleTigerMenu(keyboard, tiger, menuChoice);
                        System.out.println("Continue with this animal? (1-Yes / 2-No):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 2:
                    do {
                        System.out.println("Selected: " + dolphin.getNameOfAnimal());
                        menuChoice = animalDetailsMenu(keyboard, dolphin);
                        handleDolphinMenu(keyboard, dolphin, menuChoice);
                        System.out.println("Continue with this animal? (1-Yes / 2-No):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 3:
                    do {
                        System.out.println("Selected: " + penguin.getNameOfAnimal());
                        menuChoice = animalDetailsMenu(keyboard, penguin);
                        handlePenguinMenu(keyboard, penguin, menuChoice);
                        System.out.println("Continue with this animal? (1-Yes / 2-No):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                case 4:
                    writeObjectsToFile(tiger, penguin, dolphin);
                    break;

                case 5:
                    readObjectsFromFile();
                    break;

                default:
                    System.out.println("Invalid option!");
            }

            System.out.println("Continue main menu? (1-Yes / 2-No):");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

    // --- Menu helpers ---
    static int animalChoiceMenu(Scanner keyboard) {
        System.out.println("1. Tiger\n2. Dolphin\n3. Penguin\n4. Save animals\n5. Load animals\nEnter choice:");
        return keyboard.nextInt();
    }

    private static int animalDetailsMenu(Scanner keyboard, Animal animal) {
        System.out.println("1. Set properties\n2. Show properties\n3. Move\n4. Eat\nEnter choice:");
        return keyboard.nextInt();
    }

    private static void handleTigerMenu(Scanner keyboard, Tiger tiger, int choice) {
        switch (choice) {
            case 1:
                System.out.println("Number of stripes:");
                tiger.setNumberOfStripes(keyboard.nextInt());
                System.out.println("Speed:");
                tiger.setSpeed(keyboard.nextInt());
                System.out.println("Sound level:");
                tiger.setSoundLevel(keyboard.nextInt());
                break;
            case 2:
                System.out.println(tiger);
                break;
            case 3: tiger.walking(); break;
            case 4: tiger.eatingFood(); tiger.eatingCompleted(); break;
            default: System.out.println("Invalid"); break;
        }
    }

    private static void handleDolphinMenu(Scanner keyboard, Dolphin dolphin, int choice) {
        switch (choice) {
            case 1:
                keyboard.nextLine();
                System.out.println("Color:");
                dolphin.setColor(keyboard.nextLine());
                System.out.println("Swimming speed:");
                dolphin.setSwimmingSpeed(keyboard.nextInt());
                break;
            case 2:
                System.out.println(dolphin);
                break;
            case 3: dolphin.swimming(); break;
            case 4: dolphin.eatingFood(); dolphin.eatingCompleted(); break;
            default: System.out.println("Invalid"); break;
        }
    }

    private static void handlePenguinMenu(Scanner keyboard, Penguin penguin, int choice) {
        switch (choice) {
            case 1:
                System.out.println("Is swimming (true/false):");
                penguin.setSwimming(keyboard.nextBoolean());
                System.out.println("Walk speed:");
                penguin.setWalkSpeed(keyboard.nextInt());
                System.out.println("Swim speed:");
                penguin.setSwimSpeed(keyboard.nextInt());
                break;
            case 2:
                System.out.println(penguin);
                break;
            case 3:
                if (penguin.isSwimming()) penguin.swimming();
                else penguin.walking();
                break;
            case 4: penguin.eatingFood(); penguin.eatingCompleted(); break;
            default: System.out.println("Invalid"); break;
        }
    }

    // --- File operations ---
    public static void writeObjectsToFile(Tiger tiger, Penguin penguin, Dolphin dolphin) {
        try {
            ObjectOutputStream tigerOut = new ObjectOutputStream(new FileOutputStream("tiger.txt"));
            tigerOut.writeObject(tiger);
            tigerOut.close();

            ObjectOutputStream penguinOut = new ObjectOutputStream(new FileOutputStream("penguin.txt"));
            penguinOut.writeObject(penguin);
            penguinOut.close();

            ObjectOutputStream dolphinOut = new ObjectOutputStream(new FileOutputStream("dolphin.txt"));
            dolphinOut.writeObject(dolphin);
            dolphinOut.close();

            System.out.println("Animals saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving: " + e.getMessage());
        }
    }

    public static void readObjectsFromFile() {
        try {
            ObjectInputStream tigerIn = new ObjectInputStream(new FileInputStream("tiger.txt"));
            Tiger tiger = (Tiger) tigerIn.readObject();
            tigerIn.close();

            ObjectInputStream penguinIn = new ObjectInputStream(new FileInputStream("penguin.txt"));
            Penguin penguin = (Penguin) penguinIn.readObject();
            penguinIn.close();

            ObjectInputStream dolphinIn = new ObjectInputStream(new FileInputStream("dolphin.txt"));
            Dolphin dolphin = (Dolphin) dolphinIn.readObject();
            dolphinIn.close();

            System.out.println("--- Animals loaded ---");
            System.out.println(tiger);
            System.out.println(penguin);
            System.out.println(dolphin);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading: " + e.getMessage());
        }
    }
}
