import java.util.ArrayList;
public class mode {
		public int getMode(ArrayList<Integer> array){
			  int mode = 0;
			  int count = 0;

			  for (int i = 0; i < array.size(); i++){
			    int x = array.get(i);
			    int tempCount = 1;

			    for(int e = 0; e < array.size(); e++){
			      int x2 = array.get(e);

			      if( x == x2)
			        tempCount++;

			      if( tempCount > count){
			        count = tempCount;
			        mode = x;
			      }
			    }
			  }

			  return mode;
			}
}
