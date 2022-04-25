import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlateauTest {


    @Test
    public void checkUserCanCreateAPlateauSizeFiveByFive(){
    //Arrange
        Plateau plateau = new Plateau(5, 5);
        String expectedResult = "The plateau dimensions are 5 squares in the x direction and 5 squares in the y direction.";
    //Act
        String actual = plateau.getDimensions();
    //Assert
        Assertions.assertEquals(expectedResult, actual);

    }


    @Test
    public void checkUserCanNotCreatePlateauOfZeroSize(){
        //Arrange
        Plateau plateau = new Plateau(0, 0);
        String expectedResult = "Values not recognised. Please enter the Plateau dimensions as positive numbers, of the form x y.";
        //Act
        String actual = plateau.getDimensions();
        //Assert
        Assertions.assertEquals(expectedResult, actual);
    }


    //Check marsRover can land on plateau
    //check marsRover cannot land on a grid point beyond Y dimension - edge case
    //check marsRover cannot land on a grid point beyond X dimension - edge case
    //check marsRover cannot land on a grid point beyond X dimension - edge case
    //check marsRover cannot land on a grid point beyond each of the four corners of the plateau

}
