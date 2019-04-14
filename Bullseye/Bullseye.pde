void setup(){
  size(800,800);
}
void draw(){
  for(int i=8;i>0;i--){
 int radius = i*100;
if(i%2==0){
fill(500,0,0);
ellipse(400,400,radius,radius);      
}  
else{
fill(0,0,0);
ellipse(400,400,radius,radius); 
}
}
}