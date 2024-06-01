package Model;

public class ConfitDeCanard extends ProduitLocal {

   public ConfitDeCanard(String nom, String codeUnique, double poids, double prix, String dateMiseEnConserve, String dateFinValidite) {
      super(nom, codeUnique, poids, prix, dateMiseEnConserve, dateFinValidite);
   }

   @Override
   public String getDescription() {
      // Retourne la description spécifique pour ConfitDeCanard
      return "Confit de canard";
   }
}
