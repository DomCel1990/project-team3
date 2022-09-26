import product.TecnologyProducts;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductTest {

    @Test
    void calculateProfit_verifyCorrectionValue() {
        TecnologyProducts p = new TecnologyProducts("sddsd", 300.0, 400.0, "sdf", "fdsdf");
        Assertions.assertEquals(100.0, p.calculateProfit());
    }

    @Test
    void convenientProduct_isTrue() {
        TecnologyProducts p = new TecnologyProducts("sddsd", 300.0, 400.0, "sdf", "fdsdf");
        Assertions.assertEquals(true, p.convenientProduct());
    }
    @Test
    void convenientProduct_isFalse() {
        TecnologyProducts p = new TecnologyProducts("sddsd", 400.0, 300.0, "sdf", "fdsdf");
        Assertions.assertEquals(false, p.convenientProduct());
    }
    @Test
    void descriptionMaximum_isCorrect(){
        TecnologyProducts p = new TecnologyProducts("sddsd", 400.0, 300.0, "sdf", "fdsdf");
        Assertions.assertEquals("OK",p.descriptionMaximum());
    }
    @Test
    void descriptionMaximum_isIncorrect(){
        TecnologyProducts p = new TecnologyProducts("sddfffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffsd",
                400.0, 300.0, "sdf", "fdsdf");
        Assertions.assertEquals("Error",p.descriptionMaximum());
    }
}