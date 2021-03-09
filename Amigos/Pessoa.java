public class Pessoa {
    private String nome;
    private int idade;
    private boolean estarNoCarro;
    public String getNome(String nomePessoa){
        return nome= nomePessoa;
    }

        /**
         * @return the nome
         */
    public String getNome() {
        return nome;
        }

        /**
         * @param nome the nome to set
         */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the estarNoCarro
     */
    public boolean isEstarNoCarro() {
        return estarNoCarro;
    }

    /**
     * @param estarNoCarro the estarNoCarro to set
     */
    public void setEstarNoCarro(boolean estarNoCarro) {
        this.estarNoCarro = estarNoCarro;
    }
}
