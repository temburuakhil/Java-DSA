package Bit_Manipulation;

public class CharConversion {

    private static char toLower(char ch){
        return (char)(ch|(1<<5));
    }

    private static char toUpper(char ch){
        return (char)(ch & ~(1<<5));
    }

    private static char toggleChar(char ch){
        return (char)(ch ^ (1<<5));
    }

    private static char specialLower(char ch){
        return (char)(ch| ' ');
    }

    private static char specialUpper(char ch){
        return (char)(ch & '_');
    }

    private static char specialToggle(char ch){
        return (char)(ch ^ ' ');
    }
    public static void main(String[] args) {
        System.out.println(toggleChar('a'));
        System.out.println(toLower('A'));
    }
}
