# Mars Rover Kata: Initial Ideas

## Console Application.

## User Perspective:

1 -The user will enter the dimensions of the Plateau.
		The Plateau object will be instantiated with the xDimension and yDimension attribute.
		Questions: In trying to visualise what this should look like. 
					a)Should there be a grid representation in memory, so that further on checks can be made 
						to ensure that the Rover does not move over the edge of the Plateau in either the X or Y directions? 
					b)What in Java would provide this representation?
2 -The User will enter the cardinal co-ordinates for the starting point of the Rover.
		The Rover object will be instantiated with xPosition  and yPosition attributes.
3 -The User will enter a string of instructions providing the sequence of movements the Rover will make.
		The Rover object will move according to the sequence of instructions and finish at an xPosition and yPosition on the Plateau.
4 -The final position of the Rover will be printed to screen as a string to the user.
		
			
## UML Perspective:

The following classes will be needed:  

1)Plateau class
2)Rover class
3)Enumeration for North, South, East and West.
4)Enumeration for L (Left Rotation), R (Right Rotation) and M (Move forward one grid point).
5)Position class to handle the x and y positions on the Plateau.

## UML:Dependencies, Associations and Relationships:

1) The Plateau has to exist before a Rover can exist so there is a one to one relationship between Rover class and Plateau.
2) Rover cannot exist without a Plateau.




## Discussion Points:

1) Initially thought about having an Abstract Vehicle class implementing a Navigation Interface. 
	Rover class would extend Vehicle class. 
2) Or a Navigation interface which the Rover class will implement.
3) Decided on using concrete classes for now to get the application up and running with one Rover 
	and then think about how these layers of abstraction can then be implemented.
3) How to handle the Rover's orientation with respect to it's current orientation.
	* Have a method that changes the value of the Rover's orientation between N, W, S, E depending on the command (L or R) that the user enters.
