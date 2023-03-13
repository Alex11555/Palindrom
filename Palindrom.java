 class Palindrom{
 private int Verificare(int x)
 {
	 int ogl=0,cx=x;
	 while(cx>0)
	 {
		 ogl=ogl*10+(cx%10);
		 cx=cx/10;
	 }
	 if(x==ogl)
		 return 1;
	 else
		 return 0;
 }
 private int x;
 public Palindrom(){
	 this.x=0;
 }
 public Palindrom(int y)
 {
	 this.x=y;
 }
 
 public void Setter(int z)
 {this.x=z;
 }
 public int Rez()
 {
	 return Verificare(this.x);
 }
 }
 