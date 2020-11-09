public class Admin {
    private String id_admin;
    private int pass_admin;
    
    public Admin(String id_admin, int pass_admin) {
        this.id_admin = id_admin;
        this.pass_admin = 0;
    }

    public String getid_admin() {
        return this.id_admin;
    }
    
    private int getpass_admin(String id_admin){
        return this.pass_admin;
    }
    
}