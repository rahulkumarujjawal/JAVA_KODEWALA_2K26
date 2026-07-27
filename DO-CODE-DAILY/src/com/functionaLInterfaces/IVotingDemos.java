package com.functionaLInterfaces;

interface IVotingDemo {
	int totalMarks(int java, int python, int sql);

}

public class IVotingDemos {
	public static void main(String[] args) {
		IVotingDemo votingDemo = (_java, _python, _sql) -> {
			int totalmarks = _java + _python + _sql;
			return totalmarks;

		};

		float TotalMarks = votingDemo.totalMarks(86, 76, 85);
		System.out.println("Total Marks :- " + TotalMarks);
	}

}
