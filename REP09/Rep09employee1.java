import java.util.Scanner;

// Person 클래스 (name 필드 포함)
class Person {
    protected String name;

    // 생성자 + 기본 생성자 모두 구현
    public Person(){
        name = "";
    }

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}

// Employee 클래스 (Person 클래스 상속받기, ssn, salary를 필드 포함)
class Employee extends Person {
    private String ssn;
    private double salary;

    // 생성자 + 기본 생성자 모두 구현
    public Employee(){
        super();
        ssn = "";
        salary = 0.0;
    }

    public Employee(String name, String ssn, double salary){
        super(name);
        this.ssn = ssn;
        this.salary = salary;
    }
    
    public String getSsn(){
        return ssn;
    }

    public void setSsn(String ssn){
        this.ssn = ssn;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}

// 예외처리 구현 X
public class Rep09employee1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        
        // 최대 10명의 직원 정보 저장할 수 있는 Employee 배열 생성
        Employee[] employee = new Employee[10];

        // 사용자로부터 직원수 입력받기
        int count;
        System.out.print("How many employee? (max 10): ");
        count = s.nextInt();
        s.nextLine();

        // 각 직원에 대해 name, ssn, 급여 정보 입력받아 배열에 저장
        for(int i = 0; i < count; i++){
            System.out.println();
            System.out.println("Entering data for employee " + (i+1));
            System.out.println("Enter name: ");
            String name = s.nextLine();
            System.out.println("Enter SSN (no dashes or spaces): ");
            String ssn = s.nextLine();
            System.out.println("Enter salary: ");
            double salary = s.nextDouble();
            s.nextLine();

            employee[i] = new Employee(name, ssn, salary);
        }
        s.close();
    }
}

