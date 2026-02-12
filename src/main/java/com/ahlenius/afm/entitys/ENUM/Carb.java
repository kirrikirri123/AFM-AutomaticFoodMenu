package com.ahlenius.afm.entitys.ENUM;

public enum Carb {
    PASTA ("Pasta"),
    RICE ("Ris"),
    POTATO ("Potatis"),
    NOODLE("Nudlar"),
    BULGUR ("Bulgur"),
    COUSCOUS ("Couscous"),
    OATRICE ("Havreris");

    private final String swedish;

    Carb(String swedish) { this.swedish = swedish;}

    @Override
    public String toString() {
        return swedish;}
}
