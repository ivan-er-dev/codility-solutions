package CyclicRotation;

class CyclicRotation {
	public int[] solution(int[] A, int K) {

		int firstValue = 0;
		int counter = 0;
		while (counter < K) {

			firstValue = A[0]; // store first number in temp
			A[0] = A[A.length - 1]; // change first number for the last

			// to traverse the array minus the first position, because is already switched
			// above
			// and that initial switch of last and first must be done in each iteration
			// before the subsequent iteration of the rest of items, which is done below:
			int temp1 = firstValue;
			int temp2 = 0;
			for (int j = 1; j < A.length; j++) { // traverse to end but begin in second place j=1

				temp2 = A[j];
				A[j] = temp1;
				temp1 = temp2;

			}

			counter++;
		}

		return A;
	}
}


