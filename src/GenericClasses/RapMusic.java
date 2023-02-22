package GenericClasses;

public class RapMusic implements IMusicGenre {

    String sarkiciAdi;
    String sarkiAdi;

    public RapMusic(String sarkiciAdi, String sarkiAdi) {
        this.sarkiciAdi = sarkiciAdi;
        this.sarkiAdi = sarkiAdi;
    }

    public String getSarkiciAdi() {
        return sarkiciAdi;
    }

    public void setSarkiciAdi(String sarkiciAdi) {
        this.sarkiciAdi = sarkiciAdi;
    }

    public String getSarkiAdi() {
        return sarkiAdi;
    }

    public void setSarkiAdi(String sarkiAdi) {
        this.sarkiAdi = sarkiAdi;
    }


    @Override
    public String getGenre() {
        return "Rap" ;
    }

    @Override
    public String toString() {
        return "Rap Muzikler seçtiğiniz gibidir: " +
                "\nŞarkıcının Adı =" + getSarkiciAdi() + "\n" +
                "Şarkı Adı = " + getSarkiAdi();
    }
}
