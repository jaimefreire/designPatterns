package eu.jaimefreire.patterns.structural.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommandQueue {

    public static List produceRequests() {
        List queue = new ArrayList();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }

    //All requests implement the Command interface behavior
    public static void workOffRequests(List queue) {
        for (Iterator it = queue.iterator(); it.hasNext(); )
            ((Command) it.next()).execute();
    }

    public static void main(String[] args) {
        List queue = produceRequests();
        workOffRequests(queue);
    }

    interface Command {
        void execute();
    }

    static class DomesticEngineer implements Command {
        public void execute() {
            System.out.println("take out the trash");
        }
    }

    static class Politician implements Command {
        public void execute() {
            System.out.println("take money from the rich, take votes from the poor");
        }
    }

    static class Programmer implements Command {
        public void execute() {
            System.out.println("sell the bugs, charge extra for the fixes");
        }
    }
}