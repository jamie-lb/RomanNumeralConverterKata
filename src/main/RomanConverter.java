package main;

public class RomanConverter {

    private final String thousandCharacter = "M";
    private final String fiveHundredCharacter = "D";
    private final String oneHundredCharacter = "C";
    private final String fiftyCharacter = "L";
    private final String tenCharacter = "X";
    private final String fiveCharacter = "V";
    private final String oneCharacter = "I";


    public String convert(int input) {
        String converted = "";
        for (int i = input; i > 0; ) {
            int iterationCount = i / 1000;
            converted += appendCharacter(thousandCharacter, iterationCount);
            i -= iterationCount * 1000;
            if (i >= 900) {
                converted += appendCharacter(oneHundredCharacter, 1);
                converted += appendCharacter(thousandCharacter, 1);
                i -= 900;
            }
            iterationCount = i / 500;
            converted += appendCharacter(fiveHundredCharacter, iterationCount);
            i -= iterationCount * 500;
            if (i >= 400) {
                converted += appendCharacter(oneHundredCharacter, 1);
                converted += appendCharacter(fiveHundredCharacter, 1);
                i -= 400;
            }
            iterationCount = i / 100;
            converted += appendCharacter(oneHundredCharacter, iterationCount);
            i -= iterationCount * 100;
            if (i >= 90) {
                converted += appendCharacter(tenCharacter, 1);
                converted += appendCharacter(oneHundredCharacter, 1);
                i -= 90;
            }
            iterationCount = i / 50;
            converted += appendCharacter(fiftyCharacter, iterationCount);
            i -= iterationCount * 50;
            if (i >= 40) {
                converted += appendCharacter(tenCharacter, 1);
                converted += appendCharacter(fiftyCharacter, 1);
                i -= 40;
            }
            iterationCount = i / 10;
            converted += appendCharacter(tenCharacter, iterationCount);
            i -= iterationCount * 10;
            if (i >= 9) {
                converted += appendCharacter(oneCharacter, 1);
                converted += appendCharacter(tenCharacter, 1);
                i -= 9;
            }
            iterationCount = i / 5;
            converted += appendCharacter(fiveCharacter, iterationCount);
            i -= iterationCount * 5;
            if (i >= 4) {
                converted += appendCharacter(oneCharacter, 1);
                converted += appendCharacter(fiveCharacter, 1);
                i -= 4;
            }
            iterationCount = i;
            converted += appendCharacter(oneCharacter, iterationCount);
            i -= iterationCount;
        }
        return converted;
    }

    private String appendCharacter(String characterToAppend, int numberOfTimes) {
        String returnValue = "";
        while (numberOfTimes > 0) {
            returnValue += characterToAppend;
            numberOfTimes -= 1;
        }
        return returnValue;
    }
}