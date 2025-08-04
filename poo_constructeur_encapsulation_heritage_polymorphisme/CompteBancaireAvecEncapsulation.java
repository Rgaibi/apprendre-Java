public class CompteBancaireAvecEncapsulation {
    private double solde;
    public void setsolde(double montant) {
        if(montant > 0){
            solde += montant;
        }
    }
    public double getsolde(){
        return solde;
    }
    public static void main(String[] args) {
        CompteBancaireAvecEncapsulation c = new CompteBancaireAvecEncapsulation();
        c.setsolde(100);
        System.out.println("solde : "+c.getsolde());
    }
}