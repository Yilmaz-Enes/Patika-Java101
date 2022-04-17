public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double vergi = 0.0;
        if (this.salary > 1000.0) {
            vergi = this.salary * 0.03;
        }
        return vergi;
    }
    double bonus() {
        double bonusUcret = 0;
        if (this.workHours > 40) {
            bonusUcret += (this.workHours - 40) * 30;
        }
        return bonusUcret;
    }
    double raiseSalary() {
        double maasArtis = 0;
        if ((2022 - this.hireYear) < 10) {
            maasArtis = this.salary * 0.05;
        }
        else if ((2022 - this.hireYear) > 9 && (2022 - hireYear) < 20) {
            maasArtis = this.salary * 0.1;
        }
        else if ((2022 - this.hireYear) > 19) {
            maasArtis = this.salary * 0.15;
        }
        return maasArtis;
    }

    public void print() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaş : " + (this.salary - tax() + bonus() + raiseSalary()));

    }
}
