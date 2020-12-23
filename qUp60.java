import java.util.*;

class qUp60{
	public void Gen(ArrayList<String> questions, ArrayList<String> answers, int i){
		Random rand = new Random();
        int random = rand.nextInt(97) + 1;
        if(random < 46){
            qUp40 questions40 = new qUp40();
            questions40.Gen(questions, answers, i);
		}
    }
}
