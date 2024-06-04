package banqueApp;

import java.util.Calendar;

import fr.diginamic.Adresse;
import fr.diginamic.AssuranceVie;
import fr.diginamic.Banque;
import fr.diginamic.Client;
import fr.diginamic.Compte;
import fr.diginamic.LivretA;
import fr.diginamic.Operation;
import fr.diginamic.Virement;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class BanqueApp {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banqueCo");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		// envisager une instance de date avec class util
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal.set(2024, 2, 23);
		// fin

		// instanciation d'un banque
		Banque bq1 = new Banque("Ing");

		em.persist(bq1);

		// instanciation d'un client
		Client cl1 = new Client("Dubal", "Jean", cal.getTime(), bq1,
				new Adresse(5, "Rue de la paix", 34000, "Montpellier"));

		cal.set(1992, 2, 23);
		Client cl2 = new Client("Hier", "David", cal.getTime(), bq1,
				new Adresse(25, "Rue de la loge", 34000, "Montpellier"));

		// liaison d'un client à une banque
		bq1.addClient(cl1);
		// liaison d'un client à une banque
		bq1.addClient(cl2);

		em.persist(cl1);
		em.persist(cl2);

		// instanciation d'un compte
		Compte cpt1 = new Compte("FR78-8569-8787-857", 7425.25);
		em.persist(cpt1);

		Compte cpt2 = new Compte("FR87-1111-1111-000", 8000.25);
		em.persist(cpt2);

		cpt2.getClients().add(cl1);
		cpt2.getClients().add(cl2);
		// liaison d'un client à un compte
		cpt1.getClients().add(cl1);

		// un client avec plusieurs compte
		cal.set(1992, 2, 23);
		Client cl3 = new Client("Picron", "Antoine", cal.getTime(), bq1,
				new Adresse(25, "Rue de la digi", 34000, "Montpellier"));

		bq1.addClient(cl3);

		em.persist(cl3);

		LivretA livA = new LivretA();
		livA.setTaux(0.35);
		livA.setNumero("Be00-0000-0000");
		livA.setSolde(250.25);
		livA.getClients().add(cl3);

		em.persist(livA);

		cal.set(2030, 6, 25);
		AssuranceVie assV = new AssuranceVie();
		assV.setDateFin(cal.getTime());
		assV.setTaux(2.25);
		assV.setNumero("FR25-56-454-4545");
		assV.setSolde(4500.25);
		assV.getClients().add(cl3);
		em.persist(assV);

		
		cal2.set(2024, 5, 04, 15, 12, 20);

		// Instanciation Virement
		Virement vir = new Virement();
		vir.setBeneficiaire("Jean");
		vir.setDate(cal2.getTime());
		vir.setMontant(850.25);
		vir.setMotif("location garage");
		vir.setCompte(cpt2);
		em.persist(vir);

		// instanciation d'une opération
		Operation op1 = new Operation(cal2.getTime(), 250.00, "Recu", cpt1);
		em.persist(op1);

		transaction.commit();
		em.close();
	}

}
