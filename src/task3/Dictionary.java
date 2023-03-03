package task3;
import java.util.ArrayList;

public class Dictionary {
        public static void main(String[] args) {
            ArrayList<String> dictionary = new ArrayList<String>();

            dictionary.add("apple - măr");
            dictionary.add("book - carte");
            dictionary.add("cat - pisică");
            dictionary.add("dog - câine");
            dictionary.add("elephant - elefant");
            dictionary.add("flower - floare");
            dictionary.add("house - casă");
            dictionary.add("ice cream - înghețată");
            dictionary.add("juice - suc");
            dictionary.add("key - cheie");

            System.out.println("English - Romanian dictionary \n");
            for (String entry : dictionary) {
                System.out.println(entry);
            }
        }
    }