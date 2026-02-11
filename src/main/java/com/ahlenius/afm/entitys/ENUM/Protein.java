package com.ahlenius.afm.entitys.ENUM;

public enum Protein {
    CHICKEN ("Kyckling"),
    VEGETARIAN ("Vegetariskt"),
    FISH ("Fisk"),
    PORK ("Fläsk"),
    MEAT ("Kött"),
    MINCED ("Färs"),
    SOUSAGE ("Korv");

    private final String swedish;

    Protein(String swedish) { this.swedish = swedish;}

    @Override
    public String toString() {return swedish; }
}
