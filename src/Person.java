/*Person
Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
 */

public class Person {
        String firstName;
        String lastName;
        int age;

        public static void main(String[] args) {
            Person person = new Person();
            person.setFirstName("");
            person.setLastName("");
            person.setAge(10);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setFirstName("John"); // firstName is set to John
            person.setAge(18);
            System.out.println("fullName= " + person.getFullName());
            System.out.println("teen= " + person.isTeen());
            person.setLastName("Smith"); // lastName is set to Smith
            System.out.println("fullName= " + person.getFullName());

        }
        public String getFirstName(){
            return firstName;
        }
        public String getLastName(){
            return lastName;
        }
        public int getAge(){
            return age;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName.isEmpty() ? "" : firstName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName.isEmpty() ? "" : lastName;
        }
        public void setAge(int age){
            this.age = (age >= 0 && age <= 100) ? age : 0;
        }
        public boolean isTeen(){
            return (age > 12 && age < 20);
        }
        public String getFullName() {
            if (firstName.isEmpty() && lastName.isEmpty()) {
                return "";
            } else if (firstName.isEmpty()) {
                return lastName;
            } else if (lastName.isEmpty()) {
                return firstName;
            } else {
                return firstName + " " + lastName;
            }

        }
    }

