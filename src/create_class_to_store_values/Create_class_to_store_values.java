/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package create_class_to_store_values;

/**
 *
 * @author Muslim
 */
public class Create_class_to_store_values {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        class personInfo{
           private String name;
           private Gender gender;
           private int age;
           private String height;
           private string weight;
           public PersonInfo(String name, String gender, String age, String height, String weight) {
               super();
               this.name=name;
               this.gender = Gender.NA;
               if (gender .equalsIgnoreCase("M" )) {
                   this.gender = Gender.MALE;
                 else if (gender . equalsIgnoreCase("F") ) {
                    this.gender = Gender.FEMALE;
                         }
               try{
                  this . age = Integer.valueOf(age. replaceAll("s", ""));
               }
                 catch (Exception e) {
                   this . age = -1;
                 }
               try {

                   this.height = Integer . valueOf(height. replaceAll("s", ""));
               }
                  catch (Exception e) {
                    this . height = -1;
                  }
               try {
                  this.weight = Integer . valueOf (weight. replaceAll("s", ""));
               }
                 catch (Exception e){
                   this.weight = -1;
                 }

       public String getName ( ) {
            return name:

        // TODO code application logic here
    }
    
}
