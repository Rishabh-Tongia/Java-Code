class Market {
    String fruits[];
    int stock[];
    int capacity;
    Market(String f[], int cap) {
        fruits = f;
        stock = new int[f.length];
        capacity = cap;
    }

    synchronized void produce(String fruit, int qty) {
        int i = indexOf(fruit);
        while (totalStock() + qty > capacity) {
            try { wait(); } catch(Exception e){}
        }
        stock[i] += qty;
        System.out.println(Thread.currentThread().getName()+" produced "+qty+" "+fruit+"(s). Stock now: "+stock[i]);
        notifyAll();
    }

    synchronized void consume(String fruit, int qty) {
        int i = indexOf(fruit);
        while (stock[i] < qty) {
            try { wait(); } catch(Exception e){}
        }
        stock[i] -= qty;
        System.out.println(Thread.currentThread().getName()+" bought "+qty+" "+fruit+"(s). Stock now: "+stock[i]);
        notifyAll();
    }

    int indexOf(String fruit) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(fruit)) return i;
        }
        return -1;
    }

    int totalStock() {
        int sum = 0;
        for (int i = 0; i < stock.length; i++) sum += stock[i];
        return sum;
    }
}

class Farmer implements Runnable {
    Market m;
    String fruit;
    Thread t;
    Farmer(Market m, String fruit, String name) {
        this.m = m;
        this.fruit = fruit;
        t = new Thread(this);
        t.setName(name);
        t.start();
    }
    public void run() {
        for (int round = 0; round < 5; round++) {
            int qty = (int)(Math.random()*5)+1;
            m.produce(fruit, qty);
            try { Thread.sleep(500); } catch(Exception e){}
        }
    }
}

class Consumer implements Runnable {
    Market m;
    String fruit;
    Thread t;
    Consumer(Market m, String fruit, String name) {
        this.m = m;
        this.fruit = fruit;
        t = new Thread(this);
        t.setName(name);
        t.start();
    }
    public void run() {
        for (int round = 0; round < 5; round++) {
            int qty = (int)(Math.random()*3)+1;
            m.consume(fruit, qty);
            try { Thread.sleep(800); } catch(Exception e){}
        }
    }
}

public class Multithreading2 {
    public static void main(String args[]) {
        String fruits[] = {"Apple","Banana","Orange"};
        Market m = new Market(fruits, 20);
        new Farmer(m, "Apple", "Farmer1");
        new Farmer(m, "Banana", "Farmer2");
        new Farmer(m, "Orange", "Farmer3");
        new Consumer(m, "Apple", "Consumer1");
        new Consumer(m, "Banana", "Consumer2");
        new Consumer(m, "Orange", "Consumer3");
    }
}

