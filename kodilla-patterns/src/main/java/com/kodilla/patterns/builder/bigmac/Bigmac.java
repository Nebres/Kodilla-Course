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

        public BigmacBuldier bun(int chosen) {
            switch (chosen) {
                default:
                    this.bun = null;
                    break;

                case 1:
                    this.bun = Components.BUN_WITH_SESAME;
                    break;

                case 2:
                    this.bun = Components.BUN_WITHOUT_SESAME;
                    break;
            }
            return this;
        }

        public BigmacBuldier burgers(int numberOfBurgers) {
            this.burgers = numberOfBurgers < 0? 0 : numberOfBurgers;
            return this;
        }

        public BigmacBuldier sauce(int chosen) {
            switch (chosen) {
                default:
                    this.sauce = null;
                    break;

                case 1:
                    this.sauce = Components.STANDARD_SAUCE;
                    break;

                case 2:
                    this.sauce = Components.THOUSAND_ISLAND_SAUCE;
                    break;

                case 3:
                    this.sauce = Components.BARBECUE_SAUCE;
                    break;
            }
            return this;
        }

        public BigmacBuldier ingredients(List<Integer> chosenIngredients) {

            for (int chosen : chosenIngredients) {
                switch (chosen) {
                    default:
                        ingredients.add(null);
                        break;

                    case 1:
                        ingredients.add(Components.LETTUCE);
                        break;

                    case 2:
                        ingredients.add(Components.ONION);
                        break;

                    case 3:
                        ingredients.add(Components.BACON);
                        break;

                    case 4:
                        ingredients.add(Components.PICKLE);
                        break;

                    case 5:
                        ingredients.add(Components.CHILLI);
                        break;

                    case 6:
                        ingredients.add(Components.MUSHROOMS);
                        break;

                    case 7:
                        ingredients.add(Components.SHRIMPS);
                        break;

                    case 8:
                        ingredients.add(Components.CHEESE);
                        break;
                }
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }

    public Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
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
