package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaChallengeTest {

	private static final List<Object> input =
			Arrays.asList(
					"1",
					2.,
					3,
					Arrays.asList(
							Arrays.asList(
									"4",
									5.,
									6,
									Arrays.asList()
							),
							"7",
							Arrays.asList(
									8.,
									9
							)
					)
			);

	private static final Map<String, Object> output =
			Map.of(
					"Double", 15.,
					"Integer", 18,
					"String", "12"
			);

	void testSolution(Solution solution) {
		var result = solution.sumObjects(input);
		System.out.println(result);
		assertEquals(output.get("Double"), result.getOrDefault("Double", 0.));
		assertEquals(output.get("Integer"), result.getOrDefault("Integer", 0.));
		assertEquals(output.get("String"), result.getOrDefault("String", "0"));
	}

	@Test
	void solution1() {
		testSolution(new Solution1());
	}

	public interface Solution {
		Map<String, Object> sumObjects(List<Object> list);
	}

	public static class Solution1 implements Solution {
		@Override
		public Map<String, Object> sumObjects(List<Object> list) {
			return Collections.emptyMap(); // TODO: implement me
		}
	}

}
