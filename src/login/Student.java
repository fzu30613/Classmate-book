package login;

/**
 * 
 * @author zsl
 *
 */
 
public class Student {
    private String phone;
    private String name;
    private String sno;
    private String address;
    private String vx;
    private String QQ;
    private String text;
    private String email;
     
    public String getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }
    public void setId(String phone) {
        this.phone = phone;
    }
    public String getVx() {
        return vx;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public String getQQ() {
        return QQ;
    }
    public String getSno() {
        return sno;
    }
    public String getText() {
        return text;
    }
    public String getemail() {
        return email;
    }
    public void setSex(String address) {
        this.address = address;
    }
    public Student(String name1,String sno1,String address1,String phone1,String vx1,String email1,String QQ1,String text1){phone=phone1;email=email1;name=name1;QQ=QQ1;vx=vx1;address=address1;text=text1;sno=sno1;}
}