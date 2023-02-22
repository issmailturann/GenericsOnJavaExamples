package GenericClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Music<IMusicGenre> MusicList = new Music<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kendi şarkılarımı girmek istiyorum: 1'e bas: \n" +
                            "Playlistteki şarkıları görüntülemek istiyorum: 2'ye bas \n" +
                            "Çıkış için -----> 0");
        int giris = scanner.nextInt();
        switch (giris){
            case 1:
                System.out.println("RAP ----> 1\n" +"Techno ----> 2\n" + "Geri ----> 0\n");
                int secim = scanner.nextInt();
                switch (secim){
                    case 1:
                        String input = "";

                            System.out.println("Bir şarkıcı ve bir şarkı giriniz: \n çıkmak için (Q) ");
                            scanner.nextLine();
                            input = scanner.nextLine();
                                String[] inputArr = input.split(" ");

                                if (inputArr.length < 2) {
                                    System.out.println("Hatalı girdi: Şarkıcı ve şarkı adı arasına boşluk koyun.");
                                } else {
                                    String sarkici1 = inputArr[0];
                                    String sarki1 = inputArr[1];
                                    RapMusic rapMusic = new RapMusic(sarkici1, sarki1);
                                    MusicList.addMusic(rapMusic);
                                }
                        break;
                    case 2:

                        String input1 = "";

                        System.out.println("Bir şarkıcı ve bir şarkı giriniz: \n çıkmak için (Q) ");
                        scanner.nextLine();
                        input1 = scanner.nextLine();
                        String[] inputArr1 = input1.split(" ");

                        if (inputArr1.length < 2) {
                            System.out.println("Hatalı girdi: Şarkıcı ve şarkı adı arasına boşluk koyun.");
                        } else {
                            String sarkici2 = inputArr1[0];
                            String sarki2 = inputArr1[1];
                            TechnoMusic technoMusic = new TechnoMusic(sarkici2, sarki2);
                            MusicList.addMusic(technoMusic);
                        }
                        break;
                }
            case 2:
                System.out.println("Müziklerinizi görüntülemek için ----> 1 \n");
                int giris1 = scanner.nextInt();
                switch (giris1){
                    case 1:
                        System.out.println("Hangi Tür Playlisti görüntülemek istersiniz?\n +Rap için Rap yazın.\n Techno için Techno yazın lütfen.");
                        scanner.nextLine();
                        String tur = scanner.nextLine();
                        List<IMusicGenre> filteredList = MusicList.filterByGenre(tur);

                        System.out.println(tur + " Music List: \n");

                        for (IMusicGenre music : filteredList){

                            System.out.print(music);
                        }
                        System.out.println();
                        break;
                }
            case 0:
                break;
        }
    }
}
