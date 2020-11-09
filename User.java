public class User {
    public String id_user;
    private String pass_user;
    private String institute_user;
    private int identitynum_user;
    public int comp_id; 
    
    public User(String iduser, String passuser, String instituteuser, int identitynumuser) {
        this.id_user = iduser;
        this.pass_user = passuser;
        this.institute_user = instituteuser;
        this.identitynum_user = identitynumuser;
        
    }
    
    public void setuserid(String userid){
           this.id_user = userid;
    }
    
    public void setuserpass(String userpass){
           this.pass_user = userpass;
    }
    
    public void setuserinst(String userinst){
           this.institute_user = userinst;
    }
    
    public void setuseridentity(int useridentity){
           this.identitynum_user = useridentity;
    }
 
    
    public void printUserBasic() {
        System.out.println("User ID : " + this.id_user + ", from" + this.institute_user);
    }

}