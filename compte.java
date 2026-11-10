 public abstract class Compte {

    // Encapsulation
    private String numero;
    private double solde;

    // Attribut static
    private static int nombreComptes = 0;

    // Constructeur
    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
        nombreComptes++;
    }

    // Getters
    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    // Setter
    public void setSolde(double solde) {
        if (solde >= 0) {
            this.solde = solde;
        }
    }

    // Méthode static
    public static int getNombreComptes() {
        return nombreComptes;
    }

    // Méthode abstraite
    public abstract double calculerFrais();

    // Méthode d'affichage
    public void afficher() {
        System.out.println("Numero : " + numero);
        System.out.println("Solde : " + solde);
    }
}