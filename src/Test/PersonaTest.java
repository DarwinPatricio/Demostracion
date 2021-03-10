package Test;

import Clases.Persona;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    public static void main(String[] args) {
    }

    private Persona p=new Persona();
    @BeforeEach
    public void  setUp() {
        Persona p= new Persona();
        System.out.println("@BeforeEach -> setUp()");
    }
    @Test
        public void CompruebaPeso(){
        assertEquals(0, p.pesoIdeal(-1,1.75));
        assertEquals(0, p.pesoIdeal(84,-5));
        assertEquals(1, p.pesoIdeal(62,1.90));//Debajo del peso
        assertEquals(2, p.pesoIdeal(50,1.50));//Peso ideal
        assertEquals(3, p.pesoIdeal(95,1.60));//Sobrepeso
    }
    @Test
    public  void add_asset_All_test(){
        assertAll(
                ()->assertEquals(0, p.pesoIdeal(-1,1.75)),
                ()->assertEquals(0, p.pesoIdeal(84,-5)),
                ()->assertEquals(1, p.pesoIdeal(62,1.90)),
                ()->assertEquals(2, p.pesoIdeal(50,1.50)),
                ()->assertEquals(3, p.pesoIdeal(95,1.60))
        );
    }
    @Nested
    class pesoIdeal{
        @BeforeEach
        public void  setUp() {
            Persona p= new Persona();
            System.out.println("@BeforeEach -> setUp()");
        }
        @Test
        public void CompruebaPeso(){
            assertEquals(0, p.pesoIdeal(-1,1.75));
            assertEquals(0, p.pesoIdeal(84,-5));
            assertEquals(1, p.pesoIdeal(62,1.90));//Debajo del peso
            assertEquals(2, p.pesoIdeal(50,1.50));//Peso ideal
            assertEquals(3, p.pesoIdeal(95,1.60));//Sobrepeso
        }
        @Test
        public  void add_asset_All_test(){
            assertAll(
                    ()->assertEquals(0, p.pesoIdeal(-1,1.75)),
                    ()->assertEquals(0, p.pesoIdeal(84,-5)),
                    ()->assertEquals(1, p.pesoIdeal(62,1.90)),
                    ()->assertEquals(2, p.pesoIdeal(50,1.50)),
                    ()->assertEquals(3, p.pesoIdeal(95,1.60))
            );
        }
    }
    @ParameterizedTest
    public void pesoParametrizado(float salida, double peso,double altura){
        assertEquals(salida,p.pesoIdeal(peso,altura));
    }
}