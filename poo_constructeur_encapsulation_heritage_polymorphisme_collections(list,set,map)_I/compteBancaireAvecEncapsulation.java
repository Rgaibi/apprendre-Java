public class compteBancaireAvecEncapsulation {
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
        compteBancaireAvecEncapsulation c = new compteBancaireAvecEncapsulation();
        c.setsolde(100);
        System.out.println("solde : "+c.getsolde());
    }
}