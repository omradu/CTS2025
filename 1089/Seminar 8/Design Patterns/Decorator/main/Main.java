public class Main {
    public static void main(String[] args) {
        Cocktail cocktail = new Cocktail("Amaretto Sour");

        cocktail.sePrepara();
        cocktail.seConsuma();
        System.out.println("------------------");

        DecoratorCocktail cocktailFaraAlcool = new CocktailFaraAlcool(cocktail);
        cocktailFaraAlcool.sePrepara();
        cocktailFaraAlcool.seConsuma();

        DecoratorCocktail cocktailExtraShot = new DecoratorCocktailExtraShot(cocktail);
        cocktailExtraShot.sePrepara();
        cocktailExtraShot.seConsuma();

        System.out.println("---------------------------");
        DecoratorCocktail cocktaiFaraAlcoolSiGheata = new DecoratorCocktailFaraGheata(cocktailFaraAlcool);
        cocktaiFaraAlcoolSiGheata.sePrepara();
        cocktaiFaraAlcoolSiGheata.seConsuma();

    }
}
