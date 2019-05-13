public class Decrypt {
    public static String decrypt(String inputString, int shift){
        if(shift > 26){
            shift = shift % 26;
        }
        else if(shift < 0) {
            shift = (shift % 26) + 26;
        }

        String outputString = "";
        int length = inputString.length();
        for (int i = 0; i < length ; i++) {
            char cc = inputString.charAt(i);
            if(Character.isLetter(cc)){
                if(Character.isLowerCase(cc)){
                    char c = (char)(cc-shift);
                    if(c<'a'){
                        outputString += (char)(cc + (26-shift));
                    }
                    else {
                        outputString += c;
                    }
                }
                else if(Character.isUpperCase(cc)){
                    char c = (char)(cc-shift);
                    if(c<'A'){
                        outputString += (char)(cc + (26-shift));
                    }
                    else {
                        outputString += c;
                    }
                }
            }
            else{
                outputString += cc;
            }
        }
        return outputString;
    }
}