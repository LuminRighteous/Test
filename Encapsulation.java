public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("this is the example for encapsulation");
        EncapTest t=new EncapTest();
         t.setName("Lumin");
         t.setId(11212);
         System.out.println(t);

        
    }
    
}
//Encapsulation is the process of wrapping the data member and member function together , 
//normal class provides the partial abstraction while the java bean class provides the 100% Abstraction 
//java Bean class is the class which consists of  the private data members , public setter and getter methods 
// class must be inside  the package and  implementing the serilizable interface inorder to achive the 
// persistance of data
//and public  default constructor or the default constructor 
// byApplying  the private keyword infront of  the dm  we are limiting its scope only to class and it cannot 
//access outside the class and can be accessed only trough  the setter and getter methods 
//Advantages of Encapsulation 
//provides data hiding
//provides data security 
// data can be accessed only by applying validations 
class EncapTest{
    private String name;
    private int id;

    public EncapTest(){
         
    }
    //setter methods 
    //setting name
   public void setName(String name){
      this.name=name;
   }

   //setting id

    public void setId(int id){
         this.id=id;
    }
    
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "EncapTest [name=" + name + ", id=" + id + "]";
    }

    //overriding the toString method 
    

}