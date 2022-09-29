class person {
    String pname;

    void input(String pname) {
        this.pname = pname;
    }

    void output() {
        System.out.println(pname);
    }
}

class vehicle extends person {
    String type;

    vehicle() { // Constructor
    }

    void input1(String type) {
        this.type = type;
    }

    void output1() {
        System.out.println(type);
    }
}

class fuel extends vehicle {
    String fuel;

    void input2(String fuel) {
        this.fuel = fuel;
    }

    void output2() {
        System.out.println(fuel);
    }
}

class region {
    String imp;

    void input3(String imp) {
        this.imp = imp;
    }

    void output3() {
        System.out.println(imp);
    }
}

class bigo {
    public static void main(String[] args) {

        person person = new person();
        person.input("Sourabh");
        person.output();

        vehicle vehicle = new vehicle();
        vehicle.input1("Honda Accord");
        vehicle.output1();

        fuel fuel = new fuel();
        fuel.input2("Diesel");
        fuel.output2();

        region imported = new region();
        imported.input3("Made in India");
        imported.output3();
        System.out.println("New");

        System.out.println();
        System.out.println();

        person.input("Sourabh");
        person.output();

        vehicle.input1("Ducati Bike");
        vehicle.output1();

        fuel.input2("Petrol");
        fuel.output2();

        imported.input3("Imported");
        imported.output3();
        System.out.println("Used");
    }
}