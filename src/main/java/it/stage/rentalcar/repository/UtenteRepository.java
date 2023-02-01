package it.stage.rentalcar.repository;

import it.stage.rentalcar.domain.Utente;

import java.util.List;

public interface UtenteRepository {
    List<Utente> getCustomers(boolean isAdmin);
    void insOrUpCustomer(Utente utente);
    void delCustomer(int id);
}
