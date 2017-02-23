/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author birss0828
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  // Create city called kitchener

        City kitchener = new City();


        //Create a Robot

        Robot romo = new Robot(kitchener, 4, 0, Direction.EAST);

        //Create Walls

        new Wall(kitchener, 4, 2, Direction.WEST);
        new Wall(kitchener, 4, 2, Direction.NORTH);
        new Wall(kitchener, 3, 3, Direction.WEST);
        new Wall(kitchener, 3, 3, Direction.NORTH);
        new Wall(kitchener, 2, 4, Direction.WEST);
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener, 2, 5, Direction.NORTH);
        new Wall(kitchener, 2, 5, Direction.EAST);
        new Wall(kitchener, 3, 6, Direction.NORTH);
        new Wall(kitchener, 3, 6, Direction.EAST);
        new Wall(kitchener, 4, 7, Direction.NORTH);
        new Wall(kitchener, 4, 7, Direction.EAST);

        //CREATE LIGHTBULBS (THINGS)

        new Thing(kitchener, 4, 1);
        new Thing(kitchener, 3, 2);
        new Thing(kitchener, 2, 3);
        new Thing(kitchener, 1, 4);

        //move the robot and pick things and place them on the other side

        romo.move();
        romo.turnLeft();
        romo.pickThing();
        romo.move();
        romo.turnLeft();
        romo.turnLeft();
        romo.turnLeft();
        romo.move();
        romo.pickThing();
        romo.turnLeft();
        romo.move();
        romo.turnLeft();
        romo.turnLeft();
        romo.turnLeft();
        romo.move();
        romo.pickThing();
        romo.turnLeft();
        romo.move();
        romo.turnLeft();
        romo.turnLeft();
        romo.turnLeft();
        romo.move();
        romo.pickThing();
        romo.move();
        romo.putThing();
        romo.move();
        romo.turnLeft();
        romo.turnLeft();
        romo.turnLeft();
        romo.move();
        romo.putThing();
        romo.turnLeft();
        romo.move();
        romo.turnLeft();
        romo.turnLeft();
        romo.turnLeft();
        romo.move();
        romo.putThing();
        romo.turnLeft();
        romo.move();
        romo.turnLeft();
        romo.turnLeft();
        romo.turnLeft();
        romo.move();
        romo.putThing();
        romo.turnLeft();
        romo.move();

























    }
}
