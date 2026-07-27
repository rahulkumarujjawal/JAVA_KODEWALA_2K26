package com.functionaLInterfaces;

interface IVoting {
	boolean checkDetails(int age, boolean hasVoterId, boolean isIndianCitizen, boolean isBlackListed);
}

public class VotingcheckDetails {
	public static void main(String[] args) {
		IVoting voting = (_age, _hasVoterId, _isIndianCitizen, _isBlackListed) -> {

			if (_age < 18) {
				System.out.println("Rejected :- You Age must be 18 or vote.");
				return false;
			}
			if (! _hasVoterId) {
				System.out.println("Rejected : Voter ID is required.");
				return false;

			}
			if (_isBlackListed) {
				System.out.println("Rejected : You are not eligable to vote ");
				return false;

			}
			System.out.println("Congratulations ! You are eligible to vote");
			
			return true;
		};

		System.out.println("--------------------------------------------------");
		voting.checkDetails(18, true, true, false);
		
		

		System.out.println("---------------------------------------------------");
		voting.checkDetails(16, true, true, false);
		
		

		System.out.println("--------------------------------------------------");
		voting.checkDetails(30, true, false, false);
		
		
		
		System.out.println("---------------------------------------------------");
		voting.checkDetails(65, true, false, true);
	}

}
