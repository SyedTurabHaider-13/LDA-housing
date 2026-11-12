public class Housing{
  private String SocietyName;
  private Block[] blocks;
public int bcount=0;
 Housing(String name,int ammount){
      this.SocietyName=name;
       blocks=new Block[ammount];
for(int i=0;i<blocks.length;i++){
     blocks[i]=null;
}
}
public Block addblock(Block b){
   if(b!=null && bcount<blocks.length){
        blocks[bcount]=b;
        bcount++;
        return b;
}
return null;
}

public void DisplayS(){
  System.out.println("Society name:"+SocietyName);
  for(int i=0;i<bcount;i++){
         blocks[i].DisplayBlock();
}
}

public void DisplayAllAreas(){
       System.out.println("AllAreas of all blocks");
   for(int i=0;i<bcount;i++){
            blocks[i].CalculateBarea();
}
}
}
