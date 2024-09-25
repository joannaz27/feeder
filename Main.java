public class Main {
    public static void main(String[] args)
    {
            Feeder g = new Feeder(2400);
            System.out.println(g.getCurrentFood());

            g.simulateOneDay(10);
            System.out.println(g.getCurrentFood());
            System.out.println(g.simulateManyDays(10, 4));


    
    }
}
