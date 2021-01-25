package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics 
{
    static class Stats
    {
        public Float min=Float.NaN;
        public Float max=Float.NaN;
        public Float average=Float.NaN;
    }
    public static Stats getStatistics(List<Float> numbers) 
    {
        //implement the computation of statistics here
        Statistics.Stats s=new Stats();
        if(!numbers.isEmpty())
        {
            s.min= Collections.min(numbers);
            s.max= Collections.max(numbers);
			int listLength=numbers.size();
            Float sumofnums=0.0f;
            for(Float i:numbers){
                sumofnums+=number;
            }
            s.average=(Float)sum/listLength
        }
        return s;
        
    }
}
