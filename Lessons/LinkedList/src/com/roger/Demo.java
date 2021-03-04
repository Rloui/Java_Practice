package com.roger;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>(); // instantiates a linkedlist
        printList(placesToVisit);

        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        printList(placesToVisit);


        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) { // takes a linkedlist as a parameter
        Iterator<String> i = linkedList.iterator(); // applies Iterator interface and iterator to linkedlist
        while(i.hasNext()) { // while element in the linked list has a next link in list the code block will excecute
            System.out.println("Now visiting " + i.next()); // returns the current entry and them moves on to the next
        }
        System.out.println("=======================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator(); // applies ListIterator to linked list and has built in functionality to let you minipulate data in list

        while (stringListIterator.hasNext()) { // returns true if linkedlist has a next element
            int comparison = stringListIterator.next().compareTo(newCity); // this one points to the first entry

            if(comparison == 0) {
                // equal, do not add cause they are the same
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) { // The result is a negative integer if this String object lexicographically precedes the argument string.
                // newCity should appear before this one
                // need to move back to previous city and and insert there
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) { // The result is a positive integer if this String object lexicographically follows the argument string.
                // move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()) { // returns true if collection is empty
            System.out.println("No cities in the itenerary");
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                            System.out.println("ran listitorator.next");
                        }
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            System.out.println("ran listIterator.previous");
                        }
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" + "1 - got to next city\n" + "2 - go to previous city\n" + "3 - print menu options");

    }



























}
