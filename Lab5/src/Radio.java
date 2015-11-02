/**
 * A class that simulates a radio that you can tune to
 * a particular frequency and then listen to.
 **/

public class Radio
{
    private float frequency;

    /**
     * These constants are private, the static method frequencyOfBBC
     * should be used to access these values.
     *
     **/

    private final static float BBC_R1 = 97.9f;
    private final static float BBC_R2 = 88.3f;
    private final static float BBC_R3 = 90.5f;
    private final static float BBC_R4 = 92.7f;


    public final static float CLASSIC_FM = 100.1f;
    public final static float BRMB = 96.4f;

    public static float frequencyOfBBC( int channel )
    {
        switch ( channel )
        {
            case 1:
                return BBC_R1;
            case 2:
                return BBC_R2;
            case 3:
                return BBC_R3;
            case 4:
                return BBC_R4;
            default:
                return 0.0f;
        }
    }

    public void setFrequency( float freq )
    {
        frequency = freq;
    }


    public float getFrequency()
    {
        return frequency;
    }

    /**
     * Listen to the radio.  This method prints out what
     * you hear on the frequency that the radio's tuned to.
     *
     **/

    public void listen()
    {
        if ( frequency == BBC_R1 )
            System.out.println( "Mark and Lard's Breakfast Show" );
        else if ( frequency == BBC_R2 )
            System.out.println( "Wogan here..." );
        else if ( frequency == BBC_R3 )
            System.out.println( "...and that was Tchiakovsky's..." );
        else if ( frequency == BBC_R4 )
            System.out.println( "Welcome to the Today programme." );
        else if ( frequency == CLASSIC_FM )
            System.out.println( "next up, Beethoven" );
        else if ( frequency == BRMB )
            System.out.println( "MMMbop!" );
        else
            System.out.println( "Fffzzzzzzzzzzzksssssssshhhhhchf" );
    }
}

