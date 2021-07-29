package com.feicailian.phonebook;

/**
 * 实体类——存放数据
 * 属性：
 *      private int id —— 用户id
 *      private String name ——用户姓名
 *      private String age ——用户年龄
 *      private String sex ——用户性别
 *      private String telNum ——用户电话
 *      private String address ——用户地址
 *
 * 方法：
 *      get and set
 *      无参
 *      有参( 没有id ) ————》id是动态生成的
 *      StringBuffer 重写 toString
 */
public class Person {

    /*
        属性
     */
    private int id ;
    private String name ;
    private String age ;
    private String sex ;
    private String telNum ; //为了方便 排序 和 查找 的比较内容 (手机号码为11位，超过了int类型的存储长度）
    private String address ;


    /*
        方法
     */

    public Person() {
    }

    public Person(String name, String age, String sex, String telNum, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.telNum = telNum;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer() ;
        sb.append("序号").append(this.id).append("* ").append("\t");  // \t是制表符
        sb.append("姓名").append(this.name).append("\t \t");
        sb.append("年龄").append(this.age).append("\t \t");
        sb.append("性别").append(this.sex).append("\t \t");
        sb.append("电话").append(this.telNum).append("\t \t");
        sb.append("地址").append(this.address).append("\t \t");

        return sb.toString() ;
    }
}
