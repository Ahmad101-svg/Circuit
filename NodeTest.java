package coe318.lab7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Node.
 */
public class NodeTest {

    @BeforeEach
    public void setUp() {
        // Reset static field before each test
        Node.node_number = 0;
    }

    @AfterEach
    public void tearDown() {
        // Reset static field after each test for safety
        Node.node_number = 0;
    }

    /**
     * Test of nodeId initialization in Node.
     */
    @Test
    public void test_Node_IdInitialization() {
        System.out.println("test Node IdInitialization");
        Node n1 = new Node();
        Node n2 = new Node();
        assertEquals(0, n1.nodeId, "Node ID of first node should be 0");
        assertEquals(1, n2.nodeId, "Node ID of second node should be 1");
    }

    /**
     * Test of custom nodeId initialization in Node(int node).
     */
    @Test
    public void testCustom_Node_IdInitialization() {
        System.out.println("test Custom Node IdInitialization");
        Node n = new Node(42);
        assertEquals(42, n.nodeId, "Node ID should be initialized to the provided value (42)");
    }

    /**
     * Test of toString method.
     */
    @Test
    public void testToString() {
        System.out.println("testToString");
        Node n = new Node();
        assertEquals("0", n.toString(), "toString should return the node ID as a string");
    }
}
