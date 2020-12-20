import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class numberTypes {
	private ArrayList<Integer> series;
	private String nameType;
	private int answer;

	public numberTypes(ArrayList<Integer> tempSeries, String nameType){//may have a problem with the clone being a reference instead of real copy
        //for(int i = 0; i < tempSeries.size(); i++){
        //    this.series.add(tempSeries.get(i));
        //}
        //this.series.addAll(tempSeries);
        this.series = tempSeries;
		this.nameType = nameType;
		//series.trimToSize();
	}


	public String GenerateQuestion(){
        //series.trimToSize();
		int[] list = new int[3];
		Random rand = new Random();
		int chooser = rand.nextInt(3) + 1;
		int n = rand.nextInt(series.size());
		if(chooser == 1){//pick one of three
			int non1 = 0;
			int non2 = 0;
			/*do{
				non1 = rand.nextInt(series.get(series.size() - 1));
				non2 = rand.nextInt(series.get(series.size() - 1));
            } while(series.indexOf(non1) != -1 || series.indexOf(non2) != -1);
            */
            non1 = series.get(rand.nextInt(series.size() - 1));
            non2 = series.get(rand.nextInt(series.size() - 1));
            while(non2 == non1){
                non2 = series.get(rand.nextInt(series.size() - 1));
            }
			list[0] = non1;
			list[1] = non2;
			list[2] = series.get(n);
			Arrays.sort(list);
			answer = series.get(n);
			return ("Which of these numbers is a " + nameType + " number? " + list);

		}
		if(chooser == 2){//what is the nth number type
            answer = series.get(n);
            return ("What is the " + n + "th " + nameType + "?");
		}
		if(chooser == 3){//what doesn't belong
			int non1 = 0;
			int n2 = rand.nextInt(series.size());
			do{
				non1 = rand.nextInt(series.get(series.size() - 1));
			}while(series.indexOf(non1) != -1 || n2 == n);
			list[0] = non1;
			list[1] = series.get(n2);
			list[2] = series.get(n);
			Arrays.sort(list);
			answer = non1;
			return ("Which of these numbers is not a " + nameType + " number? " + list);
		}
		return "";
	}

	public int getAnswer(){
        return answer;
	}

}
