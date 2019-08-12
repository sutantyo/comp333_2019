package week3;

public class MinInitialValue {

	
	/* Outline of the algorithm using an example
	 * 
	 * trajectory = [-2,3,-4,5,-2,1] 
	 * 
	 * important variables:
	 * - energy      : used to keep track of how much energy we have left
	 * - initialLevel: how much initial energy level we need to complete the
	 *                 trajectory
	 * 
	 * at i = 1 (trajectory = 3)
	 * 
	 * At the point of first ascend, we gained 2 energy but need 3 to ascend,
	 * so we have to increase our initial level to 1. After the ascend, we have
	 * 0 energy left
	 * 
	 * at i = 3 (trajectory = 5)
	 * 
	 * We need 5 energy to ascend but have gained only 4 in the previous 
	 * descent, so we need to increase initial level by 1 again. 
	 * 
	 * at i = 5 (trajectory = 1)
	 * 
	 * We need 1 energy to ascend, but we gained 2 energy in the preceding
	 * descent
	 * 
	 * Hence we can complete the trajectory if our initial level of energy 
	 * is 2. Max energy level must also be 5 or more since we need 5 energy
	 * to ascend at some point
	 */
	
	public static int findInitialValue(int[] s, int maxLevel) {
		// this is our starting value for the initial energy level
		// (we assume we can complete the trajectory with 0 initial level)
		int initialLevel = 0;
		
		// we use this to keep track of our energy level at each ascent/descent
		int energy = 0;

		for (int i = 0; i < s.length; i++) {
			// debug line, uncomment to see progress
			// System.out.println("energy: " + energy + " start: " + initialLevel);

			int trajectory = s[i];

			// case 1: current trajectory is positive, we need to ascend 
			// and expend energy
			if (trajectory > 0) {

				if (s[i] > maxLevel) {
					// we cannot use more energy than the energy limit, 
					// so if we have to ascend more than m, we cannot complete 
					// the trajectory
					return -1;
				}

				if (energy < s[i]) {
					// if at any time we don't have enough fuel to complete the
					// current trajectory, we have to increase the initial 
					// battery level by the deficit
					int deficit = (s[i] - energy);
					initialLevel = initialLevel + deficit;
					energy = 0;

					// however if we need more initial energy than max energy
					// level, this means we cannot complete the trajectory
					if (initialLevel > maxLevel) {
						return -1;
					}
				}

				// otherwise if we have enough energy, simply deduct 
				// the cost of ascending
				else {
					energy = energy - trajectory;
				}
			}
			// case 2: current trajectory is negative, we descend and 
			// gain energy (up to maximum capacity)
			else {
				energy = Math.min(maxLevel, energy - trajectory);
			}
		}
		return initialLevel;
	}
}