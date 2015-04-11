package com.weizh.wordnet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import net.didion.jwnl.JWNL;
import net.didion.jwnl.JWNLException;
import net.didion.jwnl.data.IndexWord;
import net.didion.jwnl.data.IndexWordSet;
import net.didion.jwnl.data.POS;
import net.didion.jwnl.dictionary.Dictionary;

public class WordNet2MemMap {

	static{
	      try {
			JWNL.initialize(new FileInputStream("src/main/resources/WordNetDict/file_properties.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JWNLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String arv[]) throws JWNLException{
		String[] a = {
				"src/main/resources/WordNetDict/MapDump",
				"src/main/resources/WordNetDict/file_properties.xml"
				};
		net.didion.jwnl.utilities.DictionaryToMap.main(a);
//		Dictionary instance = Dictionary.getInstance();
//		IndexWordSet thi = instance.lookupAllIndexWords("working");
//		log(thi.getIndexWordArray().length);
//		for ( IndexWord i : thi.getIndexWordArray()){
//			System.out.println(i.getLemma());
//		}
	}
	private static void log(Object a) {
		System.out.println(a);
	}
	
}
