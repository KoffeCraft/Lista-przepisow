package com.lusia.listaprzepisow;

import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    private static ArrayList<Przepis> przepisy;
    private static void generujPrzepisy(){
        przepisy = new ArrayList<>();
        przepisy.add(new Przepis("Herbata zimowa", "Napoje", R.drawable.herbata, "Torebka herbaty, miód, cytryna", "Mniam mniam"));
        przepisy.add(new Przepis("Barszcz czerwony", "Potrawy", R.drawable.barszcz, "Buraki, mąka, ziemniaki, zioła", "Zupa była za słona"));
        przepisy.add(new Przepis("Serowe choinki", "Przekąski", R.drawable.serowehoinki, "Torebka herbaty, miód, cytryna", "Jingel bels"));
    }
    public ArrayList<Przepis> getPrzepisy(){
        generujPrzepisy();
        return przepisy;
    }
}
