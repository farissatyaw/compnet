public class CO {
    public String id_co;
    private String pass_co;
    private String institute_co;
    private int identitynum_co;
    public int comp_id;
    
    public CO(String idco, String passco, String instituteco, int identitynumco, int comp_id) {
        this.id_co = idco;
        this.pass_co = passco;
        this.institute_co = instituteco;
        this.identitynum_co = identitynumco;
        
    }
    
    public void setcoid(String coid){
           this.id_co = coid;
    }
    
    public void setcopass(String copass){
           this.pass_co = copass;
    }
    
    public void setcoinst(String coinst){
           this.institute_co = coinst;
    }
    
    public void setcoidentity(int coidentity){
           this.identitynum_co = coidentity;
    }
 
    public void printCOBasic() {
        System.out.println("Competition Official ID : " + this.id_co + ", from" + this.institute_co);
    }
}
