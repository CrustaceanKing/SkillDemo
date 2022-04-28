public class SkillDemo{

    private int i;

    public SkillDemo(){
        i =0;
    }

    public int addI(int num){
        for (int k = 0; k < num; k++){
            i++;
        }
        return i;
    }

    public int getI(){
        return this.i;
    }
}