package stringBuilder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import springbuilderexercises.SpringBuilderExamples;

class StringBuilderExerciseTest {

	@Test
	void test() {
		SpringBuilderExamples exmp= new SpringBuilderExamples();
		Assert.assertEquals("Hello, David!", exmp.hello("David"));
		
	}

}
