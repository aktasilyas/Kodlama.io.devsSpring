package kodlama.io.devs.UI;


import java.util.List;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.business.concretes.LanguageManager;
import kodlama.io.devs.dataAccess.concretes.LanguageInMemoryRepository;
import kodlama.io.devs.entities.concretes.Language;
public class Main {

	public static void main(String[] args) {
		
		LanguageService languageService=new LanguageManager(new LanguageInMemoryRepository());
		
		//Add
		Language newLanguage=new Language(5,"Pascal");
		try {
			languageService.add(newLanguage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//GetAll
//		for (Language language : languageService.getAll()) {
//			
//			System.out.println(language.getId()+" - "+ language.getName());
//		}
		
		//Delete
//		List<Language> list=languageService.getAll();
//		languageService.delete(list.get(0));
		
		//Update
//		List<Language> list=languageService.getAll();
//		Language update=new Language(list.get(0).getId(),"Css");
//    	languageService.update(update);
		
		//getById
//		Language findLanguage=languageService.getById(2);
//		System.out.println(findLanguage.getId()+" - "+findLanguage.getName());
	for (Language language : languageService.getAll()) {			
  		System.out.println(language.getId()+" - "+ language.getName());
   	}

	}

}
