package br.com.marcelo.faculdade;

import br.com.marcelo.br.com.marcelo.faculdade.classes.Mamifero;
import br.com.marcelo.br.com.marcelo.faculdade.classes.MamiferoTransgenico;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Mamifero morcego = new Mamifero();
        Mamifero baleia = new Mamifero();
        Mamifero serHumano = new Mamifero();
        MamiferoTransgenico alien = new MamiferoTransgenico();

        morcego.setHabitat("Aereo");
        morcego.setQtdePatas(2);
        morcego.setTemPelos(true);

        baleia.setHabitat("Marinho");
        baleia.setQtdePatas(0);
        baleia.setTemPelos(false);

        serHumano.setHabitat("Mundo da Lua");
        serHumano.setQtdePatas(2);
        serHumano.setTemPelos(true);

        alien.setHabitat("Espaço");
        alien.setQtdePatas(40);
        alien.setTemPelos(true);

        System.out.println("Vamos ver como os objetos diferentes da mesma classe se comportam...");

        System.out.println("Comecando pelo morcego:");
        System.out.println("Morcego tem pelos? "+morcego.isTemPelos());
        System.out.print("Como o morcego fala? ");
        morcego.fala("hnem henm henm");
        System.err.print("Como o morcego se move? ");
        morcego.tipoDeMovimentacao();
        System.out.println("Que tipo de classe eu sou: "+morcego.getClass());
        System.err.println();

        System.out.println("Agora a baleia:");
        System.out.println("Baleia tem pelos? "+baleia.isTemPelos());
        System.out.print("Como a baleia fala? ");
        baleia.fala("Uhm uuuuuuhm");
        System.err.print("Como a baleia se move? ");
        baleia.tipoDeMovimentacao();
        System.out.println("Que tipo de classe eu sou: "+baleia.getClass());
        System.err.println();


        System.out.println("Agora o ser humano:");
        System.out.println("Humano tem pelos? "+serHumano.isTemPelos());
        System.out.print("Como o humano fala? ");
        serHumano.fala("Isso é Bullying!!!!!");
        System.err.print("Como o humano se move? ");
        serHumano.tipoDeMovimentacao();
        System.out.println("Que tipo de classe eu sou: "+serHumano.getClass());
        System.err.println();


        System.out.println("Agora o Alien:");
        System.out.println("Alien tem pelos? "+alien.isTemPelos());
        System.out.print("Como o alien fala? ");
        alien.fala("hfaosjdhfpas8askdfjlksdnf");
        System.err.print("Como o alien se move? ");
        alien.tipoDeMovimentacao();
        System.out.println("Que tipo de classe eu sou: "+alien.getClass());
        System.out.print("DNA o Alien: ");
        alien.dna();
        System.err.println();

    }
}
