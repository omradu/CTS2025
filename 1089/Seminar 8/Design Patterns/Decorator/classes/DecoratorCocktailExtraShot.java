public class DecoratorCocktailExtraShot extends DecoratorCocktail{
    public DecoratorCocktailExtraShot(Bautura cocktail) {
        super(cocktail);
    }

    @Override
    public void sePrepara() {
        super.sePrepara();
        System.out.println("Se prepara cu extra shot de alcool");
    }

    @Override
    public void seConsuma() {
        super.seConsuma();
        System.out.println("A fost un shot extra");
    }
}
