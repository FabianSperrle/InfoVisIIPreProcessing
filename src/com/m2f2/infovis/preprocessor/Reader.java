package com.m2f2.infovis.preprocessor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {
	
	private final Path path;
	
	public Reader(String path) {
		this.path = Paths.get(path);
	}
	
	public Stream<String> getFileContents(String ending) throws IOException {
		return Files.walk(this.path)
				.filter(Files::isRegularFile)
				.map(Path::toFile)
				.filter(file -> file.getName().endsWith(ending))
				.map(File::toPath)
				.flatMap(this::safeLines);
	}
	
	public Map<String, Crime> getCrimes(Stream<String> stream) {
		return stream.map(line -> new Crime(line.split(",", 12)))
				.collect(Collectors.toMap(
						Crime::getId, 
						Function.identity(),
						(crime1, crime2) -> crime2
						));
	}
	
	private Stream<String> safeLines(Path path) {
		try {
			return Files.lines(path);
		} catch (IOException e) {
			throw new RuntimeException();
		}
	}
}
