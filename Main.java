public class Main {

    public static void main(String[] args) {

        // Creating persons
        Person p1 = new Person(
            "Ahmed",
            "35202-1234567-1",
            "03001234567"
        );

        Person p2 = new Person(
            "Ali",
            "35202-7654321-2",
            "03111234567"
        );


        // Creating Block A
        Block b1 = new Block("A", 4);

        // Adding plots to Block A
        b1.addPlots(
            new Plot(
                1,
                PlotType.residential,
                new Circle(5),
                p1
            )
        );

        b1.addPlots(
            new Plot(
                2,
                PlotType.commercial,
                new Square(4),
                p2
            )
        );

        b1.addPlots(
            new Plot(
                3,
                PlotType.residential,
                new Rectangle(6, 3),
                p1
            )
        );

        b1.addPlots(
            new Plot(
                4,
                PlotType.centre,
                new Circle(3),
                p2
            )
        );


        // Display Block A
        System.out.println("BlockA");
        b1.DisplayBlock();


        // Calculate areas of Block A
        System.out.println("\n AREAS ");
        b1.CalculateBarea();


        // Creating Block B
        Block b2 = new Block("B", 2);

        b2.addPlots(
            new Plot(
                5,
                PlotType.residential,
                new Square(5),
                p1
            )
        );

        b2.addPlots(
            new Plot(
                6,
                PlotType.commercial,
                new Rectangle(10, 4),
                p2
            )
        );


        // Creating Housing Society
        Housing h = new Housing("LDA Housing", 2);


        // Adding blocks to Housing
        h.addblock(b1);
        h.addblock(b2);


        // Display complete society
        System.out.println("\nHOUSING SOCIETY ");
        h.DisplayS();


        // Calculate areas of all blocks
        System.out.println("\n ALL BLOCK AREAS ");
        h.DisplayAllAreas();
    }
}