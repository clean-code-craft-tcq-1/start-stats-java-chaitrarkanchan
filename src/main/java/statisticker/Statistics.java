package statisticker;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Statistics 
{
     static class Stats
    {
        public Float min=Float.NaN;
        public Float max=Float.NaN;
        public Float average=Float.NaN;
    }
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
         Statistics.stats st=new Stats();
         if(!numbers.isEmpty()){
              st.min=Collections.min(numbers);
              st.max=Collection.max(numbers);
              int listLength=numbers.size();
              Float sumofnums=0.0f;
              for(Float i:numbers){
                sumofnums+=i;
                }
            st.average=(Float)sumofnums/listLength;
               }
         return st;
  
}
