/*
This is Caesar Cipher class that encrypt letters in String characters - it works appropriate with small letters
Author: Wojtek
 */

import java.lang.String;

public class CaesarCipher {

    private String name;
    private String surname;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //main method use can put bigger key than number of small letters in english alphabet, it uses modulo
    public void encryptName(String name, int key) {
        char[] newName = new char[name.length()];
        int newKey = key % 26;
        for(int i=0; i<name.length(); i++) {
            newName[i] = getNewLetter(name.charAt(i), newKey);
        }
        String encryptedName = new String(newName);

        System.out.println(encryptedName);
    }
    //auxiliary method - returns
    public char getNewLetter(char letter, int key) {
        int newLetterCode = letter + key;
        return newLetterCode <= 122 ? (char) newLetterCode : (char) (96 + newLetterCode % 122);
    }

    public static void main(String[] args) {

        CaesarCipher sample = new CaesarCipher();

        sample.setName("wojciech");
        sample.encryptName(sample.getName(), 5);

        sample.setSurname("turek");
        sample.encryptName(sample.getSurname(), 5);

    }
}
