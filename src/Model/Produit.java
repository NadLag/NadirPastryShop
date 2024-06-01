package Model;

public abstract class Produit {
   protected String nom;
   protected String codeUnique;
   protected double poids;
   protected double prix;
   protected String etiquette;

   public Produit(String nom, String codeUnique, double poids, double prix) {
      this.nom = nom;
      this.codeUnique = codeUnique;
      this.poids = poids;
      this.prix = prix;
   }

   // Méthode abstraite getDescription, pour etre implémenter par les sous-classes
   public abstract String getDescription();

   // Getter pour l'attribut etiquette
   public String getEtiquette() {
      return etiquette;
   }
// Getter pour l'attribut Code Unique
   public String getCodeUnique() {
      return codeUnique;
   }

   // Setter pour l'attribut etiquette
   public void setEtiquette(String etiquette) {
      this.etiquette = etiquette;
   }


   // Surcharge de la méthode toString pour afficher les informations du produit
   @Override
   public String toString() {
      return "Produit{" +
              "nom='" + nom + '\'' +
              ", codeUnique='" + codeUnique + '\'' +
              ", poids=" + poids +
              ", prix=" + prix +
              ", etiquette='" + etiquette + '\'' +
              '}';
   }
}
