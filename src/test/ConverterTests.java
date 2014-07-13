package test;

import main.RomanConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTests {

    @Test
    public void OneShouldReturnI(){
        int input = 1;
        RomanConverter converter = new RomanConverter();
        String converted = converter.convert(input);
        assertEquals("I", converted);
    }

    @Test
    public void TwoShouldReturnII(){
        int input = 2;
        RomanConverter converter = new RomanConverter();
        String converted = converter.convert(input);
        assertEquals("II", converted);
    }

    @Test
    public void FourShouldReturnIV(){
        int input = 4;
        RomanConverter converter = new RomanConverter();
        String converted = converter.convert(input);
        assertEquals("IV", converted);
    }

    @Test
    public void FiveShouldReturnV(){
        int input = 5;
        RomanConverter converter = new RomanConverter();
        String converted = converter.convert(input);
        assertEquals("V", converted);
    }

    @Test
    public void SixShouldReturnVI(){
        int input = 6;
        RomanConverter converter = new RomanConverter();
        String converted = converter.convert(input);
        assertEquals("VI", converted);
    }

    @Test
    public void ThreeThousandShouldReturnMMM(){
        int input = 3000;
        RomanConverter converter = new RomanConverter();
        String converted = converter.convert(input);
        assertEquals("MMM", converted);
    }

    @Test
    public void OneThousandNineHundredNinetyNineShouldReturnMCMXCIX(){
        int input = 1999;
        RomanConverter converter = new RomanConverter();
        String converted = converter.convert(input);
        assertEquals("MCMXCIX", converted);
    }
}
