import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    void classifyTriangle1() {
        triangle.classifyTriangle(0, 1, 3);
    }

    @Test
    void classifyTriangle2() {
        triangle.classifyTriangle(3, 4, 5);
    }

    @Test
    void classifyTriangle3() {
        triangle.classifyTriangle(-1, 0, 2);
    }

    @Test
    void classifyTriangle4() {
        triangle.classifyTriangle(6, 7, 8);
    }

    @Test
    void classifyTriangle5() {
        triangle.classifyTriangle(4, 6, 9);
    }

}