package RobotDrive;

public class RobotArcadeDrive {
    RobotGridPosition robotPosition;




    public RobotArcadeDrive(RobotGridPosition robotPosition) {
        this.robotPosition = robotPosition;
    }




    public void moveForward(String data) {

        String robotDirection = robotPosition.getRobotDirection();


        if(unableRobotMove(data)){
            return;
        }

        else {

            if (robotDirection.equals("E")) {

                robotPosition.setCol(robotPosition.getCol() + 1);

            } else if (robotDirection.equals("W")) {

                robotPosition.setCol(robotPosition.getCol() - 1);

            } else if (robotDirection.equals("N")) {

                robotPosition.setRow(robotPosition.getCol() - 1);

            } else if (robotDirection.equals("S")) {
                robotPosition.setRow(robotPosition.getRow() + 1);

            }

            System.out.println("F : (" + robotPosition.getRow() + "," + robotPosition.getCol() + ")" + " " +
                    robotDirection);
        }

    }









    public void moveBackward(String data) {

        String robotDirection = robotPosition.getRobotDirection();

        if(unableRobotMove(data)){
            return;
        }

         else {

            if (robotDirection.equals("E")) {

                robotPosition.setCol(robotPosition.getCol() - 1);
            }

            else if (robotDirection.equals("W")) {

                robotPosition.setCol(robotPosition.getCol() + 1);
            }

            else if (robotDirection.equals("N")) {

                robotPosition.setRow(robotPosition.getRow() + 1);
            }

            else if (robotDirection.equals("S")) {
                robotPosition.setRow(robotPosition.getRow() - 1);
            }

            System.out.println("B : (" + robotPosition.getRow() + "," + robotPosition.getCol() + ")" + " " +
                    robotDirection);
        }


    }






    public void moveLeft(String data) {

        String robotDirection = robotPosition.getRobotDirection();

        if (unableRobotMove(data)) {
              return;

        } else {

            if (robotDirection.equals("E")) {

                robotPosition.setRow(robotPosition.getRow() - 1);
                robotPosition.setCol(robotPosition.getCol() + 1);

                leftRotation(robotDirection);


            } else if (robotDirection.equals("W")) {

                robotPosition.setRow(robotPosition.getRow() + 1);
                robotPosition.setCol(robotPosition.getCol() - 1);

                leftRotation(robotDirection);



            } else if (robotDirection.equals("N")) {

                robotPosition.setCol(robotPosition.getCol() - 1);
                robotPosition.setRow(robotPosition.getRow() - 1);

                leftRotation(robotDirection);




            } else if (robotDirection.equals("S")) {

                robotPosition.setCol(robotPosition.getCol() + 1);
                robotPosition.setRow(robotPosition.getRow() + 1);

               leftRotation(robotDirection);

            }




        System.out.println("L : (" + robotPosition.getRow() + "," + robotPosition.getCol() + ")" + " " +
                robotPosition.getRobotDirection());
    }

    }









    public void moveRight(String data) {

        String robotDirection = robotPosition.getRobotDirection();

        if(unableRobotMove(data)){
            return;
        }


        else {

            if (robotDirection.equals("E")) {

                robotPosition.setRow(robotPosition.getRow() + 1);
                robotPosition.setCol(robotPosition.getCol() + 1);

                rightRotation(robotDirection);



            } else if (robotDirection.equals("W")) {

                robotPosition.setRow(robotPosition.getRow() - 1);
                robotPosition.setCol(robotPosition.getCol() - 1);

                rightRotation(robotDirection);


            } else if (robotDirection.equals("N")) {

                robotPosition.setCol(robotPosition.getCol() + 1);
                robotPosition.setRow(robotPosition.getRow() - 1);

                rightRotation(robotDirection);


            } else if (robotDirection.equals("S")) {

                robotPosition.setCol(robotPosition.getCol() - 1);
                robotPosition.setRow(robotPosition.getRow() + 1);

                rightRotation(robotDirection);

            }


            System.out.println("R : (" + robotPosition.getRow() + "," + robotPosition.getCol() + ")" + " " +
                    robotPosition.getRobotDirection());

        }

    }




