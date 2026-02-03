class Student{
    private String name;
    private int rollNo;
    private int marks;
    public void setName(String n){
        this.name=n;
    }
    public void setRollno(int r){
        this.rollNo=r;
    }
    public void setMarks(int m){
        if(m>=0 && m <=100){
           this.marks=m;
        }
    }
    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollNo;
    }
    public int getMarks(){
        return marks;
    }

    public static void main(String[] args){
       Student s = new Student();

        s.setName("Aara");
        s.setRollno(101);
        s.setMarks(85);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollno());
        System.out.println("Marks: " + s.getMarks());
    }
}
