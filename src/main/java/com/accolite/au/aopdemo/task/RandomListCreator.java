package com.accolite.au.aopdemo.task;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomListCreator {

	private Stream<Integer> getRandomIntegerStream(Integer min, Integer max, Integer size) {
		Random random = new Random();
		Supplier<Integer> randomIntegerSupplier = () -> random.nextInt(max + 1 - min) + min;
		return Stream.generate(randomIntegerSupplier).limit(size);
	}

	public List<Integer> getRandomList(Integer min, Integer max, Integer size) {
		return getRandomIntegerStream(min, max, size).collect(Collectors.toList());
	}
}
