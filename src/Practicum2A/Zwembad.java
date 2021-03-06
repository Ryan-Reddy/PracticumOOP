package Practicum2A;

public class Zwembad {
    private double breedte;
    private double lengte;
    private double diepte;

    public Zwembad(double br, double len, double dp) {
        breedte = br;
        lengte = len;
        diepte = dp;
    }

    public Zwembad() {}


    public void setBreedte(double br)   { breedte = br; }
    public void setLengte(double len)   { lengte = len;}
    public void setDiepte(double dp)    { diepte = dp;}

    public double getBreedte()          { return breedte;}
    public double getLengte()           { return lengte;}
    public double getDiepte()           { return diepte;}

    public String toString() {
        String s = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
        return s; }

    public double zwembadInhoud() {
        return breedte * lengte * diepte;
    }
}
