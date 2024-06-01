package Model;

public class Confiture extends ProduitLocal {

   public Confiture(String nom, String codeUnique, double poids, double prix, String dateMiseEnConserve, String dateFinValidite) {
      super(nom, codeUnique, poids, prix, dateMiseEnConserve, dateFinValidite);
   }

   @Override
   public String getDescription() {
      // Retourne la description spécifique pour Confiture
      return "Confiture";
   }

   @Override
   public boolean estFrais() {
      // Retourne true pour indiquer que la confiture est un produit frais
      return true;
   }
}