    public void leftRotation(String robotDirection){

        if(robotDirection.equals("E")){

            robotPosition.setRobotDirection("N");
        }

        else if(robotDirection.equals("W")){
            robotPosition.setRobotDirection("S");

        }

        else if(robotDirection.equals("N")){
            robotPosition.setRobotDirection("E");

        }

        else if(robotDirection.equals("S")){
            robotPosition.setRobotDirection("W");

        }


    }



    public void rightRotation(String robotDirection){


        if(robotDirection.equals("E")){

            robotPosition.setRobotDirection("S");
        }

        else if(robotDirection.equals("W")){
            robotPosition.setRobotDirection("N");

        }

        else if(robotDirection.equals("N")){
            robotPosition.setRobotDirection("E");

        }

        else if(robotDirection.equals("S")){
            robotPosition.setRobotDirection("W");

        }

    }








    public boolean unableRobotMove(String data) {

        String robotDirection = robotPosition.getRobotDirection();



        if (data.equals("F") && ((robotDirection.equals("W") && robotPosition.getCol() == 0) ||
                (robotDirection.equals("N") && robotPosition.getRow()==0))) {

            System.out.println("F :  Robot can not move forward because it will be out of the grid. ");
            return true;

        }


        else if (data.equals("B") && ((robotDirection.equals("E") && robotPosition.getCol() == 0) ||
                (robotDirection.equals("S") && robotPosition.getRow()==0))) {

            System.out.println("B : Robot can not move backward because it will be out of the grid. ");
            return true;




        } else if (data.equals("L") && ((robotDirection.equals("E") && robotPosition.getRow() == 0) ||
                (robotDirection.equals("N") && robotPosition.getCol()==0))){

            System.out.println("L : Robot can not move left because it will be out of the grid. ");
            return true;




        } else if (data.equals("R") && ((robotDirection.equals("W") && robotPosition.getRow() == 0) ||
                (robotDirection.equals("S") && robotPosition.getCol()==0))){

            System.out.println("R : Robot can not move right because it will be out of the grid. ");
            return true;
        }




        else if(data.equals("F") && ((robotDirection.equals("E") && robotPosition.getCol()==4) ||
                (robotDirection.equals("S") && robotPosition.getRow()==4))){

            System.out.println("F : Robot can not move forward because it will be out of the grid. ");
            return true;
        }



        else if(data.equals("B") && ((robotDirection.equals("N") && robotPosition.getRow()==4) ||
                (robotDirection.equals("W") && robotPosition.getCol()==4))){

            System.out.println("B : Robot can not move backward because it will be out of the grid. ");
            return true;
        }




        else if(data.equals("L") && ((robotDirection.equals("S") && robotPosition.getCol()==4) ||
                (robotDirection.equals("W") && robotPosition.getRow()==4) ||
                (robotDirection.equals("N") && robotPosition.getRow()==0) ||
                (robotDirection.equals("S") && robotPosition.getRow()==4))){

            System.out.println("L : Robot can not move left because it will be out of the grid. ");
            return true;
        }




        else if(data.equals("R") && ((robotDirection.equals("N") && robotPosition.getCol()==4) ||
                (robotDirection.equals("E") && robotPosition.getRow()==4) ||
                (robotDirection.equals("S") && robotPosition.getRow()==4) ||
                (robotDirection.equals("N") && robotPosition.getRow()==0))) {

            System.out.println("R : Robot can not move right because it will be out of the grid. ");
            return true;
        }


        else if(data.equals("L") && (robotDirection.equals("E") && robotPosition.getCol()==4) ||
                (robotDirection.equals("W") && robotPosition.getCol()==0)){
            System.out.println("L : Robot can not move left because it will be out of the grid.");
            return true;
        }

        else if(data.equals("R") && (robotDirection.equals("E") && robotPosition.getCol()==4) ||
                (robotDirection.equals("W") && robotPosition.getCol()==0)){
            System.out.println("R : Robot can not move right because it will be out of the grid. ");
            return true;
        }


        return false;

    }





}
