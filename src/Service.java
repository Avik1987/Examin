public class Service {
    Model model = new Model();

    public void Task1(Model a) {
        model.printInfo();

    }

    ;

    public void task2(Model a) {
        if (a.isMilitary()) {
            System.out.println(a.getCost());
            System.out.println(a.getTopSpeed());
        } else System.out.println(a.getCountry());
        System.out.println(a.getModel());
    }

    public Model task3(Model a, Model b) {
        if (a.getYear() == b.getYear()) {
            return a;
            if (a.getYear() > b.getYear()) {
                return b;
            } else return a;

        }
    return  a;}

    public Model task4(Model a, Model b) {
        if (a.getWingspan() > b.getWingspan()) {
            return a;
        }
        if (a.getWingspan() == b.getWingspan()) {
            return b;
        } else return b;

    }

    public void task5(Model a, Model b, Model c) {
        if (a.getSeats() < b.getSeats() && a.getSeats() < c.getSeats()) {
            System.out.println(a.getCountry());
        } else if (b.getSeats() < a.getSeats() && b.getSeats() < c.getSeats()) {
            System.out.println(b.getCountry());
        } else System.out.println(c.getCountry());
        if (a.getSeats() == b.getSeats() && b.getSeats() == c.getSeats()) {
            System.out.println(a.getCountry());
        }
    }

    public void task6(Model[] a) {
        for (Model model : a) {
            if (model.isMilitary()) {
                model.printInfo();
            }
        }
    }

    public void task7(Model[] a) {
        for (Model model : a) {
            if (model.isMilitary()) {
                if (model.getHours() > 100) {
                    model.printInfo();
                }
            }

        }
    }

    public Model task8(Model[] a) {
        Model min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.getWeigth() > a[i].getWeigth()) {
                min = a[i];
            }
        }
        for (Model model1 : a) {
            if (min.getWeigth() == model1.getWeigth()) {
                min.printInfo();
            }

        }
        return min;
    }

    public void task10(Model[] a) {
        Model temp = null;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i - 1].getYear() > a[i].getYear()) {
                    temp = a[i];
                    a[i - 1] = a[i];
                    a[i - 1] = temp;


                }

            }
        }


    }
}


