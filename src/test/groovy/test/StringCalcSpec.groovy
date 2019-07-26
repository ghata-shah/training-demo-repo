package test

import spock.lang.Specification
import spock.lang.Unroll

class StringCalcSpec extends Specification {
	
	def StringCalc stringCalc = new StringCalc();
	
	@Unroll
	def "Calculate sum of numbers (#numbers)"() {
		given : "numbers as String"
			numbers
		when : "StringCalc.add(numbers) called"
			def output = stringCalc.add(numbers)
		then : "It should add numbers"
			output == expectedOutput
		where : ""
			numbers 		||	expectedOutput
			null			||		0
			""				||		0
			"1"				||		1
			"1,2"			||		3	
			"1,2,3"			||		6
			"1,2,3,4"		||		10
			"1\n2,3"		||		6
			"1\n,"			||		1
	}	
}
