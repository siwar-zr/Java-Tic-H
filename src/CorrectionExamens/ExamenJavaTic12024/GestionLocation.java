package CorrectionExamens.ExamenJavaTic12024;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionLocation {
    private List<Vehicule> vehicules = new ArrayList<>();

    public void ajouterVehicule(Vehicule v) {
        vehicules.add(v);
    }

    public List<Vehicule> rechercherVehiculesDisponibles() {
//        List<Vehicule> disponibles = new ArrayList<>();
//        for(Vehicule v : vehicules) {
//            if(v.estDisponible()) {
//                disponibles.add(v);
//            }
//        }
        List<Vehicule> disponibles = vehicules.stream().filter(v -> v.estDisponible()).toList();

        return disponibles;
    }

    public void louerVehicule(String id, String client, Date date) {
        for(Vehicule v : vehicules) {
            if(v.getId().equals(id) && v.estDisponible()) {
                v.louer(client, date);
                break;
            }
        }
    }

    public void retournerVehicule(String id, Date date) {
        for(Vehicule v : vehicules) {
            if(v.getId().equals(id)) {
                v.retourner(date);
                break;
            }
        }
    }
}

