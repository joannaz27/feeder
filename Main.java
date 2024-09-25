public class Main {
    public static void main(String[] args)
    {
        //test 1
        Feeder a = new Feeder(2400);
        a.simulateOneDay(10);
        System.out.println(a);
        System.out.println("Days: " + a.simulateManyDays(10, 4));

        //test 2
        Feeder b = new Feeder(250);
        b.simulateOneDay(10);
        System.out.println(b);
        System.out.println("Days: " + b.simulateManyDays(10, 5)); 

        //test 3
        Feeder c = new Feeder(0);
        c.simulateOneDay(5);
        System.out.println(c);
        System.out.println("Days: " + c.simulateManyDays(5, 10)); 
        
        //test 4
        Feeder d = new Feeder(1200);
        d.simulateOneDay(8);
        System.out.println(d);
        System.out.println("Days: " + d.simulateManyDays(8, 4));

        //test 5
        Feeder e = new Feeder(2300);
        e.simulateOneDay(9);
        System.out.println(e);
        System.out.println("Days: " + e.simulateManyDays(9, 6)); 

        //test 6
        Feeder f = new Feeder(10);
        f.simulateOneDay(15);
        System.out.println(f);
        System.out.println("Days: " + f.simulateManyDays(15, 10)); 


    }
}
