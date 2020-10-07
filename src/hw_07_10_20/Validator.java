package hw_07_10_20;

import java.time.LocalDate;
import java.util.Scanner;

public class Validator {

    public static void validator(String number, String ownerName, String cvv, String typeOfCard, int cardExpiry) {
        class Card {
            LocalDate date = LocalDate.of(21, 12, 31);
            int year = date.getYear();
            private String numberOfCard;
            private String owner;
            private String cVV;
            private String type;
            private int yearOfCard;


            public Card() {
                this.numberOfCard = number;
                this.owner = ownerName;
                this.cVV = cvv;
                this.type = typeOfCard;
                this.yearOfCard = cardExpiry;
            }

            public void validate() {
                if (numberOfCard.length() == 16) {
                    System.out.println("Number is correct");
                } else System.out.println("number is incorrect");
                if (owner == null) {
                    System.out.println("No owner");
                } else System.out.println("Owner is correct");
                if (cVV.length() == 3) {
                    System.out.println("cvv is correct");
                } else System.out.println("cvv is incorrect");
                if (type.equals("mastercard") || type.equals("visa")) {
                    System.out.println("correct type");
                } else System.out.println("incorrect type");
                if (cardExpiry <= year) {
                    System.out.println("correct expiry");
                } else System.out.println("incorrect expiry");
            }

        }
        Card card = new Card();
        card.validate();
    }

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("enter number of card");
        String numberOfCard = scan1.nextLine();
        System.out.println("enter owners name");
        String owner = scan1.nextLine();
        System.out.println("enter cvv");
        String cVV = scan1.nextLine();
        System.out.println("enter type of card(master card or visa");
        String type = scan1.nextLine();
        System.out.println("enter expiry year");
        int expiry = scan1.nextInt();
        Validator.validator(numberOfCard, owner, cVV, type, expiry);
    }

}
