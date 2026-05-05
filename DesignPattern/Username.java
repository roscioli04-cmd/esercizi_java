package DesignPattern;

public class Username {

    public static class User {
        private String nome;
        private int eta;

        public User() {
            this.nome = "Default";
            this.eta = 0;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getEta() {
            return eta;
        }

        public void setEta(int eta) {
            this.eta = eta;
        }

        public void stampaInfo() {
            System.out.println("Nome: " + nome + ", Età: " + eta);
        }
    }

    public static void main(String[] args) {
        User user1 = new User();
        System.out.println("Informazioni User 1 (Default):");
        user1.stampaInfo();

        User user2 = new User();
        user2.setNome("Marco");
        user2.setEta(25);
        System.out.println("\nInformazioni User 2 (Modificato):");
        user2.stampaInfo();
    }
}