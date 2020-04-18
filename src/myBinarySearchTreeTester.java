import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
public class myBinarySearchTreeTester {

    //Testing with constructor myBinarySearchTreeNode(int);
    //Testing with insert() with values greater than and lesser than root
    //Test: PASSED
    @Test
    public void test1(){

        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(2);

        tree.insert(-1);
        tree.insert(5);

        assertEquals(2, tree.myValue);
        assertEquals(-1, tree.left.myValue);
        assertEquals(5, tree.right.myValue);
        assertEquals(null, tree.left.right);
        assertEquals(null, tree.right.right);
        assertEquals(null, tree.left.left);
        assertEquals(null, tree.right.left);

    }

    //Testing with constructor myBinarySearchTreeNode(int[])
    //Testing with values greater than and lesser than root
    //Test: PASSED
    @Test
    public void test2(){

        int[] arr = new int[]{2, -1, 5};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);


        assertEquals(2, tree.myValue);
        assertEquals(-1, tree.left.myValue);
        assertEquals(5, tree.right.myValue);
        assertEquals(null, tree.left.right);
        assertEquals(null, tree.right.right);
        assertEquals(null, tree.left.left);
        assertEquals(null, tree.right.left);

    }

    //Testing height()
    //Testing with tree with branches of different sizes
    //Test: PASSED
    @Test
    public void test4(){

        int[] arr = new int[]{2, 0, 5, 1, 6, 3, 4};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);

        assertEquals(4, tree.height());

    }

    //Testing depth()
    //Testing with tree with branches of different sizes
    //Test: PASSED
    @Test
    public void test5(){

        int[] arr = new int[]{2, 0, 5, 1, 6, 3, 4};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);

        assertEquals(3, tree.depth(4));

    }
}
