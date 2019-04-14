void setup(){
  size(1200,800);
}
void draw(){
  for(int i=100;i>0;i--){
 int radius = i*5;
if(i%2==0){
ellipse(200,400,radius,radius);      
ellipse(1000,400,radius,radius);
}  
else{
ellipse(200,400,radius,radius); 
ellipse(1000,400,radius,radius);
}
}
}