package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

public class LanguageInMemoryRepository implements LanguageRepository{
	
	List<Language> list;

	public LanguageInMemoryRepository() {
		list =new ArrayList<Language>();
		list.add(new Language(1,"C#"));
		list.add(new Language(2,"Java"));
		list.add(new Language(3,"Python#"));
		list.add(new Language(4,"JavaScript"));

	}

	@Override
	public List<Language> getAll() {
		return list;
	}

	@Override
	public void add(Language language) {
		list.add(language);
	}

	@Override
	public void delete(Language language) {
		int deletedLanguage=list.indexOf(language);
		list.remove(deletedLanguage);
		
	}

	@Override
	public void update(Language language) {
		
       // list.set(0, language);
		
	}

	@Override
	public Language getById(int id) {
		
		Language findLanguage=list.stream().filter(language->id==language.getId()).findAny().orElse(null);
		return findLanguage;
	}

}
