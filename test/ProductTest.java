import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import product.TechnologyProducts;

class ProductTest {

    @Test
    void calculateProfit_verifyCorrectionValue() {
        TechnologyProducts p = new TechnologyProducts("sddsd", 300.0, 400.0, "sdf", "fdsdf");
        Assertions.assertEquals(100.0, p.calculateProfit());
    }

    @Test
    void convenientProduct_isTrue() {
        TechnologyProducts p = new TechnologyProducts("sddsd", 300.0, 400.0, "sdf", "fdsdf");
        Assertions.assertEquals(true, p.convenientProduct());
    }
    @Test
    void convenientProduct_isFalse() {
        TechnologyProducts p = new TechnologyProducts("sddsd", 400.0, 300.0, "sdf", "fdsdf");
        Assertions.assertEquals(false, p.convenientProduct());
    }
    @Test
    void descriptionMaximum_isCorrect(){
        TechnologyProducts p = new TechnologyProducts("sddsd", 400.0, 300.0, "sdf", "fdsdf");
        Assertions.assertEquals("OK",p.descriptionMaximum());
    }
    @Test
    void descriptionMaximum_isIncorrect(){
        TechnologyProducts p = new TechnologyProducts("sddfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffsd",
                400.0, 300.0, "sdf", "fdsdf");
        Assertions.assertEquals("Error",p.descriptionMaximum());
    }
}