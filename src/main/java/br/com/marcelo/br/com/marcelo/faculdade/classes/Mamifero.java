package br.com.marcelo.br.com.marcelo.faculdade.classes;

public class Mamifero {

    // Quantidade de patas
    private int qtdePatas;

    // Se tem pelos ou nao
    private boolean temPelos;

    // Local do habitat (Terrestre, Marinho ou Aereo)
    private String habitat;

    /**
     * @return int return the qtdePatas
     */
    public int getQtdePatas() {
        return qtdePatas;
    }

    /**
     * @param qtdePatas the qtdePatas to set
     */
    public void setQtdePatas(int qtdePatas) {
        this.qtdePatas = qtdePatas;
    }

    /**
     * @return boolean return the temPelos
     */
    public boolean isTemPelos() {
        return temPelos;
    }

    /**
     * @param temPelos the temPelos to set
     */
    public void setTemPelos(boolean temPelos) {
        this.temPelos = temPelos;
    }

    /**
     * @return String return the habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void fala(String fala){
        System.out.println(fala);
    }

    public void tipoDeMovimentacao(){
        if(habitat.equalsIgnoreCase("Marinho")){
            System.out.println("Esta coisa nada!!!");
        }
        else if(habitat.equalsIgnoreCase("Aereo")){
            System.out.println("Esta coisa voa");
        }
        else{
            System.out.println("Esta coisa corre.");
        }
    }
}