package GenericReturningMethods;
public class GenericReturningMethods {
    public static void main(String[] args) {

            Integer[] integers = {1,2,3,4,5};
            String[] strings = {"ismail", "safa", "turan"};
            Character[] characters = {'a'};

            System.out.println(getFirstElement(strings));
            System.out.println(getFirstElement(integers));
            System.out.println(getFirstElement(characters));
    }

    //Her türden girilen dizi'nin ilk karaketrini döndürebilen metot.
    //Integer da olsa String de olsa karakteri tek satırlık metot ile döndürebiliyoruz.
    public static <Thing> Thing getFirstElement(Thing[] dizi){
        return dizi[0];
    }
}

