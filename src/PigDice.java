/**
 * Created by Frank Hall on 6/25/2016.
 */
class pigDice
{
    public static void main(String[] args)
    {
        int playerTotal=0,computerTotal=0;
        boolean isDone=false;
        while(!isDone)
        {
            die d1 = new die();
            die d2 = new die();
            int v1 = d1.getDie();
            int v2 = d2.getDie();
            System.out.println("Die 1: " +v1+"\nDie 2: " +v2+"\n\n");
            if(v1 ==1 && v2==1)
            {
                playerTotal=0;
                isDone=true;
            }
            else if(v1==1 || v2 == 1)
            {
                playerTotal+=v1+v2;
                isDone=true;
            }
            else
            {
                playerTotal+=v1+v2;
            }
        }
        System.out.println("\nGame Over. Total is " + playerTotal);
    }
}
