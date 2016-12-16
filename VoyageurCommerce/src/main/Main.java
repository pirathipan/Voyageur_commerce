package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import model.Ville;
import model.Solution;



public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		List<Ville> Villesliste = loadDataVille();
		List<Solution> solutionsListe = generateSolution(villeliste, 10);

		System.out.println(villeliste);


	}

	private static List<Ville> populate(List<Ville> Villes) throws FileNotFoundException{
		List<Ville> tempsVilles = new ArrayList<>(Villes);

		Collections.shuffle(tempsVilles);

		return tempsVilles;
	}

	private static List<Ville> loadDataVille() throws FileNotFoundException {
		Reader reader = new FileReader(new File("./file/Ville_sample.json"));
		Gson gson = new GsonBuilder().create();

		return (List<Ville>) gson.fromJson(reader, new TypeToken<List<Ville>>(){}.getType());

	}
	
}
