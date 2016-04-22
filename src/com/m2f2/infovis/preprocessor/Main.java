package com.m2f2.infovis.preprocessor;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.stream.Stream;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Reader reader = new Reader("DataComplete");
		Stream<String> crimeStrings = reader.getFileContents("street.csv");

		Map<String, Crime> crimes = reader.getCrimes(crimeStrings);
		crimeStrings.close();
		
		Gson gson = new Gson();
		Crime[] crimeArray = crimes.values().toArray(new Crime[0]);
		String json = gson.toJson(crimeArray);
		
		FileWriter writer = new FileWriter("DataComplete/crimes.json");
		writer.write(json);
		writer.close();
	}
}
