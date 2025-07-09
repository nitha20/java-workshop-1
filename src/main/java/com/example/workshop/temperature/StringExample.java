package temperature.beans;

public class StringExample {
    public static void main(String[] args) {
       

        String firstName  = "reshma";
        String lastName = "musthafa";
        String fullName = firstName .concat(lastName);

        String upperCase = fullName.toUpperCase();
        
        System.out.println((" The upper case of  my name is :" + upperCase));

       
       
       
        String sentance = "hi this is reshma here currently pursuing my ug degree bsc cs aids in vetias";
        String[] words = sentance.split(" ");
        String[] letters = sentance.split("");
        String[] characters = sentance.split("\\s+");
        System.out.println(words.length);
        System.out.println(letters.length);
        System.out.println(characters.length);
        

        for (String word : words) {
            System.out.println(word);
        }
        for (String letter : letters) {
            System.out.println(letter);
        }
        for (String character : characters) {
            System.out.println(character);
        }
    }
    
}
