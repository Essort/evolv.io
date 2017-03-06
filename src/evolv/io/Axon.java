package evolv.io;

class Axon {
	private static final double MUTABILITY_MUTABILITY = 0.7f;
	private static final int MUTATE_POWER = 9;

	private final double mutability;
	private final double mutateMulti;

	final double weight;

	public Axon(double w, double m) {
		weight = w;
		mutability = m;
		mutateMulti = Math.pow(0.5f, MUTATE_POWER);
	}

	public Axon mutateAxon() {
		double mutabilityMutate = Math.pow(0.5f, pmRan() * MUTABILITY_MUTABILITY);
		return new Axon(weight + r() * mutability / mutateMulti, mutability * mutabilityMutate);
	}

	private static double r() {
		return Math.pow(pmRan(), MUTATE_POWER);
	}

	private static double pmRan() {
		return Math.random() * 2 - 1;
	}
}