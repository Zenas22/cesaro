import org.junit.Test;
import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void runEncrypt() {
        Encrypt ifInputIsString = new Encrypt();
        assertEquals("def" , ifInputIsString.encrypt("abc", 3));
        assertEquals("Lgozn Sazkzk" , ifInputIsString.encrypt("Faith Mutete", 6));
        assertEquals("prulqjd vfkrro" , ifInputIsString.encrypt("moringa school", 3));
        //
        assertEquals("ODCB EURZQ IRA MXPSV RYHU D ODCB GRJ" , ifInputIsString.encrypt("LAZY BROWN FOX JUMPS OVER A LAZY DOG", 3));
    }
}