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
    
    public void output(double averageSalary) {

        System.out.println("Name: " + name);
        System.out.println("SSN: " + ssn);
        System.out.println("Salary: " + salary);

        if (salary >= averageSalary) {
            System.out.println("Salary: Above Average");
        } else {
            System.out.println("Salary: Below Average");
        }
    }
}

// 사용자 정의 예외 SSNLengthException을 구현한다
class SSNLengthException extends Exception {
    public SSNLengthException(String ssn){
        super("SSN Error: '" + ssn + "' is not 8 characters long.");
    }
}

// try catch 사용
public class Rep09Employee3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        
        // 최대 10명의 직원 정보 저장할 수 있는 Employee 배열 생성
        Employee[] employee = new Employee[10];

        // 사용자로부터 직원수 입력받기
        int count;
        System.out.print("How many employees? (max 10): ");
        count = s.nextInt();
        s.nextLine();
        
        double totalSalary = 0;

        for(int i = 0; i < count; i++){
            System.out.println();
            System.out.println("Entering data for employee " + (i+1));
            System.out.print("Enter name: ");
            String name = s.nextLine();

            // SSN 길이가 8자리가 아닐 경우 이 예외를 발생하며 다시 입력받도록 한다
            String ssn;
            while(true){
                try {
                    System.out.print("Enter SSN (no dashes or spaces): ");
                    ssn = s.nextLine();

                    if(ssn.length() != 8){
                        throw new SSNLengthException(ssn);
                    }

                    break;
                } catch (SSNLengthException e){
                    System.out.println(e.getMessage());
                    System.out.println("Please enter again.");
                }
            }

            // 급여 입력 시 숫자가 아닐 경우 일반 예외 처리하며 다시 입력 받도록 한다
            double salary;

            while(true){
                try {
                    System.out.print("Enter salary: ");
                    salary = s.nextDouble();
                    s.nextLine();
                    break;

                } catch (Exception e){
                    System.out.println("Salary Error: A non-numeric value was entered.");
                    System.out.println("Please enter again.");

                    s.nextLine();
                }
            }

            employee[i] = new Employee(name, ssn, salary);
           
            totalSalary += salary;
        }
        
        double averageSalary = totalSalary / count;
        
        System.out.println();
        System.out.println("==== Employee List and Salary Evaluation ====");
        
        for (int i = 0; i < count; i++) {

            System.out.println();
            System.out.println("Employee #" + (i + 1));

            employee[i].output(averageSalary);
        }

        s.close();
    }
}

