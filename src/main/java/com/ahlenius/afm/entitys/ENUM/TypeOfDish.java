package com.ahlenius.afm.entitys.ENUM;

public enum TypeOfDish {
    SOUP ("Soppa"),
    OVENDISH ("Ugnsrätt"),
    DOUGH ("Deg"),
    PASTA ("Pasta"),
    CASEROLE ("Gryta"),
    SALAD ("Sallad"),
    FRYUP ("Stekt") // Wok, Pytt i Panna
    ;
    private final String swedish;

    TypeOfDish(String swedish) { this.swedish = swedish;
    }
    @Override
    public String toString() {return swedish;}

}
