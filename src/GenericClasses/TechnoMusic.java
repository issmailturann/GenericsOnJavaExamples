package GenericClasses;

public class TechnoMusic implements IMusicGenre {

    String sarkiciAdi;
    String sarkiAdi;

    public TechnoMusic(String sarkiciAdi, String sarkiAdi) {
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
        return "Techno";
    }
    @Override
    public String toString() {
        return "Techno Muzikler seçtiğiniz gibidir: " +
                "\nŞarkıcının Adı =" + getSarkiciAdi() + "\n" +
                "Şarkı Adı = " + getSarkiAdi();
    }
}
