class Grade extends Student{
   private int score;
   Grade (String fname, String lname, int p, int score){
       super(fname,lname,p);
       this.score=score;
   }
   public char calculate(){
       char g='F';
       if(this.score<40){
           g='D';
       }else if(this.score<60){
           g='B'; 
       }else if(this.score<75){
           g='A';  
       }else if(this.score<90){
           g='E';
       }else if(this.score<=100){
           g='O';
       }
       return g;   
   }
}
