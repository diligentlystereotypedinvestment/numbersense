public class log{
	private String base;
	private String argument;

	public log(String base, String argument){
		this.base = base;
		this.argument = argument;
	}

	public int getBase(){
		return base;
	}

	public int getArg(){
		String temp = arugment;
		if(argument.index("e") != -1){
			String[] eSplit = argument.split("^");
			return Integer.valueOf(eSplit[1]);
		}
		return argument;
	}

	public static double solve(log unSimp){
		if(unSimp.toString().indexOf("e") != -1){
		}
		return Math.log(unSimp.getArg())/Math.log(unSimp.getBase());
	}
	
	public static log add(log add1, log add2){
		return new log(add1.getArg() * add2.getArg(), add1.getBase());
	}

	public static log sub(log add1, log add2){
		return new log(add1.getArg() / add2.getArg(), add1.getBase());
	}

	public static void gen(ArrayList<String> questions, ArrayList<String> answers, int i){
		Random rand = new Random();
		String base = String.valueOf(rand.nextInt(9) + 3);
		int arg1 = rand.nextInt();
		int problem = rand.nextInt(4);
		if(base.equals("11")){//e
			base = "e";
		}
		new
	}

	public String toString(){
		return "$\\log_{" + base + "}" + argument;
			
	}
}
