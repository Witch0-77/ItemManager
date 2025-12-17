package shoppingList;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ItemManagerImlpTest {
    ItemManagerImlp itemManagerImlp = new ItemManagerImlp();

    @BeforeEach
    void setUp() {
        itemManagerImlp = new ItemManagerImlp();
    }
    @AfterEach
    void tearDown() {
        itemManagerImlp = null;
    }
    @Test
    void addItem(){
        String testProd = itemManagerImlp.addItem("testName", 1, "testCat", false);
        assertTrue(itemManagerImlp.products.containsKey(testProd));
    }
    @Test
    void getItem(){
        String testProdId = itemManagerImlp.addItem("testName", 1, "testCat", false);
        assertTrue(itemManagerImlp.products.containsKey(testProdId));
    }
    @Test
    void removeItem(){
        String testProdId = itemManagerImlp.addItem("testName", 1, "testCat", false);
        assertTrue(itemManagerImlp.products.containsKey(testProdId));
        itemManagerImlp.removeItem(testProdId);
        assertFalse(itemManagerImlp.products.containsKey(testProdId));
    }
    @Test
    void markAsPurchased() {
        String testProdId = itemManagerImlp.addItem("testName", 1, "testCat", false);
        assertTrue(itemManagerImlp.products.containsKey(testProdId));
        itemManagerImlp.markAsPurchased(testProdId);
        assertTrue(itemManagerImlp.products.get(testProdId).purchased);
    }
}