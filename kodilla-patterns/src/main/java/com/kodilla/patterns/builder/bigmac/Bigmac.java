package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Bigmac {

    private final BunType bun;
    private final int burgers;
    private final SauceType sauce;
    private final List<IngredientType> ingredients;

    public static class BigmacBuldier {

        private BunType bun;
        private int burgers;
        private SauceType sauce;
        private List<IngredientType> ingredients = new ArrayList<>();

        public BigmacBuldier bun(BunType bunType) {
           this.bun = bunType;
           return this;
        }

        public BigmacBuldier burgers(int numberOfBurgers) {
            this.burgers = numberOfBurgers < 0? 0 : numberOfBurgers;
            return this;
        }

        public BigmacBuldier sauce(SauceType sauceType) {
            this.sauce = sauceType;
            return this;
        }

        public BigmacBuldier ingredients(List<IngredientType> chosenIngredients) {

            this.ingredients = new ArrayList<>();
            ingredients.addAll(chosenIngredients);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    protected Bigmac(BunType bun, int burgers, SauceType sauce, List<IngredientType> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public BunType getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public SauceType getSauce() {
        return sauce;
    }

    public List<IngredientType> getIngredients() {
        return ingredients;
    }

    private String printIngredients() {
        return ingredients.stream()
                .map(IngredientType::getDescription)
                .collect(Collectors.joining("\n"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bigmac)) return false;
        Bigmac bigmac = (Bigmac) o;
        return getBurgers() == bigmac.getBurgers() &&
                getBun() == bigmac.getBun() &&
                getSauce() == bigmac.getSauce() &&
                Objects.equals(getIngredients(), bigmac.getIngredients());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBun(), getBurgers(), getSauce(), getIngredients());
    }

    @Override
    public String toString() {
        return String.format("Bigmac \nBun: %s \nBurgers %d \nSauce: %s \nIngredients: \n%s ", getBun().getDescription(),
                getBurgers(), getSauce().getDescription(), printIngredients());
    }

}
