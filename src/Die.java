/**
 * Created by Frank Hall on 6/25/2016.
 */
public class die
{
    private int value;
    public die()
    {
        value=((int)(Math.random()*100)%6+1);
    }
    public int getDie()
    {
        return value;
    }
}
