public class Competition {
    public int comp_id;
    private String comp_name;
    public String startdate;
    public String enddate;
    public String registration_time;
    public String comp_time;
    public String id_user;
    
    public Competition(int compid, String compname, String start, String end, String registtime, String comptime) {
        this.comp_id = compid;
        this.comp_name = compname;
        this.startdate = start;
        this.enddate = end;
        this.comp_time = comptime;
        
    }
    
    public void setcompid(int compid){
           this.comp_id = compid;
    }
    
    public void setcompname(String compname){
           this.comp_name = compname;
    }
    
    public void setstart(String start){
           this.startdate = start;
    }
    
    public void setend(String end){
           this.enddate = end;
    }
    
    public void setcomptime(String comptime){
           this.comp_time = comptime;
    }
    
    public void printCompBasic() {
        System.out.println("Competition ID : " + this.comp_id);
        System.out.println("Competition : " + this.comp_name);
        System.out.println("Registration Start : " + this.startdate);
        System.out.println("Registration End : " + this.enddate);
        System.out.println("Competition At : " + this.comp_time);
        
    }
}
