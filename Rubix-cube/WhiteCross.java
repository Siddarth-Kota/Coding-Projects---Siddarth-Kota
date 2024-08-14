public class WhiteCross extends Solve{
    
    public static int[][] solveWhiteCross(int[][] arr) {
        OrientFaces(arr);
        return arr;
    }

/*
 *                 |   (0,0)(0,1)(0,2)  |
 *                 |   (1,0)(1,1)(1,2)  |
 *                 |   (2,0)(2,1)(2,2)  |
 * ---------------------------------------------------------
 * (3,0)(3,1)(3,2) |   (6,0)(6,1)(6,2)  |  (9,0)(9,1)(9,2)
 * (4,0)(4,1)(4,2) |   (7,0)(7,1)(7,2)  | (10,0)(10,1)(10,2)
 * (5,0)(5,1)(5,2) |   (8,0)(8,1)(8,2)  | (11,0)(11,1)(11,2)
 * ---------------------------------------------------------
 *                 | (12,0)(12,1)(12,2) |
 *                 | (13,0)(13,1)(13,2) |
 *                 | (14,0)(14,1)(14,2) |
 *                 ----------------------
 *                 | (15,0)(15,1)(15,2) |
 *                 | (16,0)(16,1)(16,2) |
 *                 | (17,0)(17,1)(17,2) |
 * 
 * 1 = white, 2 = yellow, 3 = orange
 * 4 = green, 5 = blue, 6 = red
 */

    //Orients the cube such that the white face is on the top
    public static int[][] OrientFaces(int[][] cube) {
        
        if(cube[1][1] == 1) {
            cube = CubeTurnDown(cube);
            return cube;
        }
        else if(cube[4][1] == 1) {
            cube = CubeTurnRight(cube);
            return cube;
        }
        else if(cube[7][1] == 1) {
            return cube;
        }
        else if(cube[10][1] == 1) {
            cube = CubeTurnLeft(cube);
            return cube;
        }
        else if(cube[13][1] == 1) {
            cube = CubeTurnUp(cube);
            return cube;
        }
        else if(cube[16][1] == 1) {
            cube = CubeTurnUp(cube);
            cube = CubeTurnUp(cube);
            return cube;
        }
        else {
            return cube;
        }
    }
}
