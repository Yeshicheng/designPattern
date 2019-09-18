package strategy;
public class StrategyPatternDemo {

	/**
	 * @see Context
	 * @param args
	 */
	public static void main(String[] args) {
		
		Strategy mutiply = new OperationMutiply();
		Strategy add = new OperationAdd();
		Strategy substract = new OperationSubstract();
		
		
		Context context = new Context(mutiply);
		int result = context.executeStrategy(2, 3);
		System.out.println("mutiple:"+result);
		
		context = new Context(add);
		result = context.executeStrategy(2 , 3);
		System.out.println("add:"+result);
		
		context = new Context(substract);
		result = context.executeStrategy(2, 3);
		System.out.println("substract:"+result);
		
		
	}

}
