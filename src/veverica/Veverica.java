package veverica;

public class Veverica {

    private String ime;
    private String boja;
    private Ruka levaRuka, desnaRuka;
    private String staDrzi;

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public Veverica(String ime, String boja) {
        this.setIme(ime);
        this.setBoja(boja);
        this.levaRuka = new Ruka();
        this.desnaRuka = new Ruka();
        this.staDrzi = "NISTA";
    }
    
    
    
}
