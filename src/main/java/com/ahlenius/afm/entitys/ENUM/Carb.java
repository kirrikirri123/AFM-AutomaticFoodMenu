package com.ahlenius.afm.entitys.ENUM;

public enum Carb {
    PASTA ("Pasta"),
    RIS ("Ris"),
    POTATIS ("Potatis"),
    NUDLAR ("Nudlar"),
    BULGUR ("Bulgur"),
    COUSCOUS ("Couscous"),
    HAVRERIS ("Havreris");

    private final String swedish;

    Carb(String swedish) { this.swedish = swedish;}

    @Override
    public String toString() {
        return swedish;}
}
