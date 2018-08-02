package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Bigmac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuldier {

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuldier bun(Components components) {
            switch (components) {
                case BUN_WITH_SESAME:
                    this.bun = Components.BUN_WITH_SESAME.getComponent();
                    break;

                case BUN_WITHOUT_SESAME:
                    this.bun = Components.BUN_WITHOUT_SESAME.getComponent();
                    break;

                default:
                    this.bun = Components.BUN_WITHOUT_SESAME.getComponent();
                    break;
            }
            return this;
        }

        public BigmacBuldier burgers(int numberOfBurgers) {
            this.burgers = numberOfBurgers < 0? 0 : numberOfBurgers;
            return this;
        }

        public BigmacBuldier sauce(Components components) {
            switch (components) {
                case STANDARD_SAUCE:
                    this.sauce = Components.STANDARD_SAUCE.getComponent();
                    break;

                case THOUSAND_ISLAND_SAUCE:
                    this.sauce = Components.THOUSAND_ISLAND_SAUCE.getComponent();
                    break;

                case BARBECUE_SAUCE:
                    this.sauce = Components.BARBECUE_SAUCE.getComponent();
                    break;

                default:
                    this.sauce = Components.STANDARD_SAUCE.getComponent();
                    break;
            }
            return this;
        }

        public BigmacBuldier ingredients(List<Components> chosenIngredients) {

            for (Components chosen : chosenIngredients) {
                switch (chosen) {
                    case LETTUCE:
                        ingredients.add(Components.LETTUCE.getComponent());
                        break;

                    case ONION:
                        ingredients.add(Components.ONION.getComponent());
                        break;

                    case BACON:
                        ingredients.add(Components.BACON.getComponent());
                        break;

                    case PICKLE:
                        ingredients.add(Components.PICKLE.getComponent());
                        break;

                    case CHILLI:
                        ingredients.add(Components.CHILLI.getComponent());
                        break;

                    case MUSHROOMS:
                        ingredients.add(Components.MUSHROOMS.getComponent());
                        break;

                    case SHRIMPS:
                        ingredients.add(Components.SHRIMPS.getComponent());
                        break;

                    case CHEESE:
                        ingredients.add(Components.CHEESE.getComponent());
                        break;

                    default:
                        ingredients.add(Components.CHEESE.getComponent());
                        break;
                }
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    protected Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String printIngredients() {
        return ingredients.stream().collect(Collectors.joining("\n"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bigmac)) return false;
        Bigmac bigmac = (Bigmac) o;
        return Objects.equals(getBun(), bigmac.getBun()) &&
                Objects.equals(getSauce(), bigmac.getSauce()) &&
                Objects.equals(getIngredients(), bigmac.getIngredients());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBun(), getSauce(), getIngredients());
    }

    @Override
    public String toString() {
        return String.format("Bigmac \nBun: %s \nBurgers %d \nSauce: %s \nIngredients: \n%s ", getBun(),
                getBurgers(), getSauce(), printIngredients());
    }

}
