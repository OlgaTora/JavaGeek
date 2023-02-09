package Seminar6;

import java.util.List;

public class CatGroup {
    private int id;
    private String name;
    private double age;
    private String sex;
    private double weight;
    private double height;
    private String owner;


    public CatGroup(String name, Double age, String sex, int id) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
    }


  //  public List<List<String>> getMedicalHistory() {
    //    return null;
   // }

//    public void getMassCoef (){
  //      System.out.println(height/weight);
    //}
//}

    public void printInfo() {
        System.out.printf("NAME: %s, AGE: %s, ID: %s%n", name, age, id);
    }
//
//    @Override
//    public String toString() {
//        return "CatGroupTwo: " + "name='" + name + '\'' + ", age=" + age + ",  id=" + id + ", " +
//                "height=" + height + ", weight=" + weight + '\'' + ", owner=" + owner;
//    }
}
