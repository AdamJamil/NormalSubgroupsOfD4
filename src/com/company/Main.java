package com.company;

public class Main
{
    Group D4 = new Group(
            new Element(0, 0),
            new Element(1, 0),
            new Element(2, 0),
            new Element(3, 0),
            new Element(0, 1),
            new Element(1, 1),
            new Element(2, 1),
            new Element(3, 1)
    );

    Main()
    {
        System.out.println(new Group(
                new Element(0, 0)
        ).isNormal());
        System.out.println(new Group(
                new Element(0, 0),
                new Element(2, 0)
        ).isNormal());
        System.out.println(new Group(
                new Element(0, 0),
                new Element(1, 0),
                new Element(2, 0),
                new Element(3, 0)
        ).isNormal());
        System.out.println(new Group(
                new Element(0, 0),
                new Element(0, 1)
        ).isNormal());
        System.out.println(new Group(
                new Element(0, 0),
                new Element(1, 1)
        ).isNormal());
        System.out.println(new Group(
                new Element(0, 0),
                new Element(2, 1)
        ).isNormal());
        System.out.println(new Group(
                new Element(0, 0),
                new Element(3, 1)
        ).isNormal());
        System.out.println(new Group(
                new Element(0, 0),
                new Element(2, 0),
                new Element(0, 1),
                new Element(2, 1)
        ).isNormal());
        System.out.println(new Group(
                new Element(0, 0),
                new Element(2, 0),
                new Element(1, 1),
                new Element(3, 1)
        ).isNormal());
        System.out.println(D4.isNormal());
    }

    public static void main(String[] args)
    {
        new Main();
    }
}
