import org.junit.function.ThrowingRunnable;

public class Addition {
    public boolean fact(String value)
    {
        for(int i=0;i<value.length()/2;i++)
        {
            if(value.charAt(i)!=value.charAt(value.length()-1-i))
            {
                return false;
            }
        }
        return true;
    }
}
