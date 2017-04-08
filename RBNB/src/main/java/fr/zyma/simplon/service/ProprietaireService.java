package fr.zyma.simplon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.zyma.simplon.model.Proprietaire;
import fr.zyma.simplon.repository.ProprietaireRepository;

@Service
@Transactional
public class ProprietaireService {
	
@Autowired
private ProprietaireRepository proprietaireRepository;

public void save(Proprietaire proprietaire) {
	proprietaireRepository.save(proprietaire);
	
} 
public Iterable<Proprietaire> getAllProprietaire() {
	return proprietaireRepository.findAll();
}

 
public Proprietaire getProprietaireById(long id) {
	return proprietaireRepository.findOne(id);
}

}
