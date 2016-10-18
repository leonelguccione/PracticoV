package sinonimos;

public class reglas_de_negocioFixture1 {
    
    reglas_de_negocio rg = new reglas_de_negocio();
   
    public reglas_de_negocioFixture1() {
    }

    public void setUp() 
    {
        rg.getDiccionario().getListaSinonimos().add(new sinonimo("Casa","vivienda"));
        rg.getDiccionario().getListaSinonimos().add(new sinonimo("Casa","hogar"));
        rg.getDiccionario().getListaSinonimos().add(new sinonimo("perro","can"));
        rg.getDiccionario().getListaSinonimos().add(new sinonimo("calle","rua"));
    }

    public void tearDown() 
    {
        rg.getDiccionario().getListaSinonimos().clear();
    }
}
