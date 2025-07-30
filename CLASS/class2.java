 abstract class game{
       abstract void play();
     
}

class cricket extends game
{
   void play()
    {
        System.out.println("Play cricket");
    }
}

class tennis extends game
{
   void play()
    {
        System.out.println("Play tennis");
    }
}

public class class2 {
    public static void main(String rgs[])
    {
    tennis t = new tennis(); 
    cricket c = new cricket();

    t.play();
    c.play();
    }
}
