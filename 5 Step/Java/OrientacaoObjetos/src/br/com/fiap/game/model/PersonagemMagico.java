package br.com.fiap.game.model;

public class PersonagemMagico {

    //Atributos
    private String nome;
    private String poderMagico;
    private int nivelEnergia;

    private HabilidadeEspecial habilidade;

    public PersonagemMagico() {}

    public PersonagemMagico(String nome) {
        this.nome = nome;
    }

    // Método que realiza um ataque
    public void atacar(String ataque) {
        if (nivelEnergia >= 10) {
            System.out.println(nome + " realizou um ataque: " + ataque + "!");
            nivelEnergia -= 10;
        } else {
            System.out.println(nome + " está sem energia para atacar.");
        }
    }

    // Método que aumenta e retorna o nível de energia
    public int aumentarEnergia(int energia){
        nivelEnergia = nivelEnergia + energia;
        return nivelEnergia;
    }

    public void ativarHabilidadeEspecial(){
        if (!habilidade.isHabilitada()){
            System.out.println("Habilidade especial não está ativada");
        } else if (nivelEnergia >= habilidade.getCustoEnergia()){
            System.out.println("Ativando a habilidade: " + habilidade.getNome());
            nivelEnergia -= habilidade.getCustoEnergia();
        } else {
            System.out.println(nome + "está sem energia para a habilidade especial");
        }
    }

    // Método que retorna os detalhes do personagem
    public void exibirDetalhes() {
        System.out.println(nome + " Poder Mágico: " + poderMagico + " Nível de Energia: " + nivelEnergia);
    }

        public PersonagemMagico setNome(String nome){
            this.nome = nome;
            return this;
        }

        public PersonagemMagico setPoderMagico(String poderMagico) {
            this.poderMagico = poderMagico;
            return this;
        }

        public PersonagemMagico setNivelEnergia(int nivelEnergia) {
            this.nivelEnergia = nivelEnergia;
            return this;
        }

        public PersonagemMagico setHabilidade(HabilidadeEspecial habilidade) {
            this.habilidade = habilidade;
            return this;
        }


}