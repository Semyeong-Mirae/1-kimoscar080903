
// class Person {
//     String name = "세명";

//     void introduce() {
//         System.out.println("이름: " + name);
//     }
// }

// class Student extends Person {
//     int grade = 2;

//     @Override
//     void introduce() {
//         super.introduce();
//         System.out.println("학년: " + grade);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.introduce();
//         }
//     }
// class Animal {
//     void speak(){
//         System.out.println("동물이 소리를 냅니다");
//     }
// }
// class Dog extends Aniaml{
//     @Override
//     void speak(){
//         super.speak();
//         System.out.println("멍멍!");
//     }
// }
// class Person {
//     String name = "세명";

//     void introduce(){
//         System.out.println("이름: " + name);
//     }
// }

// class Student extends Person{
//     int grade = 2;

//     @Override
//     void introduce(){
//         super.introduce();
//         System.out.println( "학년: " + grade);
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.introduce(); 
//     }
// }

// class Animal {
//     void speak(){
//         System.out.println("동물이 소리 냄");
//     }
// }
// class Dog extends Animal {
//     void speak(){
//         System.out.println("멍멍!");
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//         Animal a = new Dog();
//         a.speak();
//     }
// }

// class Animal {
//     public void speak(){
//         System.out.println("동물이 소리를 냅니다.");
//     }
// }
// class Cat extends Animal {
//     @Override
// }

// class Aniaml{
//     void speak(){
//         System.out.println("동물이 소리를 냅니다.");
//     }
// }
// class Dog extends Aniaml{
//     void bark(){
//         System.out.println("멍멍!");
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         Animal a = new Dog();

//         a.speak();

//         Dog d = (Dog)a;
//         d.bark();
//     }
// }

// abstract class Shape{
//     abstract double getArea();
// }

// class Circle extends Shape {
//     double redius = 2.0;
//     double getArea(){
//         return 3.14 * radius * radius;
//     }
// }
// class Rectangle extends Shape{
//     int width = 3, height = 4;
//     double get
// }

// abstract class Person {
//     String name;

//     Person(String name){
//         this.name = name;
//     }
//     abstract void printInfo();
// }
// class Student extends Person{
//     int grade;

//     Student(String name, int grade){
//         super(name);
//         this.grade = grade;
//     }

//     @Override
//     void printInfo(){
//         System.out.println("학생 이름: " + name + ", 학년: " + grade);
//     }
// }

// class Teacher extends pe
// interface USB {
//     void connect();
// }
// class Mouse implements USB{
//     public void connect(){
//         System.out.println("마우스를 연결합니다");
//     }
// }
// class Keyboard implements USB{
//     public void connect(){
//         System.out.println("키보드를 연결합니다");
//     }
// }
// public class Main{
//     public static void main(String[] args) {
//         USB device = new Mouse();
//         device.connect();
//     }
// }
import java.util.Scanner;

interface Calculator{
    int add(int a, int b);

    default int multiply(int a, int b){
        return a * b;
    }
    static int subtract(int a, int b){
        return a - b;
    }
}
class SimpleCalculator implements Calculator {
    @Override
    public int add(int a, int b){
        return a+ b;
    }
}

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calc.add(a,b));
        System.out.println(calc.multiply(a,b));
        System.out.println(Calculator.subtract(a,b));
    }
}