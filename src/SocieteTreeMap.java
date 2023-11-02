import java.util.*;
import java.util.Map.Entry;

class SocieteTreeMap implements InterfaceSociete {
    private Map<Employe, Departement> employesDepartements = new TreeMap<>(new Comparator<Employe>() {
        @Override
        public int compare(Employe e1, Employe e2) {
            return e1.getCin().compareTo(e2.getCin());
        }
    });

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employesDepartements.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employesDepartements.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Entry<Employe, Departement> entry : employesDepartements.entrySet()) {
            System.out.println(entry.getKey() + " travaille dans le département " + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe employe : employesDepartements.keySet()) {
            System.out.println(employe);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement departement : employesDepartements.values()) {
            System.out.println(departement);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        if (employesDepartements.containsKey(e)) {
            System.out.println("Le département de " + e + " est " + employesDepartements.get(e));
        } else {
            System.out.println(e + " n'est pas associé à un département.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employesDepartements.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return employesDepartements.containsValue(d);
    }
}

