package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Group
{
    static Group D4 = new Group(
            new Element(0, 0),
            new Element(1, 0),
            new Element(2, 0),
            new Element(3, 0),
            new Element(0, 1),
            new Element(1, 1),
            new Element(2, 1),
            new Element(3, 1)
    );

    Set<Element> elements = new HashSet<>();

    Group(Element... elements)
    {
        this.elements.addAll(Arrays.asList(elements));
    }

    boolean isNormal()
    {
        boolean isNormal = true;
        for (Element g : D4.elements)
        {
            Set<Element> leftCoset = new HashSet<>(), rightCoset = new HashSet<>();
            for (Element h : elements)
            {
                leftCoset.add(g.multiply(h));
                rightCoset.add(h.multiply(g));
            }
            isNormal &= leftCoset.equals(rightCoset);
        }
        return isNormal;
    }
}