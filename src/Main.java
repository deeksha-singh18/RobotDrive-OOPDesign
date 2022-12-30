import RobotDrive.RobotArcadeDrive;
import RobotDrive.RobotGridPosition;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the position of the robot on the grid, coordinates not less than 0 : ");
        System.out.println("Row : ");
        int rows = scanner.nextInt();
        System.out.println("Column : ");
        int cols = scanner.nextInt();
        System.out.println("Enter the direction for robot orientation : ");
        String directions = scanner.next();



        RobotGridPosition robotGridPosition =new RobotGridPosition(rows,cols,directions);


        RobotArcadeDrive robot = new RobotArcadeDrive(robotGridPosition);
        System.out.println("Starting position" + " " +  "=>" + " " +  "(" + "0" + "," + "0" + ")" + " "+ "E");

        System.out.println("These below are the outputs :-");





        try {
            File myObj = new File("C:\\Users\\deeksha.singh\\Documents\\InputFile.txt");
            Scanner sc = new Scanner(myObj);

            while (sc.hasNextLine()) {

                String data = sc.nextLine();

                if (data.equals("F")) {
                    robot.moveForward(data);
                }
                else if (data.equals("B")) {
                    robot.moveBackward(data);
                }
                else if (data.equals("L")) {
                    robot.moveLeft(data);
                }
                else if (data.equals("R")) {
                    robot.moveRight(data);
                }
                else{
                    System.out.println("Invalid command to rotate the robot");
                }
            }

            sc.close();

        }




        catch (FileNotFoundException e) {
            System.out.println("An error occurred");

        }



    }
}