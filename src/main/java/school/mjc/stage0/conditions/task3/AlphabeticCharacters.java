package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(character>64 || character<123)
            if(character=='A' || character=='a' || character=='I' || character == 'i' || character=='E' || character == 'e' || character=='O' || character == 'o' || character=='U' || character == 'u' || character=='Y' || character == 'y')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
       else
            System.out.println("wrong alphabet!");

    }
}
