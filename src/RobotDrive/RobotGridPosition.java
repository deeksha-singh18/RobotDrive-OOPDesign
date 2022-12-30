package RobotDrive;

public class RobotGridPosition {
    private int row;
    private int col;

    private String robotDirection;


    public RobotGridPosition(int row, int col, String robotDirection) {
        this.row = row;
        this.col = col;
        this.robotDirection = robotDirection;
    }

    public String getRobotDirection() {
        return robotDirection;
    }

    public void setRobotDirection(String robotDirection) {
        this.robotDirection = robotDirection;
    }

    public int getRow() {

        return row;
    }

    public void setRow(int row) {

        this.row = row;
    }

    public int getCol() {

        return col;
    }

    public void setCol(int col) {

        this.col = col;
    }

}

