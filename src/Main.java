public class Main {
    public static void main(String[] args) {
        // Exemple d'utilisation de SocieteHashMap
        InterfaceSociete societeHashMap = new SocieteHashMap();

        Employe employe1 = new Employe("CIN1", "MAT001", "Alice", "Smith");
        Employe employe2 = new Employe("CIN2", "MAT002", "Bob", "Johnson");
        Departement departement1 = new Departement(1, "Ressources Humaines");
        Departement departement2 = new Departement(2, "Informatique");

        societeHashMap.ajouterEmployeDepartement(employe1, departement1);
        societeHashMap.ajouterEmployeDepartement(employe2, departement2);

        System.out.println("Liste des employés et de leurs départements (SocieteHashMap):");
        societeHashMap.afficherLesEmployesLeursDepartements();

        // Exemple d'utilisation de SocieteTreeMap
        InterfaceSociete societeTreeMap = new SocieteTreeMap();

        Employe employe3 = new Employe("CIN3", "MAT003", "Salma", "Ri");
        Employe employe4 = new Employe("CIN4", "MAT004", "Ahmed", "B");
        Departement departement3 = new Departement(3, "Finance");
        Departement departement4 = new Departement(4, "Marketing");

        societeTreeMap.ajouterEmployeDepartement(employe3, departement3);
        societeTreeMap.ajouterEmployeDepartement(employe4, departement4);

        System.out.println("Liste des employés et de leurs départements (SocieteTreeMap):");
        societeTreeMap.afficherLesEmployesLeursDepartements();
    }
}
