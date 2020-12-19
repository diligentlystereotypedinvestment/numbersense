import java.util.Random;

class sequences {

    private String question;
    private String answer;
    
    public void questionGen(){//reciprocals of triangle numbers, general arithmetic, geometric, even, odd, square, cube, alternating square, first m integers
        simplify simp = new simplify();
        Random rand = new Random();
        int choose = rand.nextInt(9) + 1;
        if(choose == 1){//first m integers
            int length = rand.nextInt(30) + 10;
            question = ("1 + 2 + 3 + ... " + length + " = ");
            answer = String.valueOf((length * (length + 1)) / 2);
        }
        if(choose == 2){//first m even integers
            int length = rand.nextInt(15) + 5;
            question = ("2 + 4 + 6 + ... " + length * 2 + " = ");
            answer = String.valueOf(length * (length + 1));
        }
        if(choose == 3){//first m odd integers
            int length = 2 * (rand.nextInt(15) + 5) + 1;
            question = ("1 + 3 + 5 + ... " + length + " = ");
            answer = String.valueOf(Math.pow((length - 1)/2, 2));
        }
        if(choose == 4){//general arithmetic
            int length = rand.nextInt(3) + 5;
            int interval = rand.nextInt(7) + 3;
            int beginning = rand.nextInt(15) + 3;
            int finalnum = (interval * (length - 1) + beginning);
            question = (beginning + " + " + (interval + beginning) + " + " + (interval * 2 + beginning) + " + ... " + finalnum + " = ");
            answer = String.valueOf(((finalnum + beginning)/2) * ((finalnum - beginning)/interval + 1));
        }
        if(choose == 5){//geometric
            int denom = rand.nextInt(3) + 2;
            int num = rand.nextInt(denom - 1) + 1;
            double interval = (double)num/denom;
            int beginning = rand.nextInt(16) + 1;
            question = (beginning + " + " + simp.getFraction((num * beginning) + "/" + denom) + " + " + simp.getFraction((int)(Math.pow(num, 2) * beginning) + "/" + (int)Math.pow(denom, 2)) + " + ... = ");
            answer = simp.getFraction((beginning * denom) + "/" + (denom / num));
        }
        if(choose == 6){//first m squares
            int length = rand.nextInt(3) + 5;
            question = ("1 + 4 + 9 + ... " + (int)Math.pow(length,2) + " = ");
            answer = String.valueOf((length * (length + 1) * (2 * length + 1)) / 6);
        }
        if(choose == 7){//first m cubes
            int length = rand.nextInt(5) + 5;
            question = ("1 + 8 + 27 + ... " + (int)Math.pow(length, 3) + " = ");
            answer = String.valueOf((int)Math.pow((length * (length + 1)) / 2, 2));
        }
        if(choose == 8){//first m squares
            int length = rand.nextInt(3) + 5;
            int sign = rand.nextInt(2) + 1;
            if(sign == 0){//first sign positive
                if(length % 2 == 0){
                    question = ("1 + 4 - 9 + ... + " + (int)Math.pow(length,2) + " = ");
                    answer = String.valueOf(length * (length + 1) / 2);
                } else{
                    question = ("1 + 4 - 9 + ... - " + (int)Math.pow(length,2) + " = ");
                    answer = String.valueOf(-1 * length * (length + 1) / 2);
                }
            } else {
                if(length % 2 == 0){
                    question = ("1 - 4 + 9 - ... - " + (int)Math.pow(length,2) + " = ");
                    answer = String.valueOf(-1 * (length * (length + 1) / 2));
                } else{
                    question = ("1 - 4 + 9 - ... + " + (int)Math.pow(length,2) + " = ");
                    answer = String.valueOf(length * (length + 1) / 2);
                }
            
            }
        }
        if(choose == 1){//triangle reciprocals
            int length = rand.nextInt(2) + 5;
            question = ("$1");
            for(int i = length - 1; i > 0; i--){
                question = question + " + \\frac{1}{" + String.valueOf(i * (i-1));
            }
            question = question + " = $";
            answer = ("\\frac{)");
        }
    }
    
    public String getQuestion(){
        return question;
    }

    public String getAnswer(){
        return answer;
    }
    
    public static void main(String[] args){//testing, needs to be removed
    sequences SQL = new sequences();
        SQL.questionGen();
        System.out.println(SQL.getQuestion() + SQL.getAnswer());
    }

}
