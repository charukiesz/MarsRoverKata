public class Plateau {
//Constructor
    public Plateau (int xDimension, int yDimension){
        this.xDimension = xDimension;
        this.yDimension = yDimension;
    }

    public Plateau (String dimensions){
        String [] xypoints = dimensions.split(" ");
        this.xDimension =  Integer.parseInt(xypoints[0]);
        this.yDimension = Integer.parseInt(xypoints[1]);
    }
//Attributes
    private int xDimension;
    private int yDimension;


//Getters
    public int getXDimension(){
        return xDimension;
    }

    public int getYDimension(){
        return yDimension;
    }

    public String getDimensions() {
        if (xDimension > 0 && yDimension > 0) {
            String plateauDimensions = String.format("The plateau dimensions are %d squares in the x direction and %d squares in the y direction.", xDimension, yDimension);
            return plateauDimensions;
        } else
            return "Values not recognised. Please enter the Plateau dimensions as positive numbers, of the form x y.";
    }

}
