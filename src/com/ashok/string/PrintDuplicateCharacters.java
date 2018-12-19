package com.ashok.string;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		printDuplicate("helloashok");
	}

	private static void printDuplicate(String string) {

		String[] stringarray = string.split("");

		Map<String, Long> map = Arrays.stream(stringarray)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		map.forEach((k, v) -> System.out.println(k + " : " + v));
	}

}
