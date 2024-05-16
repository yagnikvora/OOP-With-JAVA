interface Transport {
    void deliver();
}

abstract class Animal {
    abstract void name();
}

class Tiger extends Animal {
    void name() {
        System.out.println("Tiger");
    }
}

class Camel extends Animal implements Transport {
    void name() {
        System.out.println("Camel");
    }

    public void deliver() {
        System.out.println("Camel is delivering foods");
    }
}

class Deer extends Animal {
    void name() {
        System.out.println("Deer");
    }
}

class Donkey extends Animal implements Transport {
    void name() {
        System.out.println("Donkey");
    }

    public void deliver() {
        System.out.println("Donkey is delivering soil");
    }
}

public class Test7B3 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Tiger();
        animals[1] = new Camel();
        animals[2] = new Deer();
        animals[3] = new Donkey();

        for (Animal animal : animals) {
            animal.name();
            if (animal instanceof Transport) {
                Transport transportAnimal = (Transport) animal;
                transportAnimal.deliver();// or ((Transport) animal).deliver();
            }
            System.out.println("-------------------------");
        }
    }
}
