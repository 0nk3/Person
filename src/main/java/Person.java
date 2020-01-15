/* ***************************************************************************
 * @author : Ndumiso Onke Fanti                                              *
 * Description:Person Class creates a person with name, age ,gender and      *
 *      multiple interests                                                   *
 * ************************************************************************* */
public class Person {

    private  String name;
    private int age;
    private String gender;
    private String[] interests;

    Person(String name, int age, String gender, String[] interests){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests = interests;
    }
    String hello(){
        return "Hello, my name is " + this.name + " and I am "+ this.age + " year old " + this.gender + ". My interests are " + this.getInterest() + "." ;
    }

    private String getInterest(){
        // reading the array with interests one by one and storing on inter for formatted output
        StringBuilder inter = new StringBuilder();
        int len = interests.length;
        // extract all the elements except the last element to carter for " and [insert last element]." like in the expected output.
        for(int i = 0 ; i < len-1; i++) {
            inter.append(interests[i]).append(", ");
        }
        return inter + "and " + interests[--len];
    }
}