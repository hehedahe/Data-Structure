package com.ds;

public class Test {

  // null --> null Type
  // int --> Integer
  public static void main(String[] args) {
    User user = new User();
    user.setId(null);
    user.setName("채다해");
    // ---------------------------------- db 

    //        if ("1".equals(user.getId())) {
    //    if (user.getId().equals("1")) {

    //    if (1 == user.getId()) {
    if (user.getId() == 1) {

      System.out.println(user.getId());
      System.out.println(user.getName());
    }


  }


  static class User {
    Integer id;
    //    String id;
    String name;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Integer getId() {
      //    public String getId() {
      return id;
    }

    public void setId(Integer id) {
      //    public void setId(String id) {
      this.id = id;
    }

  }

}
