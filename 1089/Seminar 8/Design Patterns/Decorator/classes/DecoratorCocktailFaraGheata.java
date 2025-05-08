public class DecoratorCocktailFaraGheata extends DecoratorCocktail{
    public DecoratorCocktailFaraGheata(Bautura cocktail) {
        super(cocktail);
    }

    @Override
    public void sePrepara() {
        super.sePrepara();
        System.out.println("Nu se va pune gheata!");
    }

}
