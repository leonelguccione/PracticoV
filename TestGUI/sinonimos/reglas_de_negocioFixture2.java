package sinonimos;


public class reglas_de_negocioFixture2 {
    
    reglas_de_negocio rg = new reglas_de_negocio();
    
    public reglas_de_negocioFixture2() {
    }

    public void setUp() {
        rg.getDiccionario().getListaSinonimos().clear();
    }

    public void tearDown() {
        rg.getDiccionario().getListaSinonimos().clear();
    }
}
