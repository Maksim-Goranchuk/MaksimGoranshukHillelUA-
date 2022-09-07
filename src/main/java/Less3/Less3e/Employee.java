package Less3.Less3e;


    public class Employee {
        public String lastname;
        public String fistname;
        public String email ;
        public int Phone ;
        public int year;

        Employee(String lastname, String fistname ,String email,int Phone,int year) {
            this.email=email;
            this.lastname=lastname;
            this.fistname=fistname;
            this.Phone = Phone ;
            this.year=year;
        }
        public String getInfo() {
            String result=lastname+" "+" "+fistname+"   "+email+" Тел "+Phone+" Возраст "+year;

            return result;

    }}





