public class PlateauPosition {

    public int x;
    public int y;
    public char compass;
    public String currentPosition;
    private String errorMessage ="";

    public PlateauPosition(int x, int y, char compass){
        this.x = x;
        this.y = y;
        this.compass = compass;
    }

//Getters
    public String getPlateauPosition(){
        currentPosition = Integer.toString(this.x) + " " + Integer.toString(this.y) + " " + Character.toString(this.compass);
        return currentPosition;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    //Setters

    public void setErrorMessage(String message){
        errorMessage = message;
    }

    public boolean isCompassValid() {
        boolean isValid = false;
        char[] cardinal = new char[]{'N', 'E', 'S', 'W'};
        for (char c : cardinal) {
            if (compass == c) {
                isValid = true;
            }
        }
        return isValid;
    }
}
