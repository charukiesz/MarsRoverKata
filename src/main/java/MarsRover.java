

public class MarsRover {
    //Constructor
    public MarsRover(String initialPosition, Plateau plateau) {
        String[] position = initialPosition.split(" ");
        this.roverPosition = new PlateauPosition(
                Integer.parseInt(position[0]),
                Integer.parseInt(position[1]),
                position[2].toCharArray()[0]);
        this.plateau = plateau;
    }

    //Attributes
    private PlateauPosition roverPosition;
    private Plateau plateau;


    //Methods
//Parse instructions to navigate the Mars Rover
    public PlateauPosition ParseInstructions(String instructions) {
        char[] arrInstructions = instructions.toUpperCase().toCharArray();
        try {
            if (roverPosition.isCompassValid() == false)
            {
                throw new RuntimeException("Not a valid compass direction.");
            }
            for (int i = 0; i < arrInstructions.length; i++) {
                if (arrInstructions[i] == 'L') {
                    LeftTurn(roverPosition.compass);
                } else if (arrInstructions[i] == 'R') {
                    RightTurn(roverPosition.compass);
                } else if (arrInstructions[i] == 'M') {
                    moveForward(roverPosition.compass);
                } else {
                    // do nothing
                }
            }
        }catch(Exception exception) {
            roverPosition.setErrorMessage(exception.getMessage());
        }
        return roverPosition;
    }


    private void moveForward(char compass) {
        boolean isInRange = true;
        switch (compass) {
            case 'N':
                if (this.roverPosition.y + 1 > plateau.getYDimension()) {
                    isInRange = false;
                } else {
                    this.roverPosition.y++;
                }
                break;
            case 'E':
                if (this.roverPosition.x + 1 > plateau.getXDimension()) {
                    isInRange = false;
                } else {
                    this.roverPosition.x++;
                }
                break;
            case 'S':
                if (this.roverPosition.y - 1 < 0) {
                    isInRange = false;
                } else {
                    this.roverPosition.y--;
                }
                break;
            case 'W':
                if (this.roverPosition.x - 1 < 0) {
                    isInRange = false;
                } else {
                    this.roverPosition.x--;
                }
                break;
            default:
        }
        if (isInRange == false) {
            throw new RuntimeException("Out of range. Try again.");
        }
    }


//Turn left
    private void LeftTurn(char compass) {

        switch (compass) {
            case 'N':
                this.roverPosition.compass = 'W';
                break;
            case 'W':
                this.roverPosition.compass = 'S';
                break;
            case 'S':
                this.roverPosition.compass = 'E';
                break;
            case 'E':
                this.roverPosition.compass = 'N';
                break;
            default:
        }
    }


//Turn right
    private void RightTurn(char compass){

            switch (compass) {
                case 'N':
                    this.roverPosition.compass = 'E';
                    break;
                case 'E':
                    this.roverPosition.compass = 'S';
                    break;
                case 'S':
                    this.roverPosition.compass = 'W';
                    break;
                case 'W':
                    this.roverPosition.compass = 'N';
                    break;
                default:
            }
        }

}
