package kodlama.io.devs.business.concretes;

import java.util.List;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}
	@Override
	public void add(Language language) throws Exception {
		if(language.getName()=="")
			throw new Exception("name can not be empty");
		Language findLanguage=this.getAll().stream().filter(item->language.getName()==item.getName()).findAny().orElse(null);
		if(findLanguage!=null)
			throw new Exception("can not be dublicated language");
		languageRepository.add(language);
		
	}
	@Override
	public void delete(Language language) {
		languageRepository.delete(language);
		
	}
	@Override
	public void update(Language language) {
		languageRepository.update(language);
		
	}
	@Override
	public Language getById(int id) {	
		return languageRepository.getById(id);
	}

}
