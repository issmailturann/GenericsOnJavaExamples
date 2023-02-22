public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Integer[] integers = {1,2,3,4,5};
        String[] strings = {"ismail", "safa", "turan"};
        Character[] characters = {'a'};

        yazdir(strings);
        yazdir(integers);
        yazdir(characters);
    }
    //Thing dediğimiz yere aslında her şey gelebilir. Bu metodun "Generic" bir metot olduğunu ifade ediyor.
    public static <Thing> void yazdir(Thing[] dizi){

        for (Thing T: dizi) {
            System.out.print(T + " ");
        }
        System.out.println();
    }
}