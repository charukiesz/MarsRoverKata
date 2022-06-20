package com.techreturners;

public class Plateau {

    //Attributes
    private final int X_DIMENSION;
    private final int Y_DIMENSION;


    //Constructor
    public Plateau(int X_DIMENSION, int Y_DIMENSION) {
        this.X_DIMENSION = X_DIMENSION;
        this.Y_DIMENSION = Y_DIMENSION;
    }

    public Plateau(String dimensions) {
        String[] xypoints = dimensions.split(" ");
        this.X_DIMENSION = Integer.parseInt(xypoints[0]);
        this.Y_DIMENSION = Integer.parseInt(xypoints[1]);
    }


    //Getters
    public int getXDimension() {
        return X_DIMENSION;
    }

    public int getYDimension() {
        return Y_DIMENSION;
    }

    public String getDimensions() {
        if (X_DIMENSION > 0 && Y_DIMENSION > 0) {
            return String.format("The plateau dimensions are %d squares in the x direction and %d squares in the y direction.", X_DIMENSION, Y_DIMENSION);
        } else
            return "Values not recognised. Please enter the Plateau dimensions as positive numbers, of the form x y.";
    }

}
