import java.util.Scanner;

// Person 클래스 (name 필드 포함)
class Person {
    protected String name;

    public Person(){
        name == "";
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
}

// 생성자 + 기본 생성자 모두 구현

// 최대 10명의 직원 정보 저장할 수 있는 Employee 배열 생성

// 사용자로부터 직원수 입력받기
// 각 직원에 대해 name, ssn, 급여 정보 입력받아 배열에 저장

// 예외처리 구현 X
