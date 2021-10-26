package com.company;

public class Main {

    public static void main(String[] args) {

//
////        1* Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
////        stringus (Jonas Jonaitis). Atspausdinti trumpesnį stringą.
//
//        String name = "123456";
//        String surname = "DiCaprio";
//
//        if ((name.length() > surname.length())){
//            System.out.println(surname);
//        }
//
//        if  ((name.length() < surname.length())) {
//            System.out.println(name);
//        }
//
//
////       2* Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
////        stringus. Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms.
//
//        System.out.println(name.toUpperCase());
//        System.out.println(surname.toLowerCase());
//
//
//
////       3* Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
////        stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš pirmų vardo ir
////        pavardės kintamųjų raidžių. Jį atspausdinti.
//
////      String nameSurname = String.valueOf((name.charAt(0) + surname.charAt(0)));
//
//        System.out.println(name.substring(0,1)+ " " + surname.substring(0,1));
//
//String name = "Vilius";
//String surname = "Juodka";
//String names = String.valueOf(name.charAt(0));
//String namess = String.valueOf(surname.charAt(0));
//
//        System.out.println(names+namess);

//// galima naudoti stirng.valueof(name.charAt(0))  arba name.substring(0,1)
//// printLn duoda i nauja eilute, print i ta pacia eilute, print
//   System.out.println(); is efficient for simply printing a line of text. If the line of text needs to be formatted
//   (ex: alignment (left-justified, etc.), etc.), then System.out.printf(); would be used.
//
////      4* Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
////        stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių vardo ir
////        pavardės kintamųjų raidžių. Jį atspausdinti.
//
//        String name = "Vilius";
//        String  surname = "Juodvalkis";
//        System.out.println((name.substring(name.length()-3))+surname);

//        System.out.println(name.substring(surname.length()-3));
//        //nuo galo jeigu noriu paimti, paimu visa ilgi ir atemu 3


//       5* Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a” (didžiąsias ir
//        mažąsias) pakeisti žvaigždutėm “*”. Rezultatą atspausdinti.
//
////        System.out.println("An American ir pAris".replace(target: "a", replacement:"*").replace(target: "A", replacement: "*)); ;

//      6* Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses. Rezultatą
//      atspausdinti. Kodą pakartoti su stringais: “Breakfast at Tiffany's”, “2001: A Space
//      Odyssey” ir “It's a Wonderful Life”.
//
// uzdavini naudoti "regex"
//        String str="An American in pAris";
//        System.out.println("An Americ".replaceAll(  "[AE]", ""));
        // regex ir replacement atsiranda mistiskai
//
// String name = "An American in Paris";
// String naujas = name.replaceAll("[Aeia]", "");
//
//        System.out.println(naujas.replaceAll("\\p{Blank}",""));
        // panaikina tarpus is sakinio






//       7* Stringe, kurį generuoja toks kodas: ""Star Wars: Episode "+ " ".repeat( (int)
//        (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New
//        Hope" Surasti ir atspausdinti epizodo numerį.
//String starWars = "Star Wars: Episode" + " ".repeat((int) (Math.random() * 10)) + ((int) (Math.random()*7)+1)+ "- A New Hope";
//        System.out.println(starWars.substring(starWars.length()-14, starWars.length()-13));
////trim nuima prieki ir gala, split nuima tarpus ir i masyva kelia


        // scanner.nexline() ivesti zodi terminale
        //timestamp data nuo 1970metu jeigu t2-t1 apskaiciuoti galima laika kiek kas uztrunka
        //timestamp/1000/60/60/365 metus skaiciuoja
        // split(regex: "  ") splitins tarpus

    }
}
