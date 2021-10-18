package com.example.methods;

public class Sınıf {
    private String isim;
    private String soyisim;
    private int not;

    public Sınıf(String isim, String soyisim, int not) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.not = not;
        System.out.println("Sınıf const. finished");
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getNot() {
        return not;
    }

    public void setNot(int not) {
        this.not = not;
    }
}
