class InfoAbtPsngr{
    private String name;
    private String IIN;
    private int age;
    private String surname;
    public InfoAbtPsngr (String name,String IIN,int age,String surname ){
        this.age = age;
        this.IIN = IIN;
        this.name = name;
        this.surname = surname;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getIIN(){
        return IIN;
    }
    public void setIIN(String IIN){
        this.IIN = IIN;
    }
    public String getsurname(){
        return surname; 
    }
    public void setsurname(String surname){
        this.surname = surname; 
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age = age;
    }
    }
    class Price {
        private int Km;
        final int PriсeFor100km = 100;
        public Price(int Km){
            this.Km = Km; 
        }
        public void setKm(int Km){
            this.Km = Km;
        }
        public int getPriсeFor100km() {
            return PriсeFor100km;
        }
        public int getKm(){
            return Km * PriсeFor100km ;
        }
    } 
    class DirectionandData{
        private String city1;
        private String city2;
        private String data;
        public DirectionandData(String city1,String data,String city2){
            this.city1 = city1;
            this.city2 = city2;
            this.data = data;
        }
    
        public String getData() {
            return data;
        }
    
        public void setData(String data) {
            this.data = data;
        }
    
        public String getCity2() {
            return city2;
        }
    
        public void setCity2(String city2) {
            this.city2 = city2;
        }
    
        public String getCity1() {
            return city1;
        }
    
        public void setCity1(String city1) {
            this.city1 = city1;
        }
    }
    public class assignment1{
        public static void main(String[] args) {
            InfoAbtPsngr passenger = new InfoAbtPsngr("Tamerlan","061018500689",18,"Ibragimov");
            Price price = new Price(1200);
            DirectionandData c = new DirectionandData("Astana","24th December","Taldykorgan");
            System.out.println("Full name:" +" "+ passenger.getname()+" "+passenger.getsurname());
            System.out.println("your IIN:" +" "+ passenger.getIIN());
            System.out.println("age:" +" "+ passenger.getage());
            System.out.println("direction from:" +" "+ c.getCity1() +" "+ "to" +" "+ c.getCity2() +" "+ "at" + " " +c.getData());
            System.out.println("Overall price is:" +" "+ price.getKm()+" "+"tenge");
            System.out.println("Have a nice trip");
        }
    }
