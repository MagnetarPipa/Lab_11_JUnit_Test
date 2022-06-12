import com.company.lab_10_javafx.RightTriangle;
import com.company.lab_10_javafx.Triangle;
import com.company.lab_10_javafx.Triangles_List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {


    @Test
    void isTriangleCoordinatesExists() {
        Triangle triangle_right = new Triangle(15, -5, 15, 14, 14, 2);
        Triangle zero_cord_triangle = new Triangle(0, 0, 0, 0, 0, 0);

        assertNotEquals(zero_cord_triangle,triangle_right);
        //assertEquals(not_triangle,triangle_right);
    }

    @Test
    void isTriangleCreated() {

        final int M = 5;
        final int MAX_SIDE_LENGTH = 25;
        int X1, X2, X3;
        int Y1, Y2, Y3;

        Triangles_List test_right_TrianglesList = new Triangles_List();
        Triangles_List empty_right_TrianglesList = new Triangles_List();

        for (int i = 0; i < M; i++) {
            while (!RightTriangle.isTriangleRight(X1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, X3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y1 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y2 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5, Y3 = (int) (Math.random() * MAX_SIDE_LENGTH) - 5)) {
            }
            test_right_TrianglesList.add(new RightTriangle(X1, X2, X3, Y1, Y2, Y3));//Чтобы объект не пересоздавать,называется анонимный объект

        }

        assertNotEquals(empty_right_TrianglesList,test_right_TrianglesList);
        //assertEquals(empty_right_TrianglesList,test_right_TrianglesList);

    }

    @Test
    void isAngleRight() {

        Triangle triangle_right = new Triangle(15, -5, 15, 14, 14, 2);
        assertEquals(90,triangle_right.getAngle_3(),0.1);
    }

    @Test
    void identicalTriangle() {

        Triangle triangle1 = new Triangle(0, 0, 0, 6, 4, 1);
        Triangle triangle2 = new Triangle(0, 0, 0, 6, 4, 1);
        Triangle triangle3 = new Triangle(0, 0, 0, 6, 4, 1);

        assertEquals(0,triangle1.getX1());
        assertEquals(0,triangle2.getX1());
        assertEquals(0,triangle3.getX1());
        assertEquals(0,triangle1.getX2());
        assertEquals(0,triangle2.getX2());
        assertEquals(0,triangle3.getX2());
        assertEquals(0,triangle1.getX3());
        assertEquals(0,triangle2.getX3());
        assertEquals(0,triangle3.getX3());

        assertEquals(6,triangle1.getY1());
        assertEquals(6,triangle2.getY1());
        assertEquals(6,triangle3.getY1());
        assertEquals(4,triangle1.getY2());
        assertEquals(4,triangle2.getY2());
        assertEquals(4,triangle3.getY2());
        assertEquals(1,triangle1.getY3());
        assertEquals(1,triangle2.getY3());
        assertEquals(1,triangle3.getY3());
    }

    @org.junit.jupiter.api.Test
    void getX1() {
    }

    @org.junit.jupiter.api.Test
    void setX1() {
    }

    @org.junit.jupiter.api.Test
    void getX2() {
    }

    @org.junit.jupiter.api.Test
    void setX2() {
    }

    @org.junit.jupiter.api.Test
    void getX3() {
    }

    @org.junit.jupiter.api.Test
    void setX3() {
    }

    @org.junit.jupiter.api.Test
    void getY1() {
    }

    @org.junit.jupiter.api.Test
    void setY1() {
    }

    @org.junit.jupiter.api.Test
    void getY2() {
    }

    @org.junit.jupiter.api.Test
    void setY2() {
    }

    @org.junit.jupiter.api.Test
    void getY3() {
    }

    @org.junit.jupiter.api.Test
    void setY3() {
    }

    @org.junit.jupiter.api.Test
    void getLengthA() {

        Triangle triangle_right = new Triangle(15, -5, 15, 14, 14, 2);
        double lengthAMinus = triangle_right.getLengthA()*-1;
        assertNotEquals(lengthAMinus,triangle_right.getLengthA());
    }

    @org.junit.jupiter.api.Test
    void getLengthB() {
        
        Triangle triangle_right = new Triangle(15, -5, 15, 14, 14, 2);
        double lengthBMinus = triangle_right.getLengthB()*-1;
        assertNotEquals(lengthBMinus,triangle_right.getLengthB());
        
    }

    @org.junit.jupiter.api.Test
    void getLengthC() {
        
        Triangle triangle_right = new Triangle(15, -5, 15, 14, 14, 2);
        double lengthCMinus = triangle_right.getLengthC()*-1;
        assertNotEquals(lengthCMinus,triangle_right.getLengthC());
        
    }
    
    @org.junit.jupiter.api.Test
    void setPerimeter() {
    }

    @org.junit.jupiter.api.Test
    void setSquare() {



    }

    @org.junit.jupiter.api.Test
    void getPerimeter() {

        Triangle triangle_right = new Triangle(15, -5, 15, 14, 14, 2);
        double perimeterMinus = triangle_right.getPerimeter()*-1;
        assertNotEquals(perimeterMinus,triangle_right.getPerimeter());
        //assertEquals(perimeterMinus,triangle_right.getPerimeter());
    }

    @org.junit.jupiter.api.Test
    void getSquare() {
        Triangle triangle_right = new Triangle(15, -5, 15, 14, 14, 2);
        double squareMinus = triangle_right.getSquare()*-1;
        assertNotEquals(squareMinus,triangle_right.getSquare());
        //assertEquals(squareMinus,triangle_right.getSquare());
    }




}