public class CocktailFaraAlcool extends DecoratorCocktail{
    public CocktailFaraAlcool(Bautura cocktail) {
        super(cocktail);
    }

    @Override
    public void seConsuma() {
        super.seConsuma();
        System.out.println("Se poate conduce dupa!");
    }
}
